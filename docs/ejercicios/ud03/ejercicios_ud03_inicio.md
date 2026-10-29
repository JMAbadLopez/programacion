# Boletín de Ejercicios — Unidad 3: Funciones y Procedimientos

!!! info "Resultados de Aprendizaje"
    Este boletín trabaja los siguientes RAs del módulo de **Programación**:

    - **RA2, RA3** — Escribe y depura código aplicando programación modular con funciones y procedimientos. Desarrolla programas estructurados que reutilizan código mediante el uso de parámetros, valores de retorno y ámbito de variables.

!!! warning "Regla de Oro de esta Unidad"
    Ninguna función mostrará nada por pantalla a no ser que se indique explícitamente. Las funciones calculan y devuelven; los procedimientos actúan y muestran.

---

## 1. Iniciación

1. Escribe un programa que pida dos números reales y muestre su producto. Implementa y utiliza la función:

    ```java
    double multiplica(double a, double b)
    ```

    !!! example "Ejemplo"
        ```
        Introduce el primer numero: 4.5
        Introduce el segundo numero: 3.0
        Resultado: 13.5
        ```

2. Escribe un programa que pida una edad y muestre si el usuario es mayor de edad o no. Implementa y utiliza la función:

    ```java
    boolean esMayorEdad(int edad)  // Devuelve true si edad >= 18
    ```

    !!! example "Ejemplo"
        ```
        Introduce tu edad: 16
        No eres mayor de edad.
        ```

3. Escribe un programa que pida dos enteros y muestre cuál es el menor. Implementa y utiliza la función:

    ```java
    int minimo(int a, int b)  // Devuelve el menor de los dos
    ```

    !!! example "Ejemplo"
        ```
        Introduce el primer numero: 8
        Introduce el segundo numero: 3
        El minimo es: 3
        ```

4. Escribe un programa que pida un entero y determine si es positivo, negativo o cero. Implementa y utiliza la función:

    ```java
    int dimeSigno(int a)  // Devuelve -1, 0 o 1 según el signo
    ```

    !!! example "Ejemplo"
        ```
        Introduce un numero: -7
        El numero es negativo.
        ```

5. Escribe un programa que pida una distancia en millas y muestre su equivalente en kilómetros. Ten en cuenta que 1 milla equivale a 1,60934 km. Implementa y utiliza la función:

    ```java
    double millasAKilometros(int millas)
    ```

    !!! example "Ejemplo"
        ```
        Introduce la distancia en millas: 10
        Equivale a 16.0934 kilometros.
        ```

6. Escribe un programa que pida cinco precios y muestre, para cada uno, el precio final tras aplicar un IVA del 21 %. Implementa y utiliza la función:

    ```java
    double precioConIVA(double precio)
    ```

    !!! example "Ejemplo"
        ```
        Precio 1: 10.0
        Precio con IVA: 12.1
        Precio 2: 25.5
        Precio con IVA: 30.855
        ```

7. Escribe un programa que pida el ancho y el alto de un rectángulo y muestre su área y su perímetro. Implementa y utiliza las funciones:

    ```java
    double areaRectangulo(double ancho, double alto)
    double perimetroRectangulo(double ancho, double alto)
    ```

    !!! example "Ejemplo"
        ```
        Ancho: 5.0
        Alto: 3.0
        Area: 15.0
        Perimetro: 16.0
        ```

8. Escribe un programa que pida un entero positivo N y muestre el sumatorio de 1 a N, el productorio de 1 a N y el valor intermedio entre 1 y N. Implementa y utiliza las funciones:

    ```java
    int suma1aN(int n)          // Suma 1 + 2 + ... + n
    int producto1aN(int n)      // Producto 1 × 2 × ... × n
    double intermedio1aN(int n) // Valor central entre 1 y n
    ```

    !!! example "Ejemplo"
        ```
        Introduce N: 5
        Suma: 15
        Producto: 120
        Valor intermedio: 3.0
        ```

---

## 2. Intermedio

1. Escribe un programa que pida tres enteros y muestre el mayor de los tres. Para resolverlo, implementa **una única función** que reciba **dos** valores y devuelva el mayor; llámala dos veces encadenando el resultado.

    !!! example "Ejemplo"
        ```
        Introduce el primer numero: 4
        Introduce el segundo numero: 9
        Introduce el tercer numero: 6
        El mayor es: 9
        ```

2. Escribe un programa que pida una fecha (día, mes y año por separado) y determine si es válida. Considera que todos los meses tienen 30 días. Implementa una función que reciba los tres valores y devuelva si la fecha es correcta.

    !!! example "Ejemplo"
        ```
        Dia: 31
        Mes: 5
        Anno: 2024
        La fecha 31/5/2024 no es valida.
        ```

3. Escribe un programa que pida un número y muestre su tabla de multiplicar. Implementa un procedimiento (`void`) que reciba el número e imprima la tabla.

    !!! example "Ejemplo"
        ```
        Introduce un numero: 7
        7 x 1 = 7
        7 x 2 = 14
        7 x 3 = 21
        7 x 4 = 28
        7 x 5 = 35
        7 x 6 = 42
        7 x 7 = 49
        7 x 8 = 56
        7 x 9 = 63
        7 x 10 = 70
        ```

