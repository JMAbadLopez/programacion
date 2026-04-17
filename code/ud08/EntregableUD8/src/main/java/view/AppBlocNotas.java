package view;

import database.UsuarioDAO;
import model.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class AppBlocNotas {

    public static void main(String[] args) {

        UsuarioDAO usuarioDAO = new UsuarioDAO();

        Scanner sc = new Scanner(System.in);
        String email, password;

        System.out.println("-- LOGIN --");
        System.out.print("> email: ");
        email = sc.nextLine();

        System.out.print("> password: ");
        password = sc.nextLine();

        Usuario usuario = usuarioDAO.login(email, password);

        if(usuario != null && usuario.getIdUsuario() != 0){
            System.out.println("Usuario Logueado");
            System.out.println("- Bienvenid@ " +  usuario.getEmail());
        } else {
            System.out.println("Usuario Incorrecto");
        }
    }
}
