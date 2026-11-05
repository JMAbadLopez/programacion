# Mini-Reto (UD3): El Mapa de Exploración

**Objetivo:** Poner en práctica los principios de la programación modular (Unidad 3), implementando la lógica de funciones y procedimientos que colaboran con un programa principal ya dado.

**Resultados de Aprendizaje (RAs) Trabajados:**

* **RA2: Escribe y depura código, analizando y utilizando las estructuras de control del lenguaje.**

* **RA3: Desarrolla programas aplicando la programación estructurada e introduciendo el tratamiento de datos.**

---

### Enunciado

Eres parte de un equipo de desarrollo. El "arquitecto de software" (tu profesor) ya ha diseñado la estructura principal de un mini-juego de exploración. El método `main` está terminado y actúa como el "director de orquesta".

Sin embargo, las funciones especializadas que deben hacer el trabajo están vacías. **Tu tarea es implementar su lógica para que el juego cobre vida.**

El juego se desarrolla sobre un **mapa representado en una matriz de caracteres de 8×8**. Cada casilla puede contener uno de estos cuatro valores:

| Símbolo | Significado | Puntos |
|---|---|---|
| `D` | Diamante | +5 |
| `T` | Tierra | 0 |
| `A` | Agua | -1 |
| `Z` | Zombie | Fin de la partida |

**Inicialización del mapa:**

* Se colocan exactamente **10 diamantes** en posiciones aleatorias.
* Se colocan exactamente **4 zombies** en posiciones aleatorias (que no sean ya diamantes).
* El resto de casillas se rellena aleatoriamente con `T` o `A`.

**Reglas de juego:**

* El mapa se muestra ocultando las casillas no visitadas con `#`.
* El usuario elige una fila y una columna para explorar.
* No se puede visitar una casilla ya visitada.
* Los puntos se acumulan en una **variable estática** de clase.
* Si el usuario encuentra un zombie, la partida termina y se muestra la puntuación final.

---

### Tu Tarea

1. Copia el código que se te proporciona y guárdalo en un fichero `MapaExploracion.java` de tu proyecto.

2. **¡No modifiques el método `main`!** Tu trabajo se centra exclusivamente en las funciones marcadas con `TO-DO`.

3. Completa el cuerpo de las siguientes funciones basándote en la documentación Javadoc de cada una:

    * `public static void inicializarMapa(char[][] mapa)`

        * **Tarea:** Rellena primero todas las casillas con `T` o `A` de forma aleatoria. Después, coloca los 10 diamantes en posiciones aleatorias sin repetir. Por último, coloca los 4 zombies en posiciones que todavía no sean diamantes.
        * **Recuerda:** El array se pasa por referencia, así que los cambios se reflejan en el `main`.

    * `public static void mostrarMapa(char[][] mapa, boolean[][] visitado)`

        * **Tarea:** Recorre la matriz e imprime cada casilla. Si la casilla ya fue visitada, muestra su carácter real (`D`, `T`, `A`). Si no, muestra `#`. Incluye una cabecera con los índices de columna y fila para orientar al usuario.

    * `public static boolean esPosicionValida(int fila, int col)`

        * **Tarea:** Devuelve `true` si la fila y la columna están dentro del rango válido (0 a 7), y `false` en caso contrario.

    * `public static int calcularPuntos(char casilla)`

        * **Tarea:** Devuelve los puntos correspondientes al tipo de casilla: `D` → 5, `A` → -1, `T` → 0.

    * `public static void mostrarResultado()`

        * **Tarea:** Muestra el informe final de la partida con la puntuación total acumulada en la variable estática `puntos`.

---

### Ejemplo de Ejecución

```
=== MAPA DE EXPLORACION ===
   0  1  2  3  4  5  6  7
0  #  #  #  #  #  #  #  #
1  #  #  #  #  #  #  #  #
2  #  #  #  #  #  #  #  #
3  #  #  #  #  #  #  #  #
4  #  #  #  #  #  #  #  #
5  #  #  #  #  #  #  #  #
6  #  #  #  #  #  #  #  #
7  #  #  #  #  #  #  #  #
Introduce la fila (0-7): 3
Introduce la columna (0-7): 4
Has encontrado: T. Puntuacion actual: 0

=== MAPA DE EXPLORACION ===
   0  1  2  3  4  5  6  7
...
3  #  #  #  #  T  #  #  #
...
Introduce la fila (0-7): 1
Introduce la columna (0-7): 2
Has encontrado: D. Puntuacion actual: 5

=== MAPA DE EXPLORACION ===
   0  1  2  3  4  5  6  7
...
1  #  #  D  #  #  #  #  #
...
3  #  #  #  #  T  #  #  #
...
Introduce la fila (0-7): 5
Introduce la columna (0-7): 1
Has encontrado: A. Puntuacion actual: 4

...

Introduce la fila (0-7): 6
Introduce la columna (0-7): 3
Has encontrado un ZOMBIE! Fin de la partida.

=== RESULTADO FINAL ===
Puntuacion total: 4
```

---

### Entrega

* Nombra tu fichero completado como `ud3_mapa_exploracion_[tu_nombre].java`.

---

## Recordatorio: Herramientas que necesitarás

!!! tip "Generar números aleatorios con Math.random()"
    `Math.random()` devuelve un `double` aleatorio entre `0.0` (inclusive) y `1.0` (exclusivo). Para obtener un entero en un rango concreto, multiplica y convierte con un cast:

    ```java
    // Entero aleatorio entre 0 y 7 (para filas y columnas del mapa)
    int fila = (int)(Math.random() * 8);

    // Entero aleatorio entre 0 y N-1 (rango genérico)
    int n = (int)(Math.random() * N);

    // Elegir aleatoriamente entre dos opciones (p.ej. T o A)
    char celda = (Math.random() < 0.5) ? 'T' : 'A';
    ```

