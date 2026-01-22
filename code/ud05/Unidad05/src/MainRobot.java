public class MainRobot {

    public static void main(String[] args) {

        Robot r1, r2;

        r1 = new Robot("Nexus 6");
        r2 = new Robot("Optimus");

        r1.mostrarInfo();
        r2.mostrarInfo();

        System.out.println("Número total de robots: " + Robot.contadorRobots);
    }
}
