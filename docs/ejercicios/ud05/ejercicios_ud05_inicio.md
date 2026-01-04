# Ejercicios Unidad 5: Iniciación a la Programación Orientada a Objetos

**Instrucciones Generales:**

* Crea un proyecto nuevo en tu IDE llamado `InicioPOO`.
* Para cada ejercicio, crea la clase que se pide (ej: `Libro.java`) y una clase principal para probarla (ej: `MainLibro.java`). 

## 1. La Biblioteca Básica

**Enunciado:** Crea una clase llamada `Libro` que represente un libro físico. Debe tener los siguientes atributos públicos:

* `titulo` (String)
* `autor` (String)
* `numPaginas` (int)
* `valoracion` (int, del 0 al 10). 
  
Incluye un método `mostrarInfo()` que imprima por consola los detalles (ej: *"El libro 'Quijote' de Cervantes tiene 500 páginas..."*).

Finalmente, **ponlo a prueba en el main**: crea dos objetos `Libro` distintos, asígnales valores directamente a sus atributos públicos y llama a su método `mostrarInfo`.

## 2. La Playlist Protegida

**Enunciado:** Crea una clase `Cancion` donde los datos estén protegidos (encapsulamiento). 

Define los atributos privados:

* `titulo` (String)
* `autor` (String)
* `duracion` (int, en segundos).

Debes implementar los métodos **Getters y Setters** para todos los atributos.

* *Lógica:* En el método `setDuracion`, si el valor recibido es negativo, asigna 0 e imprime un aviso por consola ("Error: Duración negativa").

**Ponlo a prueba en el main:** Intenta acceder a los atributos directamente (verás que falla). Usa los setters para configurar una canción (prueba a poner una duración negativa para ver el error) y usa los getters para imprimir el resultado final.

## 3. El Estudiante Constructor

**Enunciado:** Crea una clase `Alumno` que obligue a proporcionar datos al nacer (Constructores). 

Tendrá atributos privados:

* `nombre` (String)
* `edad` (int)
* `curso` (String).

Implementa dos constructores:

1. **Constructor Completo:** Recibe los 3 datos y los asigna (usa `this` para diferenciar).
2. **Constructor Rápido:** Solo recibe `nombre` y `edad`. Por defecto, asigna el curso "1º DAM".

**Ponlo a prueba en el main:** Crea un alumno "Juan" usando el constructor completo y una alumna "Maria" usando el constructor rápido. Muestra los datos de ambos para verificar que María ha sido matriculada correctamente en "1º DAM".

## 4. El Banco Seguro

**Enunciado:** Crea una clase `CuentaBancaria` con lógica de negocio real. 

Tendrá atributos privados:

* `numCuenta` (String)
* `titular` (String)
* `saldo` (double).

* **Constructor:** Obliga a introducir el nombre del titular al crear la cuenta. El saldo inicial será siempre 0.

* **Métodos:**
  
    * `ingresar(double cantidad)`: Suma la cantidad al saldo (solo si es positiva).
    * `retirar(double cantidad)`: Resta la cantidad. **OJO:** No se puede retirar si no hay saldo suficiente o si la cantidad es negativa. Muestra mensajes de error si la operación falla.
    * **privado** `generarNumCuenta()`: Genera un número de cuenta de 12 dígitos (puedes usar *random* de la clase *Math*, como hemos visto en otras unidades)

**Ponlo a prueba en el main:** Crea una cuenta a tu nombre. Ingresa 1000€. Intenta retirar 2000€ (debe fallar). Luego retira 500€. Imprime el saldo final para comprobar que te quedan 500€.

## 5. La Flota de Bicicletas (Estáticos)

**Enunciado:** Vamos a gestionar una tienda de bicis. Crea una clase `Bicicleta`.

1. **Atributos de Instancia (Privados):** `marca` (String), `modelo` (String).
2. **Atributo de Clase (Estático):** `contadorBicicletas` (int). Este contador es compartido por todas las bicis.
3. **Constructor:** Recibe marca y modelo. Además, debe aumentar en 1 el `contadorBicicletas` cada vez que se ejecute.
4. **Método Estático:** `getBicicletasTotales()` que devuelva el valor actual del contador.

**Ponlo a prueba en el main:**

* Imprime el número de bicicletas antes de crear ninguna (debería ser 0).
* Crea 3 objetos `Bicicleta` diferentes (ej: "Orbea", "Trek", "Specialized").
* Vuelve a imprimir el número total llamando al método estático de la clase `Bicicleta`. ¿Marca 3?