!!! tip "Leer un carácter con Scanner"
    `Scanner` no tiene un método `nextChar()`. La forma habitual es leer una cadena y quedarse con el primer carácter usando `charAt(0)`:

    ```java
    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduce un carácter: ");
    char c = teclado.next().charAt(0);
    ```

    Si el usuario puede introducir más de un carácter, `next()` leerá la primera "palabra" y `charAt(0)` tomará solo el primero.

---

## Esqueleto de Código para Rellenar

Copia este código en tu IDE. **Solo debes modificar el cuerpo de las funciones marcadas con `TO-DO`**.

```java
import java.util.Scanner;

/**
 * Mini-Reto Unidad 3: El Mapa de Exploración.
 *
 * OBJETIVO: Implementar la lógica de las funciones marcadas con TO-DO
 * para que el juego principal (main) funcione correctamente.
 */
public class MapaExploracion {

    // Variable estática accesible desde todas las funciones de la clase.
    // Acumula los puntos obtenidos a lo largo de la partida.
    static int puntos = 0;


    // ############### FUNCIÓN PRINCIPAL (main) ###############
    // NO MODIFICAR ESTA FUNCIÓN.
    // Su trabajo es coordinar las llamadas a las funciones.
    public static void main(String[] args) {

        char[][]    mapa     = new char[8][8];
        boolean[][] visitado = new boolean[8][8];

        inicializarMapa(mapa);

        Scanner teclado = new Scanner(System.in);
        boolean partidaActiva = true;

        while (partidaActiva) {
            mostrarMapa(mapa, visitado);

            System.out.print("Introduce la fila (0-7): ");
            int fila = teclado.nextInt();
            System.out.print("Introduce la columna (0-7): ");
            int col = teclado.nextInt();

            if (!esPosicionValida(fila, col)) {
                System.out.println("Posicion fuera del mapa. Intenta de nuevo.");
                continue;
            }

            if (visitado[fila][col]) {
                System.out.println("Ya has visitado esta casilla. Elige otra.");
                continue;
            }

            visitado[fila][col] = true;
            char casilla = mapa[fila][col];

            if (casilla == 'Z') {
                System.out.println("Has encontrado un ZOMBIE! Fin de la partida.");
                partidaActiva = false;
            } else {
                puntos += calcularPuntos(casilla);
                System.out.println("Has encontrado: " + casilla + ". Puntuacion actual: " + puntos);
            }
        }

        mostrarResultado();
        teclado.close();
    }


    // ############### HERRAMIENTAS (Funciones y Procedimientos) ###############
    // TU TRABAJO COMIENZA AQUI
    // ########################################################################

    /**
     * Inicializa el mapa de juego siguiendo las reglas de distribución:
     * primero rellena todas las casillas con T o A aleatoriamente,
     * después coloca 10 diamantes (D) en posiciones aleatorias sin repetir,
     * y finalmente coloca 4 zombies (Z) en posiciones que no sean diamantes.
     *
     * @param mapa La matriz de 8x8 que representa el mapa del juego.
     *             Se pasa por referencia: los cambios afectan al array original.
     */
    public static void inicializarMapa(char[][] mapa) {
        // TO-DO: Implementar la inicialización del mapa.
        // Pista 1: Math.random() devuelve un double entre 0.0 y 1.0.
        //          Puedes usarlo para elegir aleatoriamente entre T y A.
        // Pista 2: Para colocar las piezas especiales sin repetir posición,
        //          genera filas y columnas aleatorias en un bucle while
        //          y comprueba que la casilla elegida tenga el valor esperado
        //          antes de colocar la nueva pieza.
        System.out.println("inicializarMapa no implementada.");
    }

    /**
     * Muestra el estado actual del mapa por consola.
     * Las casillas no visitadas se representan con '#'.
     * Las casillas ya visitadas muestran su carácter real (D, T, A).
     * Incluye cabeceras de fila y columna para orientar al usuario.
     *
     * @param mapa     La matriz con el contenido real de cada casilla.
     * @param visitado La matriz de booleanos que indica si cada casilla ha sido visitada.
     */
    public static void mostrarMapa(char[][] mapa, boolean[][] visitado) {
        // TO-DO: Implementar la visualización del mapa.
        // Pista: Usa dos bucles for anidados para recorrer filas y columnas.
        System.out.println("mostrarMapa no implementada.");
    }

    /**
     * Comprueba si una posición dada está dentro de los límites del mapa (0-7).
     *
     * @param fila La fila a comprobar.
     * @param col  La columna a comprobar.
     * @return     true si la posición es válida, false en caso contrario.
     */
    public static boolean esPosicionValida(int fila, int col) {
        // TO-DO: Devuelve true si fila y col están entre 0 y 7 (inclusive).
        return false; // Valor provisional. Cambialo.
    }

    /**
     * Calcula los puntos obtenidos al visitar una casilla.
     *
     * @param casilla El carácter que representa el tipo de casilla (D, T o A).
     * @return        Los puntos correspondientes: D=5, T=0, A=-1.
     */
    public static int calcularPuntos(char casilla) {
        // TO-DO: Implementar el cálculo de puntos según el tipo de casilla.
        return 0; // Valor provisional. Cambialo.
    }

    /**
     * Muestra el resultado final de la partida con la puntuación acumulada.
     * Accede directamente a la variable estática 'puntos' de la clase.
     */
    public static void mostrarResultado() {
        // TO-DO: Mostrar un informe final con la puntuación total.
        System.out.println("mostrarResultado no implementada.");
    }
}
```
