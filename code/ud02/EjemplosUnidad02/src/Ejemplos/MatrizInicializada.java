package ejemplos;

public class MatrizInicializada {

    public static void main(String[] args) {

        int[][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println("Matriz Inicializada");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}