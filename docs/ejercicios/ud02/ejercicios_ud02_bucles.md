# Boletín de Ejercicios: Bucles y Condicionales

!!! info "Resultados de Aprendizaje"
    Este boletín trabaja los siguientes RAs del módulo de **Programación**:

    - **RA2, RA3, RA5 y RA6** — Escribe y depura código analizando y utilizando las estructuras de control del lenguaje. Desarrolla programas aplicando la programación estructurada e introduciendo el tratamiento de datos.

---

## 1. El Control de Acceso a la Discoteca

**Reto:** Programa un sistema que pida la edad al usuario y muestre un mensaje según las siguientes reglas:

| Edad | Mensaje |
|---|---|
| ≥ 18 años | "Puedes pasar" |
| 16–17 años | "Puedes pasar, pero solo a la sesión light" |
| < 16 años | "No puedes pasar" |

!!! note "Concepto practicado"
    Estructura `if-else if-else`.

---

## 2. La Cuenta Atrás para el Lanzamiento

**Reto:** Crea un programa que simule la cuenta atrás para el lanzamiento de un cohete. Muestra los números del 10 al 1 y, al final, el mensaje "¡Despegue!".

!!! note "Concepto practicado"
    Bucle `for`.

---

## 3. El Validador de Contraseñas

**Reto:** Escribe un programa que pida al usuario una contraseña. La contraseña correcta es `"programacion101"`. El programa debe seguir pidiéndola hasta que el usuario acierte. Al lograrlo, muestra "Acceso concedido".

!!! note "Concepto practicado"
    Bucle `while`, comparación de `String` con `equals()`.

!!! warning "Recuerda"
    Para comparar el contenido de dos `String` **nunca uses `==`**. Usa siempre `equals()`.

---

## 4. El Menú del Guerrero

**Reto:** Diseña el menú de acciones de un videojuego usando `switch`. Muestra un mensaje diferente para cada opción y uno especial si la opción no es válida.

| Opción | Acción |
|---|---|
| 1 | Atacar |
| 2 | Defender |
| 3 | Usar Poción |
| 4 | Salir del juego |

!!! note "Concepto practicado"
    Estructura `switch`.

---

## 5. Calculadora de Promedios

**Reto:** Un profesor necesita calcular la nota media de su clase. El programa debe preguntar primero cuántos alumnos hay y, usando un bucle, pedir la nota de cada uno. Al final, muestra la nota media.

!!! note "Conceptos practicados"
    Bucle `for`, **acumulador** para la suma total, **contador** (implícito en el bucle `for`).

---

## 6. ¿Jugamos Otra Vez?

**Reto:** Crea un programa que pida dos números y muestre su suma. Tras mostrar el resultado, pregunta: `"¿Deseas realizar otra suma? (s/n)"`. El programa se repite mientras el usuario responda `'s'` o `'S'`.

!!! note "Concepto practicado"
    Bucle `do-while`, ya que la primera suma se realiza siempre.

---

## 7. El Dibujante de Cuadrados

**Reto:** Pide al usuario un número entero. El programa dibuja un cuadrado de asteriscos (`*`) de ese tamaño. Por ejemplo, si el usuario introduce `4`:

```
* * * *
* * * *
* * * *
* * * *
```

!!! note "Concepto practicado"
    **Bucles `for` anidados.** El bucle exterior controla las filas; el interior, las columnas.

---

## 8. La Secuencia FizzBuzz

**Reto:** Pide un número entero. Muestra la secuencia del 1 hasta ese número aplicando estas reglas:

| Condición | Muestra |
|---|---|
| Múltiplo de 3 **y** de 5 | `FizzBuzz` |
| Solo múltiplo de 3 | `Fizz` |
| Solo múltiplo de 5 | `Buzz` |
| Ninguna de las anteriores | El número |

!!! note "Conceptos practicados"
    Bucle `for`, `if-else if-else`, operador módulo `%`.

!!! tip "Pista"
    Comprueba primero si es múltiplo de 15 (de 3 **y** 5 a la vez) antes de comprobar si es múltiplo de 3 o de 5 por separado.

---

## 9. El Cajero Automático Interactivo

**Reto:** Simula un cajero automático con un saldo inicial de 1000€. El programa muestra un menú y se repite hasta que el usuario elija "Salir".

| Opción | Acción |
|---|---|
| 1 | Ingresar dinero — pide una cantidad y la suma al saldo |
| 2 | Retirar dinero — pide una cantidad; si hay saldo la resta, si no, error |
| 3 | Consultar saldo — muestra el saldo actual |
| 4 | Salir |

!!! note "Conceptos practicados"
    Bucle `do-while` para el menú, `switch` para las opciones, `if-else` para la validación del saldo.
