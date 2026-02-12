package main;

import exceptions.JuegoRolException;
import model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class JuegoDeRol {
    // Listas estáticas para gestionar el juego
    private static ArrayList<Jugador> jugadores = new ArrayList<>();
    private static ArrayList<Equipo> equipos = new ArrayList<>();
    private static ArrayList<Item> items = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Datos de prueba iniciales
        inicializarDatosPrueba();

        int opcion;
        do {
            mostrarMenuPrincipal();
            opcion = leerEntero("Seleccione una opción: ");
            switch (opcion) {
                case 1:
                    menuConfiguracion();
                    break;
                case 2:
                    menuCombate();
                    break;
                case 3:
                    System.out.println("¡Hasta la próxima batalla!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
    }

    private static void mostrarMenuPrincipal() {
        System.out.println("\n--- JUEGO DE ROL: TRONO DE HIERRO ---");
        System.out.println("1. Configuración (Crear Jugadores, Equipos, Items)");
        System.out.println("2. Combate (Arena)");
        System.out.println("3. Salir");
    }

    // --- MENÚ CONFIGURACIÓN ---
    private static void menuConfiguracion() {
        int opcion;
        do {
            System.out.println("\n--- CONFIGURACIÓN ---");
            System.out.println("1. Crear Jugador");
            System.out.println("2. Crear Equipo");
            System.out.println("3. Asignar Jugador a Equipo");
            System.out.println("4. Crear Item y Asignar");
            System.out.println("5. Listar Jugadores");
            System.out.println("6. Volver");
            opcion = leerEntero("Seleccione: ");

            try {
                switch (opcion) {
                    case 1:
                        crearJugador();
                        break;
                    case 2:
                        crearEquipo();
                        break;
                    case 3:
                        asignarJugadorEquipo();
                        break;
                    case 4:
                        crearYAsignarItem();
                        break;
                    case 5:
                        listarJugadores();
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Opción incorrecta.");
                }
            } catch (JuegoRolException e) {
                System.out.println("ERROR: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("ERROR INESPERADO: " + e.getMessage());
            }
        } while (opcion != 6);
    }

    private static void crearJugador() {
        System.out.println("Tipo de jugador: 1. Humano, 2. Guerrero, 3. Enemigo");
        int tipo = leerEntero("Seleccione tipo: ");
        String nombre = leerCadena("Nombre: ");
        int vida = leerEntero("Vida: ");
        int ataque = leerEntero("Puntos de Ataque (PA): ");
        int defensa = leerEntero("Puntos de Defensa (PD): ");

        Jugador nuevo = null;
        switch (tipo) {
            case 1:
                new Humano(nombre, vida, ataque, defensa);
                break;
            case 2:
                new Guerrero(nombre, vida, ataque, defensa);
                break;
            case 3:
                new Enemigo(nombre, vida, ataque, defensa);
                break;
            default:
                System.out.println("Tipo desconocido.");
                return;
        }

        // Importante: Al hacer new Humano(...) ya se crea el objeto pero no lo hemos
        // asignado a la variable 'nuevo'
        // Corrección:
        if (tipo == 1)
            nuevo = new Humano(nombre, vida, ataque, defensa);
        else if (tipo == 2)
            nuevo = new Guerrero(nombre, vida, ataque, defensa);
        else if (tipo == 3)
            nuevo = new Enemigo(nombre, vida, ataque, defensa);

        if (nuevo != null) {
            jugadores.add(nuevo);
            System.out.println("Jugador creado con éxito.");
        }
    }

    private static void crearEquipo() {
        String nombre = leerCadena("Nombre del equipo: ");
        equipos.add(new Equipo(nombre));
        System.out.println("Equipo creado.");
    }

    private static void asignarJugadorEquipo() throws JuegoRolException {
        Jugador j = seleccionarJugador();
        if (j == null)
            return;

        Equipo e = seleccionarEquipo();
        if (e == null)
            return;

        e.addJugador(j);
        System.out.println("Jugador añadido al equipo " + e.getNombre());
    }

    private static void crearYAsignarItem() {
        Jugador j = seleccionarJugador();
        if (j == null)
            return;

        String nombre = leerCadena("Nombre del Item: ");
        int atq = leerEntero("Bonus Ataque: ");
        int def = leerEntero("Bonus Defensa: ");

        Item item = new Item(nombre, atq, def);
        items.add(item);
        j.addItem(item);
        System.out.println("Item entregado a " + j.getNombre());
    }

    private static void listarJugadores() {
        System.out.println("\n--- LISTA DE JUGADORES ---");
        for (Jugador j : jugadores) {
            System.out.println(j);
        }
    }

    // --- MENÚ COMBATE ---
    private static void menuCombate() {
        if (jugadores.size() < 2) {
            System.out.println("Necesitas al menos 2 jugadores para combatir.");
            return;
        }

        System.out.println("\n--- ARENA DE COMBATE ---");
        System.out.println("Selecciona Atacante:");
        Jugador atacante = seleccionarJugador();

        System.out.println("Selecciona Defensor:");
        Jugador defensor = seleccionarJugador();

        if (atacante != null && defensor != null && atacante != defensor) {
            if (atacante.getVida() <= 0) {
                System.out.println("¡Un muerto no puede atacar!");
                return;
            }
            if (defensor.getVida() <= 0) {
                System.out.println("¡Déjalo, ya está muerto!");
                return;
            }

            atacante.atacar(defensor);

            // Contraataque si sigue vivo (Opcional según reglas)
            if (defensor.getVida() > 0) {
                System.out.println("¡Contraataque!");
                defensor.atacar(atacante);
            } else {
                System.out.println(defensor.getNombre() + " ha CAÍDO EN COMBATE.");
            }
        } else {
            System.out.println("Combate cancelado (mismo jugador o selección inválida).");
        }
    }

    // --- UTILIDADES ---
    private static Jugador seleccionarJugador() {
        listarJugadores();
        String nombre = leerCadena("Escribe el nombre del jugador exacto: ");
        // Búsqueda simple por nombre
        for (Jugador j : jugadores) {
            if (j.getNombre().equalsIgnoreCase(nombre)) {
                return j;
            }
        }
        System.out.println("Jugador no encontrado.");
        return null; // O lanzar excepción
    }

    private static Equipo seleccionarEquipo() {
        System.out.println("Equipos disponibles:");
        for (Equipo e : equipos)
            System.out.println("- " + e.getNombre());

        String nombre = leerCadena("Escribe el nombre del equipo: ");
        for (Equipo e : equipos) {
            if (e.getNombre().equalsIgnoreCase(nombre))
                return e;
        }
        System.out.println("Equipo no encontrado.");
        return null;
    }

    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor, introduce un número: ");
            scanner.next();
        }
        int i = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea
        return i;
    }

    private static String leerCadena(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    private static void inicializarDatosPrueba() {
        // Creamos algunos datos autogenerados para no tener que teclear siempre
        Humano h = new Humano("Aragorn", 100, 50, 40);
        Guerrero g = new Guerrero("Gimli", 100, 60, 60); // Vida corregida por herencia Humano
        Enemigo e = new Enemigo("Uruk-Hai", 150, 45, 20);

        jugadores.add(h);
        jugadores.add(g);
        jugadores.add(e);

        Item espada = new Item("Anduril", 20, 5);
        Item hacha = new Item("Hacha Doble", 25, 0);

        h.addItem(espada);
        g.addItem(hacha);
    }
}
