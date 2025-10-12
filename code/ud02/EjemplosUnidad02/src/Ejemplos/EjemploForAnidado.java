package ejemplos;

public class EjemploForAnidado {

    public static void main(String[] args) {

        for(int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Fila (i) : " + i + " Columna (j) :" + j  + " |\t");
            }
            System.out.println();
        }
    }
}
