# Boletín de Ejercicios: Bucles y Condicionales

Este boletín de ejercicios está diseñado para trabajar y evaluar los siguientes **Resultados de Aprendizaje (RAs)** del módulo de **Programación**:

_ **RA2, RA3, RA5 y RA6**
    - **Escribe y depura código, analizando y utilizando las estructuras de control del lenguaje.**
    - **Desarrolla programas aplicando la programación estructurada e introduciendo el tratamiento de datos.**

## 1. El Control de Acceso a la Discoteca

**Reto:** Programa un sistema que pida la edad al usuario. Si es mayor o igual a 18 años, debe mostrar un mensaje de "Puedes pasar". Si tiene entre 16 y 17 años, puede pasar pero solo a la sesión "light". Si es menor de 16, no puede pasar.

**Conceptos:** Estructura `if-else if-else`.

## 2. La Cuenta Atrás para el Lanzamiento

**Reto:** Crea un programa que simule la cuenta atrás para el lanzamiento de un cohete. Debe mostrar por pantalla los números del 10 al 1 y, al final, la palabra "¡Despegue!".

**Conceptos:** Bucle `for`.

## 3. El Validador de Contraseñas

**Reto:** Escribe un programa que pida al usuario una contraseña. La contraseña correcta es "programacion101". El programa debe seguir pidiendo la contraseña hasta que el usuario la acierte. Cuando lo haga, mostrará un mensaje de "Acceso concedido".

**Conceptos:** Bucle `while`, comparación de `String`.

## 4. El Menú del Guerrero

**Reto:** Estás diseñando un videojuego. Crea un menú que le pregunte al personaje qué acción desea realizar, usando un `switch`.

1. Atacar
2. Defender
3. Usar Poción
4. Salir del juego

El programa debe mostrar un mensaje diferente para cada opción elegida. Si se elige una opción no válida, debe indicarlo.

**Conceptos:** Estructura `switch`.

## 5. Calculadora de Promedios

**Reto:** Un profesor necesita una herramienta para calcular la nota media de su clase. El programa debe preguntar primero cuántos alumnos hay. Luego, usando un bucle, debe pedir la nota de cada uno de ellos y, al final, mostrar la nota media de la clase.

**Conceptos:** Bucle `for`, `acumulador` para la suma total y `contador` (implícito en el bucle).

## 6. ¿Jugamos Otra Vez?

**Reto:** Crea un programa que pida dos números al usuario y muestre su suma. Después de mostrar el resultado, debe preguntar: "¿Deseas realizar otra suma? (s/n)". El programa se repetirá mientras el usuario responda 's' o 'S'.

**Conceptos:** Bucle `do-while`, ya que la primera suma se realiza siempre.

## 7. El Dibujante de Cuadrados

**Reto:** Pide al usuario un número entero. El programa debe dibujar un cuadrado de asteriscos (`*`) de ese tamaño. Por ejemplo, si el usuario introduce 4, la salida debe ser:

```bash
* * * *
* * * *
* * * *
* * * *

```

**Conceptos:** Bucles for anidados.

## 8. La Secuencia FizzBuzz

**Reto:** Pide al usuario un número entero. El programa debe mostrar la secuencia de números desde 1 hasta el número introducido, pero con una regla: si un número es múltiplo de 3, en su lugar se escribe "Fizz"; si es múltiplo de 5, se escribe "Buzz"; y si es múltiplo de ambos (3 y 5), se escribe "FizzBuzz".

**Conceptos:** Bucle ```for, if-else if-else```, operador módulo (```%```).

## 9. El Cajero Automático Interactivo

**Reto:** Simula un cajero automático con un saldo inicial de 1000€. El programa mostrará un menú y se repetirá hasta que el usuario elija "Salir".

1. Ingresar dinero: Pide una cantidad y la suma al saldo.

2. Retirar dinero: Pide una cantidad. Si hay saldo suficiente, la resta. Si no, muestra un mensaje de error.

3. Consultar saldo: Muestra el saldo actual.

4. Salir.

**Conceptos:** Bucle ```do-while``` para el menú, ```switch``` para las opciones, ```if-else``` para la validación del saldo.
