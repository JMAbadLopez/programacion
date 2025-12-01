package ejemplos;

public class EjemploMailString {

    public static void main(String[] args) {
        String email = "   ejemplo@DOMINIO.com   ";
        int posArroba = 0;

        // 1. Limpiamos espacios y lo pasamos a minúsculas para unificar
        String emailLimpio = email.trim().toLowerCase();
        System.out.println("Email limpio: " + emailLimpio); // "ejemplo@dominio.com"

        // 2. Verificamos que contenga "@" y ".com"
        if (emailLimpio.contains("@") && emailLimpio.contains(".com")) {
            System.out.println("El formato del email parece correcto.");

            // 3. Extraemos el nombre de usuario y el dominio
            posArroba = emailLimpio.indexOf("@");
            String usuario = emailLimpio.substring(0, posArroba);
            String dominio = emailLimpio.substring(posArroba + 1, emailLimpio.length());

            System.out.println("Usuario: " + usuario); // "ejemplo"
            System.out.println("Dominio: " + dominio); // "dominio.com"
        } else {
            System.out.println("Formato de email incorrecto.");
        }
    }
}
