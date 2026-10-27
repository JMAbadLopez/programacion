# Ejercicios de Ampliación — UD2

!!! info "¿Para quién es este boletín?"
    Este boletín está pensado para alumnos que ya han completado todos los ejercicios de la UD2. Los ejercicios son más desafiantes y combinan vectores, vectores paralelos y matrices con algoritmos algo más elaborados. No hay pseudocódigo obligatorio: céntrate en la solución en **Java**.

---

## Ejercicio A1: Filtro por Umbral

Pide al usuario que introduzca una serie de números enteros y los almacene en un vector. El usuario indicará cuántos valores quiere introducir antes de empezar (entre 5 y 20). A continuación, pide un **valor umbral** y muestra:

- Todos los elementos del vector que sean **estrictamente superiores** al umbral, indicando su posición (índice).
- El **total de elementos** que superan el umbral y su **porcentaje** sobre el total.
- Si ningún elemento supera el umbral, muestra un mensaje informativo.

!!! example "Ejemplo de ejecución"
    ```
    ¿Cuántos valores quieres introducir? 6
    Introduce el valor 0: 14
    Introduce el valor 1: 3
    Introduce el valor 2: 27
    Introduce el valor 3: 8
    Introduce el valor 4: 31
    Introduce el valor 5: 5
    Introduce el umbral: 10

    Valores superiores a 10:
      - Índice 0: 14
      - Índice 2: 27
      - Índice 4: 31

    3 de 6 valores superan el umbral (50,00%)
    ```

---

## Ejercicio A2: Clasificación de una Liga de Basket

Gestiona la clasificación de una liga de baloncesto usando **tres vectores paralelos**:

```java
String[] equipos  = {"Real Madrid", "FC Barcelona", "Valencia Basket", "Unicaja", "Baskonia"};
int[]    puntos   = {28, 26, 22, 18, 16};
int[]    canastas = {920, 895, 860, 830, 810};
```

El programa debe ofrecer un **menú** con las siguientes opciones:

1. **Mostrar clasificación actual** — muestra la tabla en el orden en que están almacenados los datos.
2. **Clasificación ordenada por puntos** — ordena los vectores paralelos por puntos (de mayor a menor) y muestra la tabla resultante. Usa el algoritmo que prefieras, pero recuerda que al intercambiar hay que mover los **tres vectores** a la vez.
3. **Equipo con más canastas** — busca y muestra el equipo que ha anotado más canastas.
4. **Añadir resultado** — pide el nombre de dos equipos (local y visitante) y el marcador (las canastas del partido). Actualiza los puntos de cada equipo (victoria = 2 puntos, empate = 1 punto, derrota = 0 puntos) y sus canastas (solo se actualizan el equipo local y el visitante).
5. **Salir**.

!!! warning "Precaución con los vectores paralelos"
    Cuando ordenes o intercambies elementos, asegúrate de mover **siempre los tres vectores a la vez**. Si solo mueves `puntos`, los datos dejarán de estar alineados.

---

## Ejercicio A3: Detector de Duplicados

Pide al usuario **10 números enteros** (pueden repetirse) y almacénalos en un vector. A continuación, analiza el vector y muestra:

- Los valores que aparecen **más de una vez**, indicando cuántas veces se repite cada uno.
- Los valores que aparecen **exactamente una vez** (únicos).
- El valor que aparece **más veces** (moda). Si hay empate, muestra todos los empatados.

!!! tip "Estrategia"
    Para cada elemento en la posición `i`, recorre el resto del vector contando cuántas veces aparece ese mismo valor. Para no contar el mismo duplicado varias veces, puedes marcar los ya procesados (por ejemplo, con un vector auxiliar `boolean[] procesado`).

!!! example "Ejemplo de ejecución"
    ```
    Vector introducido: [4, 7, 2, 7, 9, 4, 1, 7, 4, 3]

    Valores duplicados:
      - 4 aparece 3 veces
      - 7 aparece 3 veces

    Valores únicos: 2, 9, 1, 3

    Moda: 4 y 7 (ambos aparecen 3 veces)
    ```

---

## Ejercicio A4: Transposición de Matrices

La **transpuesta** de una matriz M×N es otra matriz N×M en la que las filas y las columnas se intercambian: el elemento que estaba en la posición `[i][j]` pasa a la posición `[j][i]`.

El programa debe:

1. Pedir al usuario las dimensiones de la matriz: **filas** y **columnas** (entre 2 y 5 cada una).
2. Pedir todos los valores enteros de la matriz.
3. Mostrar la **matriz original**.
4. Calcular y mostrar su **transpuesta**.
5. Si la matriz es **cuadrada** (filas == columnas), comprobar además si es **simétrica**: una matriz es simétrica si coincide exactamente con su propia transpuesta, es decir, si `M[i][j] == M[j][i]` para todos los elementos.

!!! tip "Ejemplo de transposición"
    ```
Original (2×3):        Transpuesta (3×2):
    1  2  3                1  4
    4  5  6                2  5
                           3  6
    ```

!!! example "Ejemplo de matriz simétrica (3×3)"
    ```
1  2  3
    2  5  4      →  Es simétrica (M[0][1]=2 == M[1][0]=2, etc.)
    3  4  6
    ```

---

## Ejercicio A5: Cuadrado Mágico

Un **cuadrado mágico** es una matriz cuadrada de N×N en la que la suma de todos los elementos de cada fila, cada columna y las dos diagonales principales es siempre la misma (llamada **constante mágica**).

Escribe un programa que:

1. Pida al usuario el tamaño N de la matriz (mínimo 2).
2. Pida todos los valores enteros de la matriz.
3. Compruebe si la matriz es un cuadrado mágico:
    - Calcula la suma de la primera fila como referencia.
    - Verifica que **todas las filas** suman lo mismo.
    - Verifica que **todas las columnas** suman lo mismo.
    - Verifica que la **diagonal principal** (↘) suma lo mismo.
    - Verifica que la **diagonal secundaria** (↙) suma lo mismo.
4. Si es mágico, muestra la constante mágica. Si no lo es, indica cuál de las condiciones no se cumple.

!!! example "Ejemplo de cuadrado mágico 3×3"
    ```
2  7  6
    9  5  1
    4  3  8
    ```
    Constante mágica = **15** (todas las filas, columnas y diagonales suman 15).
