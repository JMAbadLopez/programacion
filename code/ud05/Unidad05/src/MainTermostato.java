public class MainTermostato {
    public static void main(String[] args) {

        Termostato termo = new Termostato();

        System.out.println(termo);

        termo.encender();
        System.out.println(termo);

        termo.subirTemperatura(2);
        System.out.println(termo);

        termo.apagar();
        termo.bajarTemperatura(4);
        System.out.println(termo);
    }
}
