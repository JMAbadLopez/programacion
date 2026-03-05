# Ejercicios UD07: Ficheros y Excepciones

En esta serie de ejercicios practicaremos la persistencia de datos en Java, desde la manipulación básica del sistema de archivos hasta la creación de sistemas robustos con gestión de errores profesional.

---

## Ejercicio 1: El Inspector de Rutas (Nivel: Básico)

**Objetivo:** Familiarizarse con la clase `File` y la inspección de metadatos.

Crea un programa llamado `InspectorRutas` que realice lo siguiente:

1. Pida al usuario por teclado una ruta (String) a un archivo o carpeta.
2. Utilice la clase `File` para comprobar si esa ruta existe físicamente.
3. Si existe:
    - Muestra si es un **Fichero** o un **Directorio**.
    - Muestra su **Ruta Absoluta**.
    - Si es un fichero, muestra su **tamaño en bytes**.
4. Si no existe:
    - Informa al usuario y pregúntale si desea crear un nuevo archivo vacío con ese nombre.
    - Si responde "sí", utiliza `createNewFile()` para materializarlo.

---

## Ejercicio 2: El Contador de Palabras (Nivel: Intermedio)

**Objetivo:** Lectura básica de ficheros con `Scanner`.

Crea manualmente un archivo de texto llamado `quijote.txt` y pega en él los primeros párrafos del libro. A continuación, desarrolla un programa que:

1. Abra el archivo `quijote.txt` mediante un objeto `Scanner`.
2. Recorra todo el archivo contando cuántas palabras contiene en total (utiliza `sc.hasNext()` y `sc.next()`).
3. Muestra por pantalla el resultado final: "El archivo contiene X palabras".
4. **Extra:** Modifica el programa para que también cuente cuántas líneas tiene el archivo.

---

## Ejercicio 3: Procesador de Notas Seguro (Nivel: Intermedio)

**Objetivo:** Uso de excepciones para validar la entrada de datos (`InputMismatchException`).

Imagina que tienes un archivo `notas.txt` con el siguiente formato:
`8,5 4,0 7,2 9,0 6,5`

Crea un programa que lea este archivo y calcule la nota media. Sin embargo, el programa debe ser robusto:

1. Si el archivo contiene algo que no sea un número (ej: una letra "A" por error), el programa debe capturar la excepción `InputMismatchException` o `NoSuchElementException`.
2. En lugar de cerrarse con error, el programa debe saltar ese "token" erróneo, informar al usuario ("Se ha ignorado un dato no válido") y continuar procesando el resto de las notas.
3. Muestra la media final de los datos que sí sean válidos.

---

## Ejercicio 4: Agenda Telefónica (Nivel: Avanzado)

**Objetivo:** Escritura estructurada y persistencia de colecciones.

Crea una clase `Contacto` con atributos `nombre` (String), `edad` (int) y `telefono` (String). Luego, desarrolla un programa que:

1. Cree un `ArrayList<Contacto>` y añada varios contactos a la lista.
2. Implemente un método `guardarAgenda(ArrayList<Contacto> lista, String archivo)` que guarde cada contacto en el archivo `agenda.txt`. Cada contacto debe ocupar tres líneas: nombre, edad y teléfono.
3. Implemente un método `cargarAgenda(String archivo)` que lea el archivo, reconstruya los objetos `Contacto` y los añada a un `ArrayList`.
4. Muestra el contenido de la agenda por pantalla tras cargarla del archivo para verificar la persistencia.

---

## Ejercicio 5: Registro de Libros (Nivel: Experto)

**Objetivo:** Sistema completo con Menú, Modo Append y Try-with-resources.

Desarrolla una aplicación para gestionar una biblioteca personal. Implementa la clase `Libro` con los siguientes atributos: `autor`, `titulo`, `anyo` (int), `numPaginas` (int) y `precio` (double). El programa debe mostrar un menú interactivo:

1. **Añadir Libro:** Pide los datos del libro por teclado. Guarda estos datos al final del archivo `biblioteca.txt` usando `FileOutputStream(archivo, true)` y `PrintStream`. Asegúrate de guardar cada atributo en una línea distinta. Utiliza obligatoriamente la estructura **try-with-resources**.
2. **Listar Biblioteca:** Lee el archivo `biblioteca.txt` y muestra todos los libros registrados de forma legible. Si el archivo no existe, captura la `FileNotFoundException` para mostrar el mensaje: "La biblioteca está vacía.".
3. **Vaciar Estantería:** Borra físicamente el archivo `biblioteca.txt` del disco.
4. **Salir.**

**Reto extra:** Asegúrate de que el flujo de datos se cierre automáticamente en todas las operaciones usando `try-with-resources`.