public class Robot {

    private int id;
    private String modelo;

    public static int contadorRobots = 0;

    public Robot(String modelo) {
        Robot.contadorRobots++;
        this.modelo = modelo;
        this.id = contadorRobots;
    }

    public void mostrarInfo() {
        System.out.printf("Robot modelo [%s] con ID [%d]\n", this.modelo, this.id);
    }
}