4. Escribe un programa que pida una distancia en kilómetros y muestre su equivalente en millas. Implementa una función que reciba los kilómetros y devuelva el valor convertido.

    !!! example "Ejemplo"
        ```
        Introduce la distancia en kilometros: 100
        Equivale a 62.1371 millas.
        ```

5. Escribe un programa que calcule el porcentaje de descuento aplicado a un producto. Pide el precio original y el precio final tras el descuento. Implementa una función que reciba ambos valores y devuelva el porcentaje de descuento.

    !!! example "Ejemplo"
        ```
        Precio original: 80.0
        Precio con descuento: 60.0
        Descuento aplicado: 25.0%
        ```

6. Escribe un programa que imprima un triángulo de caracteres. Implementa un procedimiento que reciba el carácter a usar y el número de líneas, y lo muestre por pantalla.

    !!! example "Ejemplo"
        ```
        Introduce el numero de lineas: 5
        Introduce el caracter: Z
            Z
           ZZZ
          ZZZZZ
         ZZZZZZZ
        ZZZZZZZZZ
        ```

7. Escribe un programa que cree un array con los primeros 100 números naturales y muestre su suma total y su media. Implementa las funciones:

    ```java
    int suma(int[] array)
    double media(int[] array)
    ```

    !!! example "Ejemplo"
        ```
        Suma: 5050
        Media: 50.5
        ```

8. Escribe un programa que pida al usuario el tamaño del array (entre 5 y 50) y lo rellene con enteros aleatorios entre 0 y 99. Muestra el array resultante. Implementa una función que reciba un array y lo rellene con valores aleatorios usando `Math.random()`.

    !!! example "Ejemplo"
        ```
        Introduce el tamano del array: 6
        Array generado: [42, 7, 85, 13, 66, 29]
        ```

---

## 3. Avanzado

1. Escribe un programa que pida números enteros positivos hasta que el usuario introduzca 0, e indique para cada número si es primo o no. Recuerda que un número es primo si solo es divisible por sí mismo y por 1, y que el 1 no se considera primo por convenio. Implementa una función que reciba un entero y devuelva si es primo.

    !!! example "Ejemplo"
        ```
        Introduce un numero (0 para terminar): 7
        7 es primo.
        Introduce un numero (0 para terminar): 9
        9 no es primo.
        Introduce un numero (0 para terminar): 0
        Programa terminado.
        ```

2. La letra del NIF se obtiene dividiendo el número del DNI entre 23 y codificando el resto con la siguiente tabla:

    ```
    0:T  1:R  2:W  3:A  4:G  5:M  6:Y  7:F  8:P  9:D  10:X  11:B
    12:N 13:J 14:Z 15:S 16:Q 17:V 18:H 19:L 20:C 21:K  22:E
    ```

    Escribe un programa que pida el número de DNI y muestre la letra NIF correspondiente. Implementa una función que reciba el número y devuelva la letra.

    !!! example "Ejemplo"
        ```
        Introduce tu DNI: 56321122
        Tu letra NIF es: X
        ```

3. Escribe un programa que pida tres enteros y compruebe si forman una terna pitagórica, es decir, si se cumple que x² + y² = z². Implementa una función que reciba los tres valores y devuelva si cumplen la condición.

    !!! example "Ejemplo"
        ```
        Introduce x: 3
        Introduce y: 4
        Introduce z: 5
        3, 4 y 5 forman una terna pitagorica.

        Introduce x: 5
        Introduce y: 6
        Introduce z: 7
        5, 6 y 7 no forman una terna pitagorica.
        ```

4. Escribe un programa que pida al usuario un número N y muestre las tablas de multiplicar del 1 al N. Reutiliza el procedimiento de tablas que implementaste en el bloque Intermedio.

    !!! example "Ejemplo (N = 3)"
        ```
        1 x 1 = 1
        1 x 2 = 2
        ...
        1 x 10 = 10
        2 x 1 = 2
        ...
        3 x 10 = 30
        ```

5. Escribe un programa con menú para calcular propiedades de una esfera a partir del radio. Implementa las funciones:

    ```java
    int menu()                      // Muestra el menú y devuelve la opción elegida
    double pideRadio()              // Pide el radio al usuario y lo devuelve
    double circunferencia(double r)
    double area(double r)
    double volumen(double r)
    ```

    El menú debe ofrecer las opciones: `1. Longitud de circunferencia`, `2. Area`, `3. Volumen`, `4. Todas`, `5. Salir`. La opción *Todas* pide el radio una sola vez y muestra los tres resultados. El programa repite el menú hasta que el usuario elija salir.

    !!! example "Ejemplo"
        ```
        1. Longitud de circunferencia
        2. Area
        3. Volumen
        4. Todas
        5. Salir
        Elige una opcion: 1
        Introduce el radio: 5.0
        Longitud de la circunferencia: 31.41592653589793
        ```

6. Resuelve los ejercicios [**59** y **61** de la Unidad 2](../ud02/ejercicios_ud02.md) (*Analizador de Matrices* y *Simulador de Máquina Expendedora v2.0*) aplicando funciones y procedimientos: extrae en funciones independientes cada operación del menú y cualquier cálculo repetido.
