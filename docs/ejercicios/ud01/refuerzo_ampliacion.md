# Ejercicios UD1 — Refuerzo y Ampliación

!!! info "Sobre estos ejercicios"
    Esta batería complementa los ejercicios básicos de la UD1. Los ejercicios de **Refuerzo** consolidan conceptos clave que conviene afianzar antes de avanzar; los de **Ampliación** combinan varios conceptos y exigen un mayor nivel de razonamiento.

---

## Parte 1 — Refuerzo

### R1. Literales y secuencias de escape

¿Qué imprime exactamente cada instrucción? Razona la respuesta **sin ejecutarla** y ten en cuenta los espacios y saltos de línea:

```java
System.out.println("Hola\tMundo");
System.out.println("Línea 1\nLínea 2");
System.out.println("Ella dijo: \"Hola\"");
System.out.println("C:\\Users\\jose\\archivo.txt");
System.out.println("10" + 5 + 3);
System.out.println(10 + 5 + "3");
```

!!! tip "Recuerda"
    El operador `+` con `String` actúa como **concatenación**. Cuando en una expresión aparece un literal `String`, el resto de operandos a su derecha también se concatenan como texto. El orden de evaluación es de izquierda a derecha.

---

### R2. Operadores de asignación compuesta

¿Cuál es el valor final de `x` e `y` tras ejecutar este bloque? Traza cada línea en una tabla:

```java
int x = 10;
int y = 3;

x += y;     // x = ?
x -= 2;     // x = ?
y *= x;     // y = ?
x /= y;     // x = ? (¡división entera!)
y %= 5;     // y = ?
```

Completa la tabla:

| Instrucción | x | y |
|---|---|---|
| Estado inicial | 10 | 3 |
| `x += y` | | |
| `x -= 2` | | |
| `y *= x` | | |
| `x /= y` | | |
| `y %= 5` | | |

---

### R3. Casting implícito y explícito

Clasifica cada asignación como: **✅ Correcto** (sin pérdida), **⚠️ Necesita cast explícito** o **❌ Error de compilación**. Para las que sean incorrectas, escribe la versión corregida:

```java
int    a = 3.14;          // ¿?
double b = 5;             // ¿?
long   c = 2000000000;    // ¿?
byte   d = 200;           // ¿?
float  e = 3.14;          // ¿?
int    f = (int) 9.99;    // ¿? ¿Cuánto vale f?
double g = (double) 7 / 2; // ¿? ¿Cuánto vale g?
int    h = 7 / 2;         // ¿? ¿Cuánto vale h?
```

!!! warning "Rango de byte"
    El tipo `byte` almacena valores entre **-128 y 127**.

---

### R4. Constantes con `final`

El siguiente programa funciona, pero usa literales «mágicos» dispersos por el código. **Reescríbelo** extrayendo todos esos valores a constantes `final` bien nombradas (en mayúsculas con guiones bajos, según la convención Java):

```java
import java.util.Scanner;
public class Parking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Minutos aparcado: ");
        int minutos = sc.nextInt();

        double importe = (minutos / 30) * 0.75;
        if (importe > 15.00) {
            importe = 15.00;
        }
        System.out.println("Total a pagar: " + importe + " €");
    }
}
```

!!! question "¿Qué valores deben ser constantes?"
    Piensa: ¿qué números en este programa representan una **regla de negocio** o un **valor fijo del sistema** (precio por tramo, duración del tramo, tarifa máxima)? Esos son los candidatos.

---

### R5. Pre y post incremento en expresiones

Sin ejecutar el código, indica qué valor se imprime en cada caso. Después comprueba tu respuesta en IntelliJ:

```java
int a = 5;
System.out.println(a++);   // ¿?  ¿Cuánto vale a después?

int b = 5;
System.out.println(++b);   // ¿?  ¿Cuánto vale b después?

int c = 4;
int d = c++ + ++c;         // ¿Cuánto vale d? ¿Y c al final?
System.out.println(d);
System.out.println(c);

int e = 3;
int f = e-- * --e;         // ¿Cuánto vale f? ¿Y e al final?
System.out.println(f);
System.out.println(e);
```

!!! tip "Regla práctica"
    `x++` usa el valor **actual** de `x` en la expresión y luego incrementa. `++x` incrementa **primero** y luego usa el nuevo valor.

---

### R6. Clase Math — Tabla de expresiones

Calcula el resultado de cada expresión e indica el tipo devuelto (`int` o `double`). Después comprueba con IntelliJ:

| Expresión | Resultado | Tipo |
|---|---|---|
| `Math.abs(-7)` | | |
| `Math.abs(-3.5)` | | |
| `Math.max(10, 20)` | | |
| `Math.min(10, 20)` | | |
| `Math.pow(2, 10)` | | |
| `Math.sqrt(144)` | | |
| `Math.round(4.6)` | | |
| `Math.round(4.4)` | | |
| `Math.floor(4.9)` | | |
| `Math.ceil(4.1)` | | |

!!! info "Recuerda"
    `Math.round()` devuelve `long`. `Math.floor()` y `Math.ceil()` devuelven `double`.

