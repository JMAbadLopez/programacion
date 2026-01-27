# Ejercicios Unidad 5: Programación Orientada a Objetos (Avanzado)

**Instrucciones Generales:**

* Crea un proyecto nuevo en tu IDE llamado `AvanzadoPOO`.
* Para cada ejercicio, implementa la clase solicitada y una clase `Main` para realizar las pruebas.
* Asegúrate de seguir los principios de encapsulamiento (atributos privados y métodos públicos) donde se indique.

---

## 1. Registro de Personas (IMC y Edad)

**Enunciado:** Crea una clase `Persona` para gestionar datos personales y calcular indicadores de salud.

**Detalles Técnicos:**

* **Atributos (Privados):** `nombre`, `edad`, `DNI` (no modificable tras su creación), `sexo` (H/M), `peso` y `altura`.
* **Constructores:**
    1. Vacío (valores por defecto).
    2. Nombre, edad y sexo (resto por defecto).
    3. Todos los atributos.
* **Métodos:**
    * `int calcularIMC()`: Calcula el índice de masa corporal (`peso / altura^2`). Devuelve:
        * **-1**: Por debajo del peso ideal (IMC < 20).
        * **0**: Peso ideal (IMC entre 20 y 25, inclusive).
        * **1**: Sobrepeso (IMC > 25).
    * `boolean esMayorDeEdad()`: `true` si es >= 18.
    * `String toString()`: Devuelve toda la información formateada.
    * `private void generarDNI()`: Genera un número y letra aleatorios al crear el objeto.

**Ponlo a prueba en el main:** Pide datos por consola para un objeto, crea otros dos con valores fijos y muestra para cada uno su IMC, si es mayor de edad y su ficha completa.

**Ejemplo de Salida por Consola:**
```text
[FICHA PERSONA]

Persona 1: Juan Pérez
Resultado IMC: Peso ideal.
¿Es mayor de edad?: Sí.

Información completa:
[Nombre: Juan Pérez, Edad: 25, DNI: 12345678X, Sexo: H, Peso: 75.5kg, Altura: 1.80m]
```

---

## 2. El Juego del Conecta 4

**Enunciado:** Crea una clase `Conecta4` que represente el clásico juego de estrategia en un tablero de 6 filas y 7 columnas. El tablero debe representarse mediante una matriz de caracteres (`char[][]`).

**Detalles Técnicos:**

* **Atributos:**
    * `tablero`: Matriz de 6x7.
* **Métodos:**
    * **Constructor:** Inicializa el tablero con espacios vacíos o un carácter neutral (ej: '.').
    * `boolean estaDisponible(int fila, int columna)`: Devuelve `true` si la posición está libre.
    * `void setFicha(int fila, int columna, char ficha)`: Coloca una 'X' o una 'O' en la posición indicada.
    * `boolean esO(int fila, int columna)` y `boolean esX(int fila, int columna)`: Verifican qué ficha hay en la posición.
    * `void mostrarTablero()`: Imprime el tablero de forma legible en la consola.

**Ponlo a prueba en el main:** Crea un programa que permita a dos jugadores insertar fichas alternativamente. Muestra el tablero después de cada jugada.

**Ejemplo de Salida por Consola:**
```text
Jugador 1 (X), elige columna (0-6): 3
. . . . . . . 
. . . . . . . 
. . . . . . . 
. . . . . . . 
. . . . . . . 
. . . X . . . 

Jugador 2 (O), elige columna (0-6): 3
. . . . . . . 
. . . . . . . 
. . . . . . . 
. . . . . . . 
. . . O . . . 
. . . X . . . 
```

---

## 3. El Desafío del Puzle 15

**Enunciado:** Crea una clase `Puzle` para resolver el rompecabezas de 15 piezas en un tablero de 4x4. El objetivo es ordenar los números del 1 al 15, dejando el hueco (representado por el 0) en la última posición.

**Detalles Técnicos:**

* **Atributos:**
    * `matriz`: Matriz de 4x4 de enteros.
    * `filaVacia`, `columnaVacia`: Posición actual del hueco (0).
* **Métodos:**
    * **Constructor:** Recibe una matriz de configuración inicial y localiza el hueco.
    * `boolean moverArriba()`, `moverAbajo()`, `moverIzquierda()`, `moverDerecha()`: Desplazan la pieza adyacente al hueco. Devuelven `false` si el movimiento es imposible (ej: mover arriba si el hueco está en la última fila).
    * `boolean estaResuelto()`: Comprueba si los números están en orden (1-15) y el 0 al final.
    * `void mostrar()`: Dibuja el tablero actual.

**Ponlo a prueba en el main:** Inicializa un puzle, muéstralo, realiza varios movimientos y verifica si se ha resuelto.

**Ejemplo de Salida por Consola:**
```text
Configuración Actual:
 1  2  3  4
 5  6  7  8
 9 10 11 12
13 14  0 15

- ¿Hacia dónde quieres mover? (arriba (A), abajo (B), izquierda (I), derecha (D)): D

Moviendo a la derecha...
 1  2  3  4
 5  6  7  8
 9 10 11 12
13 14 15  0

¡Felicidades! El puzle está resuelto.
```

---

## 4. Gestión de Librería

**Enunciado:** Crea un sistema para gestionar una colección de objetos `Libro` utilizando un `ArrayList`.

**Detalles Técnicos:**

* **Clase Libro:** Atributos (`ISBN`, `titulo`, `autor`, `numPaginas`) con getters/setters y `toString`.
* **Clase Main:** Implementa un menú interactivo:
    1. Añadir libro.
    2. Mostrar todos.
    3. Buscar por ISBN.
    4. Eliminar por ISBN.
    5. Vaciar lista.

**Ponlo a prueba en el main:** Mantén el programa en ejecución hasta que el usuario elija "Salir".

**Ejemplo de Salida por Consola:**
```text
--- MENÚ LIBRERÍA ---
1. Añadir Libro
2. Mostrar Libros
3. Salir
Seleccione opción: 2

Listado actual:
- El Quijote (ISBN: 978123) - Miguel de Cervantes. 500 págs.
- Java 17 (ISBN: 978456) - Kathy Sierra. 700 págs.
```

---

## 5. Sistema de Gestión de Empleados

**Enunciado:** Diseña un programa para administrar una plantilla de empleados con funciones avanzadas de búsqueda y ordenación.

**Detalles Técnicos:**

* **Atributos:** `id` (único), `nombre`, `puesto`, `salario`.
* **Gestión de Datos:** Puedes utilizar un `ArrayList` de empleados, o un `HashMap<Integer, Empleado>` si deseas optimizar las búsquedas por ID.
* **Funcionalidades del Menú:**
    1. **Registrar Empleado:** Validar que el ID no se repita.
    2. **Buscar por Puesto:** Filtrar y mostrar todos los empleados de un área.
    3. **Aumentar Salario:** Por ID y porcentaje.
    4. **Estadísticas:** Mostrar el empleado con mayor salario y el total de las nóminas.
    5. **Ordenar:** Permitir ordenar la lista por salario de forma ascendente.

**Ejemplo de Salida por Consola:**
```text
--- GESTIÓN DE EMPLEADOS ---
1. Registrar
2. Estadísticas
3. Salir
Opción: 2

Empleado con más sueldo: Ana López (Analista) - 3500.0€
Inversión total en nóminas: 12450.75€
```
