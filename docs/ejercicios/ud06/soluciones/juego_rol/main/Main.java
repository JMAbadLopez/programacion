package main;

import model.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    private static ArrayList<Personaje> personajesSueltos = new ArrayList<>();
    private static Gremio miGremio = null;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- BIENVENIDO A LA BATALLA POR EL TRONO DE CÓDIGO ---");
            System.out.println("1. Alta de Personaje");
            System.out.println("2. Crear Gremio");
            System.out.println("3. Gestión de Gremio (Añadir/Echar)");
            System.out.println("4. Entrenar (Combate)");
            System.out.println("5. Mostrar Estado");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    altaPersonaje();
                    break;
                case 2:
                    crearGremio();
                    break;
                case 3:
                    gestionGremio();
                    break;
                case 4:
                    entrenar();
                    break;
                case 5:
                    mostrarEstado();
                    break;
                case 0:
                    System.out.println("¡Hasta la próxima aventurero!");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);
    }

    private static void altaPersonaje() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Tipo: 1. Guerrero | 2. Mago | 3. Orco");
        int tipo = sc.nextInt();
        System.out.print("Nivel: ");
        int nivel = sc.nextInt();
        System.out.print("Vida: ");
        int vida = sc.nextInt();
        System.out.print("Agilidad: ");
        int agilidad = sc.nextInt();
        System.out.print("Resistencia: ");
        int resistencia = sc.nextInt();

        Personaje p = null;
        switch (tipo) {
            case 1:
                System.out.print("Furia: ");
                p = new Guerrero(nombre, vida, nivel, agilidad, resistencia, sc.nextInt());
                break;
            case 2:
                System.out.print("Maná: ");
                p = new Mago(nombre, vida, nivel, agilidad, resistencia, sc.nextInt());
                break;
            case 3:
                System.out.print("Rabia: ");
                p = new Orco(nombre, vida, nivel, agilidad, resistencia, sc.nextInt());
                break;
            default:
                p = null;
                break;
        }

        if (p != null) {
            personajesSueltos.add(p);
            System.out.println("Personaje creado con éxito.");
        }
    }

    private static void crearGremio() {
        System.out.print("Nombre del Gremio: ");
        String nombre = sc.nextLine();
        miGremio = new Gremio(nombre);
        System.out.println("Gremio '" + nombre + "' creado.");
    }

    private static void gestionGremio() {
        if (miGremio == null) {
            System.out.println("Primero debes crear un gremio.");
            return;
        }
        System.out.println("1. Reclutar personaje suelto");
        System.out.println("2. Expulsar del gremio");
        int opt = sc.nextInt();
        sc.nextLine();

        if (opt == 1) {
            if (personajesSueltos.isEmpty()) {
                System.out.println("No hay personajes sueltos disponibles.");
                return;
            }
            for (int i = 0; i < personajesSueltos.size(); i++) {
                System.out.println(i + ". " + personajesSueltos.get(i));
            }
            System.out.print("Elige índice: ");
            int idx = sc.nextInt();
            if (idx >= 0 && idx < personajesSueltos.size()) {
                Personaje p = personajesSueltos.remove(idx);
                miGremio.reclutar(p);
            }
        } else if (opt == 2) {
            ArrayList<Personaje> miembros = miGremio.getMiembros();
            if (miembros.isEmpty()) {
                System.out.println("El gremio está vacío.");
                return;
            }
            for (int i = 0; i < miembros.size(); i++) {
                System.out.println(i + ". " + miembros.get(i));
            }
            System.out.print("Elige índice: ");
            int idx = sc.nextInt();
            if (idx >= 0 && idx < miembros.size()) {
                Personaje p = miembros.get(idx);
                miGremio.expulsar(p);
                personajesSueltos.add(p);
            }
        }
    }

    private static void entrenar() {
        if (miGremio == null || miGremio.getMiembros().size() < 2) {
            System.out.println("Necesitas al menos 2 personajes en el gremio para entrenar.");
            return;
        }

        ArrayList<Personaje> combatientes = new ArrayList<>(miGremio.getMiembros());
        // El enunciado sugiere elegir dos.
        System.out.println("Elige primer combatiente:");
        for (int i = 0; i < combatientes.size(); i++) {
            System.out.println(i + ". " + combatientes.get(i).getNombre());
        }
        int c1Idx = sc.nextInt();

        System.out.println("Elige segundo combatiente:");
        for (int i = 0; i < combatientes.size(); i++) {
            System.out.println(i + ". " + combatientes.get(i).getNombre());
        }
        int c2Idx = sc.nextInt();

        if (c1Idx == c2Idx) {
            System.out.println("¡No pueden luchar contra sí mismos!");
            return;
        }

        Personaje p1 = combatientes.get(c1Idx);
        Personaje p2 = combatientes.get(c2Idx);

        System.out.println("\n--- ¡COMIENZA EL DUELO! ---");
        System.out.println(p1.getNombre() + " VS " + p2.getNombre());

        int turno = 1;
        while (p1.estaVivo() && p2.estaVivo()) {
            System.out.println("\n--- Turno " + turno + " ---");
            // Decidir orden por agilidad
            if (p1.getAgilidad() >= p2.getAgilidad()) {
                p1.atacar(p2);
                if (p2.estaVivo())
                    p2.atacar(p1);
            } else {
                p2.atacar(p1);
                if (p1.estaVivo())
                    p1.atacar(p2);
            }
            turno++;
            if (turno > 100) { // Seguro por si acaso
                System.out.println("¡Es un empate por agotamiento!");
                break;
            }
        }

        if (p1.estaVivo() && !p2.estaVivo())
            System.out.println("\n¡GANADOR: " + p1.getNombre() + "!");
        else if (p2.estaVivo() && !p1.estaVivo())
            System.out.println("\n¡GANADOR: " + p2.getNombre() + "!");
    }

    private static void mostrarEstado() {
        if (miGremio != null) {
            miGremio.mostrarMiembros();
        }
        if (!personajesSueltos.isEmpty()) {
            System.out.println("\n--- Personajes Sin Gremio ---");
            for (Personaje p : personajesSueltos) {
                System.out.println(p);
            }
        }
    }
}