---

### R7. Conversión entre String y tipos primitivos

El siguiente código tiene varios errores. **Identifícalos, explícalos y corrígelos**:

```java
import java.util.Scanner;
public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe tu edad: ");
        String texto = sc.nextLine();
        int edad = texto;                          // Error 1

        System.out.print("Escribe tu altura (m): ");
        double altura = Double.parseFloat(sc.nextLine()); // Error 2

        int dobleEdad = edad * 2;
        String resultado = "El doble de tu edad es: " + String.parseInt(dobleEdad); // Error 3

        System.out.println(resultado);
    }
}
```

---

### R8. Scanner — tipos y el problema del Enter fantasma

Lee con atención el siguiente programa e indica **qué nextXxx debería usarse** en cada caso, y si hay algún riesgo de «Enter fantasma». Corrígelo si es necesario:

```java
import java.util.Scanner;
public class Formulario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos años tienes? ");
        int edad = sc.nextInt();

        System.out.print("¿Cuánto pesas (kg)? ");
        double peso = sc.nextDouble();

        System.out.print("¿Cuál es tu nombre completo? ");
        String nombre = sc.nextLine();    // ← ¿problema aquí?

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");
    }
}
```

!!! warning "El Enter fantasma"
    `nextInt()` y `nextDouble()` **no consumen** el salto de línea (`\n`) que el usuario pulsa al final. El `nextLine()` posterior lee ese `\n` residual como una cadena vacía.

---

## Parte 2 — Ampliación

### A1. Conversor de temperatura

Escribe un programa que pida al usuario una temperatura en **grados Celsius** y muestre su equivalente en **Fahrenheit** y en **Kelvin**.

Las fórmulas son:

- `F = C × (9.0 / 5.0) + 32`
- `K = C + 273.15`

!!! example "Ejemplo de salida"
    ```
    Introduce temperatura en Celsius: 100
    Fahrenheit : 212.0 °F
    Kelvin     : 373.15 K
    ```

!!! tip "División entera"
    Escribe `9.0 / 5.0` en lugar de `9 / 5` para evitar que Java haga división entera y obtengas `1` en vez de `1.8`.

---

### A2. Segundos a horas, minutos y segundos

Diseña primero el **pseudocódigo** y después implementa en Java un programa que:

1. Pida al usuario un número de segundos (entero positivo).
2. Calcule a cuántas horas, minutos y segundos equivale.
3. Muestre el resultado en formato `HH:MM:SS`.

!!! example "Ejemplo de salida"
    ```
    Introduce los segundos: 3725
    Resultado: 1h 2m 5s  →  01:02:05
    ```

!!! tip "Pista"
    Usa `/` para obtener la parte entera y `%` para el resto. El orden importa: horas primero, luego minutos del resto.

---

### A3. Calculadora de descuento

Escribe un programa que pida el **precio original** de un artículo y el **porcentaje de descuento**, y muestre:

- El importe del descuento (redondeado a dos decimales).
- El precio final.
- El mensaje `"¡Oferta! Ahorras X €"`.

!!! example "Ejemplo de salida"
    ```
    Precio original (€): 49.99
    Descuento (%): 20
    Descuento aplicado : 10.0 €
    Precio final       : 39.99 €
    ¡Oferta! Ahorras 10.0 €
    ```

!!! info "Redondeo"
    Para redondear a dos decimales puedes usar:
    ```java
    double redondeado = Math.round(valor * 100.0) / 100.0;
    ```

---

### A4. Geometría del círculo

Escribe un programa que pida el **radio** de un círculo y calcule:

- El **área** (`π × r²`)
- La **circunferencia** (`2 × π × r`)
- La **longitud de la diagonal** del cuadrado que lo contiene (`2 × r × √2`)

Usa `Math.PI` y `Math.sqrt()`.

!!! example "Ejemplo de salida"
    ```
    Radio del círculo: 5
    Área          : 78.54 u²
    Circunferencia: 31.42 u
    Diagonal      : 14.14 u
    ```

---

### A5. Desbordamiento de rango

Sin ejecutar el código, predice qué imprimirá cada bloque. Después compruébalo y explica el motivo:

```java
// Bloque A
byte b = 127;
b++;
System.out.println(b);

// Bloque B
int i = Integer.MAX_VALUE;
i++;
System.out.println(i);

// Bloque C
int x = 1000000;
int y = 1000000;
long resultado = x * y;
System.out.println(resultado);
```

!!! question "Para reflexionar"
    ¿Por qué en el bloque C el resultado no es el esperado, aunque se almacene en un `long`? ¿Cómo lo corregirías con un cast?

---

### A6. Expresiones con precedencia

Evalúa estas expresiones **sin ejecutarlas**. Después comprueba en IntelliJ:

```java
int a = 3, b = 4, c = 2;

System.out.println(a + b * c);            // ¿?
System.out.println((a + b) * c);          // ¿?
System.out.println(a * b + c * a - b);    // ¿?
System.out.println(10 / 3 + 10 % 3);     // ¿?
System.out.println(2 + 3 * 4 - 6 / 2);   // ¿?
```

