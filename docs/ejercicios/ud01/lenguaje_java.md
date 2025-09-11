| Fecha      | Versión | Descripción                 |
| ---------- | ------- | --------------------------- |
| 14/09/2021 | 1.0.0   | Versión inicial             |
| 01/09/2025 | 1.0.1   | Revisión de los ejercicios. |
| 11/09/2025 | 1.0.5   | Adaptación mkdocs. |



# Ejercicios Unidad 1 - Introducción a la la programación. El lenguaje Java.

## 1. Ejercicios de aproximación.

1. Si no tienes acceso a un IDE de Java, en la sección *recursos* de la plataforma encontrarás las instrucciones de instalación del IDE *IntelliJ* que usamos en clase.

2. Escribe y compila el programa *¡Hola Mundo!* (visto en los apuntes). Si cometes algún error de sintaxis el compilador te indicará dónde encontrarlo. Corrígelo y vuelve a compilar el programa hasta que no tengas ningún error y puedas ejecutarlo sin problema.

3. Crea un nuevo programa y sustituye el código por el siguiente. Compílalo y soluciona los errores que tenga:

```java
public class {
	public Static void main(String[] args){
		system.out.println( I want this program to compile)
	}
```

4. Escribe un programa que muestre tu *nombre, dirección* y *número de teléfono* cada uno en líneas separadas.
5. Adapta el programa anterior para incluir una línea en blanco entre su dirección y su número de teléfono.

## 2. Tipos de datos: Entrada y salida.

1. ¿Cuál sería el tipo de datos Java más apropiado para usar con los siguientes elementos de datos?

   - El número máximo de personas permitidas en el aula.

   - El peso de un alimento comprado en un supermercado.

   - La calificación otorgada a un estudiante (por ejemplo, "A", "B" o "C").

2. Explica cuál, si alguna, de las siguientes líneas resultaría en un error del compilador:

   ```Java
   int x = 75.5;
   double y = 75;
   ```

3. ¿Cuáles de los siguientes serían nombres válidos para una variable en Java?

   - ticket


   - entradas de cine


   - entradasdecine


   - entradas_de_cine


   - void


   - Ticket

4. Identifica y corrige los errores en el programa proporcionado a continuación, (solicita la edad del usuario e intenta devolver el año de nacimiento).

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

5. ¿Cuál es el valor final de z en el siguiente programa?

```Java
public class ValorZ
{
	public static void main (String[] args)
		{
			int x, y, z;
			x = 5;
			y = x + 2;
			x = 10;
			z = y * x;
		}
}
```

6. ¿Cuál sería el resultado final del programa a continuación si el usuario introduce el número 10?

```Java
import java.util.Scanner;
public class Calcula
{
	public static void main(String[] args )
	{
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		num2 = 6;
		System.out.print("Introduce valor ");
		num1 = sc.nextInt();
		num1 = num1 + 2;
		num2 = num1 / num2;
		num2 = ++num2;
		num1 = num2 * num1++;
		num2 = ++num1%2;
		System.out.println("Resultado = " + num2);
	}
}
```

7. Utiliza pseudocódigo para diseñar un programa que le pide al usuario que introduzca valores para la longitud y la altura de un rectángulo y luego muestra el área y el perímetro de ese rectángulo.

8. El siguiente programa fue escrito en un intento de intercambiar el valor de dos variables. Sin embargo, no da el resultado deseado:

```Java
import java.util.Scanner;
public class intercambio
{
	public static void main(String[] args)
	{
		// declaración de variables
		int x, y;
		// Introducción de datos
		System.out.print("Escriba el valor para x ");
		x = sc.nextInt();
		System.out.print("Escriba el valor para y ");
		y = sc.nextInt();
		// Código que intercambia los valores
		x = y;
		y = x;
		//muestra resultado
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
```

- ¿Puedes ver por qué el programa no hace lo que esperábamos?

- ¿Cuál sería el resultado real del programa?

- ¿Cómo podríamos modificar el programa anterior para que los valores de las dos variables se intercambien correctamente?

- Detecta los errores y propón una solución para ello.

## 3. Ejercicios de programación

------



1. Implementa el algoritmo que realice la siguiente funcionalidad desarrollada en pseudocódigo:

   ```
   PROGRAMA COSTES
   	BEGIN
   		ESCRIBIR titulo programa
   		
   		ESCRIBIR Introducir el precio
   		
   		LEER precio
   		
   		ESCRIBIR Introducir los impuestos
   		
   		LEER impuestos
   		
   		precio = precio * (1 + impuestos/100)
   		
   		ESCRIBIR precio
   	END
   ```

   

2. Implementa el programa de rectángulo que diseñó en la pregunta 7 de los ejercicios anteriores.

3. El índice de masa corporal *IMC* de una persona es una medida del peso de una persona en relación con su altura. Se calcula de la siguiente manera:

```
Se divide el peso de una persona (kg) por el cuadrado de su altura (metros)
```

* Diseña e implementa un programa que le permita al usuario ingresar su peso y estatura y luego imprimir su *IMC*.

4. A un grupo de estudiantes se le indica que formen equipos de un tamaño específico para unos cursos.

* Diseña e implementa un programa que solicite el número de estudiantes del grupo y el tamaño de los equipos que se formarán. El programa mostrará el número de equipos formados y cuántos estudiantes quedan sin equipo.

