# Ejercicios UD1 — El lenguaje Java

!!! info "Antes de empezar"
    Para estos ejercicios necesitas tener **IntelliJ IDEA** instalado. Si aún no lo tienes, consulta la guía de instalación en la sección *Recursos* de la plataforma.

---

## 1. Primeros pasos

**Objetivo:** familiarizarse con el entorno y escribir los primeros programas.

1. Crea un proyecto nuevo en IntelliJ y escribe el programa **¡Hola Mundo!** de los apuntes. Ejecútalo y comprueba que muestra el mensaje correctamente.

2. Sustituye el código por el siguiente. Compílalo, **detecta los errores** y corrígelos uno a uno hasta que compile y ejecute sin problemas:

    ```java
    public class {
        public Static void main(String[] args){
            system.out.println( I want this program to compile)
        }
    ```

    !!! question "Pista"
        Hay al menos 4 errores de distinta naturaleza. El compilador te indicará la línea de cada uno, pero no siempre el motivo exacto. Lee el mensaje con atención.

3. Escribe un programa que muestre tu **nombre**, **dirección** y **número de teléfono**, cada dato en una línea separada.

4. Modifica el programa anterior para añadir una **línea en blanco** entre la dirección y el teléfono.

---

## 2. Tipos de datos: entrada y salida

**Objetivo:** comprender los tipos de datos y practicar la lectura/escritura básica.

### 2.1 Tipos de datos adecuados

¿Cuál sería el tipo Java más apropiado para cada dato? Justifica tu respuesta.

| Dato | Tipo Java | Justificación |
|---|---|---|
| Número máximo de personas en el aula | | |
| Peso de un alimento (en kg) | | |
| Calificación de un alumno ("A", "B", "C") | | |
| Si el alumno ha aprobado o no | | |
| Temperatura en grados Celsius | | |

### 2.2 Errores de compilación

¿Cuáles de las siguientes líneas producirían un **error del compilador**? Explica por qué:

```java
int x = 75.5;
double y = 75;
```

### 2.3 Identificadores válidos en Java

Indica cuáles serían nombres válidos para una variable en Java y explica los que no:

| Identificador | ¿Válido? | Motivo |
|---|---|---|
| `ticket` | | |
| `entradas de cine` | | |
| `entradasdecine` | | |
| `entradas_de_cine` | | |
| `void` | | |
| `Ticket` | | |

### 2.4 Detecta y corrige los errores

El siguiente programa intenta solicitar la edad del usuario y calcular su año de nacimiento. Tiene varios errores — **identifícalos, explícalos y corrígelos**:

```java
import java.util.Scanner;
public class Nacimiento
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        final int ANYO;
        int edad, nacidoEn;

        System.out.print(Cuántos años tienes? );
        
        edad = keyboard.nextDouble();
        
        nacidoEn = ANYO – edad;
        
        System.out.println("Creo que naciste en " + NacidoEn);
    }
}
```

!!! tip "Pista"
    Hay al menos 5 errores. Algunos son de sintaxis (el compilador los detecta) y otros son lógicos.

### 2.5 Traza: valor final de una variable

¿Cuál es el valor final de `z` en este programa? Razona el resultado **sin ejecutarlo**:

```java
int x, y, z;
x = 5;
y = x + 2;  // ¿cuánto vale y aquí?
x = 10;     // ¿cambia el valor de y?
z = y * x;  // ¿cuánto vale z?
```

### 2.6 Traza: ¿qué imprime el programa?

Si el usuario introduce el número **10**, ¿qué imprime este programa? Trázalo paso a paso:

```java
import java.util.Scanner;
public class Calcula
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        
        num2 = 6;
        System.out.print("Introduce valor: ");
        num1 = sc.nextInt();   // el usuario escribe 10
        num1 = num1 + 2;
        num2 = num1 / num2;
        num2 = ++num2;
        num1 = num2 * num1++;
        num2 = ++num1 % 2;
        System.out.println("Resultado = " + num2);
    }
}
```

!!! tip "Cómo hacer la traza"
    Crea una tabla con las columnas `num1` y `num2` y actualiza su valor tras cada instrucción.

### 2.7 Pseudocódigo: área y perímetro de un rectángulo

Diseña en **pseudocódigo** un programa que:

1. Pide al usuario la longitud y la altura de un rectángulo.
2. Calcula el área y el perímetro.
3. Muestra ambos resultados.

### 2.8 Intercambio de variables

El siguiente programa intenta intercambiar los valores de dos variables, pero **no funciona correctamente**:

```java
import java.util.Scanner;
public class Intercambio
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x, y;
        
        System.out.print("Escribe el valor para x: ");
        x = sc.nextInt();
        System.out.print("Escribe el valor para y: ");
        y = sc.nextInt();
        
        // Intento de intercambio
        x = y;
        y = x;
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
```

Responde:

1. ¿Por qué el programa no hace lo que esperábamos?
2. ¿Cuál sería el resultado real si el usuario introduce `x = 3` e `y = 7`?
3. ¿Cómo lo corregirías? Escribe el código correcto.
4. Además del error lógico, hay otro error de compilación. ¿Cuál es?

---

## 3. Programación en Java

**Objetivo:** implementar en Java los algoritmos diseñados en pseudocódigo.

### 3.1 Programa de costes

Implementa el siguiente algoritmo en Java:

```
PROGRAMA COSTES
  INICIO
    ESCRIBIR título del programa
    ESCRIBIR "Introduce el precio:"
    LEER precio
    ESCRIBIR "Introduce los impuestos (%):"
    LEER impuestos
    precio ← precio * (1 + impuestos / 100)
    ESCRIBIR "Precio con impuestos:", precio
  FIN
```

### 3.2 Área y perímetro del rectángulo

Implementa en Java el programa que diseñaste en pseudocódigo en el ejercicio 2.7.

### 3.3 Índice de Masa Corporal (IMC)

El IMC se calcula dividiendo el peso (en kg) entre el cuadrado de la altura (en metros).

Diseña e implementa un programa que:

1. Pida al usuario su peso y su altura.
2. Calcule el IMC.
3. Muestre el resultado con un mensaje descriptivo.

!!! example "Ejemplo de salida"
    ```
    Introduce tu peso (kg): 70
    Introduce tu altura (m): 1.75
    Tu IMC es: 22.86
    ```

### 3.4 Formación de equipos

Un grupo de estudiantes debe formar equipos de un tamaño fijo.

Diseña e implementa un programa que:

1. Pida el número total de estudiantes del grupo.
2. Pida el tamaño deseado de cada equipo.
3. Muestre cuántos equipos completos se forman y cuántos estudiantes quedan sin equipo.

!!! tip "Pista"
    El operador `/` (división entera) y `%` (módulo) son tus amigos aquí.

    ??? question "¿Necesitas más ayuda?"
        - Número de equipos completos → `estudiantes / tamañoEquipo`
        - Estudiantes sin equipo → `estudiantes % tamañoEquipo`