Para cada expresión, escribe los pasos de evaluación indicando qué operación se realiza primero.

---

### A7. Nota media con casting

Escribe un programa que pida al usuario **tres notas enteras** (entre 0 y 10) y calcule su media. El resultado debe ser un número decimal.

!!! warning "Cuidado con la división entera"
    Si sumas tres `int` y divides por `3`, obtienes un `int`. Usa casting para forzar la división en punto flotante.

!!! example "Ejemplo de salida"
    ```
    Nota 1: 7
    Nota 2: 8
    Nota 3: 6
    Media: 7.0
    ```

Añade también este mensaje según el resultado:

- Media ≥ 5 → `"APROBADO"`
- Media < 5 → `"SUSPENDIDO"`

¿Puedes expresar la condición usando solo operadores relacionales? (No uses `if` todavía — guárdalo para UD2; simplemente muestra ambas líneas o una variable de tipo `String` construida con el operador ternario si lo conoces.)

---

### A8. Billetes y monedas

Diseña e implementa un programa que pida un **importe en céntimos** (entero) y lo descomponga en el mínimo número de billetes y monedas. Usa las denominaciones del euro: 200€, 100€, 50€, 20€, 10€, 5€, 2€, 1€, 50c, 20c, 10c, 5c, 2c, 1c.

!!! tip "Estrategia"
    Para cada denominación (de mayor a menor): `cantidad = importe / denominacion`, `importe = importe % denominacion`. Solo muestra las denominaciones con cantidad > 0.

!!! example "Ejemplo de salida"
    ```
    Importe en céntimos: 1847
    18 € y 47 céntimos
    → 10€ × 1
    → 5€  × 1
    → 2€  × 1
    → 1€  × 1
    → 20c × 2
    → 5c  × 1
    → 2c  × 1
    ```

---

### A9. Distancia entre dos puntos

Escribe un programa que pida las coordenadas de dos puntos `(x1, y1)` y `(x2, y2)` y calcule la distancia euclídea entre ellos.

La fórmula es: `d = √((x2-x1)² + (y2-y1)²)`

Usa `Math.sqrt()` y `Math.pow()`.

!!! example "Ejemplo de salida"
    ```
    Punto 1 — x: 0  y: 0
    Punto 2 — x: 3  y: 4
    Distancia: 5.0
    ```

---

### A10. Número capicúa de dos cifras

Escribe un programa que pida un número entero de **exactamente dos cifras** (entre 10 y 99) y diga si es capicúa (es decir, si sus dos cifras son iguales: 11, 22, 33…).

!!! tip "Extrae las cifras"
    - Decenas: `numero / 10`
    - Unidades: `numero % 10`

!!! example "Ejemplo de salida"
    ```
    Introduce un número de dos cifras: 33
    33 SÍ es capicúa.
    
    Introduce un número de dos cifras: 47
    47 NO es capicúa.
    ```

(Puedes mostrar ambos mensajes condicionados a una comparación booleana, sin necesitar `if`.)

---

### A11. Funciones avanzadas de Math

Sin usar `if`, diseña un programa que pida un número real y muestre:

| Operación | Método Java | Resultado |
|---|---|---|
| Valor absoluto | `Math.abs()` | |
| Raíz cuadrada | `Math.sqrt()` | |
| `e` elevado al número | `Math.exp()` | |
| Logaritmo neperiano | `Math.log()` | |
| Logaritmo en base 10 | `Math.log10()` | |
| Redondeo al entero más próximo | `Math.round()` | |

Prueba con los valores `2.0`, `0.5` y `-3.0`. Para `-3.0`, ¿qué pasa con `Math.sqrt()` y `Math.log()`? ¿Y con `Math.abs(-3.0)` antes?

---

### A12. Reto: Calculadora básica

Diseña e implementa una **calculadora de consola** que:

1. Pida al usuario dos números reales.
2. Pida el operador a aplicar (`+`, `-`, `*`, `/`, `%`), leído como `String` o `char`.
3. Muestre el resultado de la operación.
4. Si el operador es `/` o `%` y el segundo número es `0`, muestre `"Error: división por cero"`.
5. Si el operador no es ninguno de los anteriores, muestre `"Operador no reconocido"`.

!!! warning "Scanner y char"
    `Scanner` no tiene `nextChar()`. Lee el operador con `nextLine()` y extrae el primer carácter con `.charAt(0)`, o compara directamente el `String`.

!!! example "Ejemplo de salida"
    ```
    Número 1: 15
    Número 2: 4
    Operador (+, -, *, /, %): /
    15.0 / 4.0 = 3.75
    
    Número 1: 10
    Número 2: 0
    Operador (+, -, *, /, %): /
    Error: división por cero
    ```

!!! info "Estructura sugerida"
    Puedes implementar este ejercicio con **sentencias `if-else` encadenadas** (las verás en detalle en UD2) o con un bloque `switch`. Ambas soluciones son válidas — elige la que te resulte más natural.
