public class PruebaConector {

    public static void main(String[] args) {

        ConexionBD con = new ConexionBD();

        con.conectar();

        con.test();

    }
}
