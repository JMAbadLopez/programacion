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

## Ejercicio 4: Serialización de la "Lista de Deseos" (Nivel: Avanzado)

**Objetivo:** Escritura estructurada y persistencia de colecciones.

Crea una clase `Producto` con atributos `nombre` (String) y `precio` (double). Luego, desarrolla un programa que:

1. Cree un `ArrayList<Producto>` y añada 3 o 4 objetos creados por ti.
2. Implemente un método `guardarLista(ArrayList<Producto> lista, String nombreArchivo)` que recorra la lista y guarde cada producto en el archivo, escribiendo el nombre en una línea y el precio en la siguiente.
3. Implemente un método `cargarLista(String nombreArchivo)` que lea el archivo, reconstruya los objetos `Producto` y los devuelva en un nuevo `ArrayList`.
4. Muestra la lista final por consola para verificar que la información ha "sobrevivido" al proceso de guardado y carga.

---

## Ejercicio 5: Registro del Gremio Pro (Nivel: Experto)

**Objetivo:** Sistema completo con Menú, Modo Append y Try-with-resources.

Desarrolla una aplicación para gestionar los aventureros de un gremio. El programa debe mostrar un menú interactivo:

1. **Inscribir Aventurero:** Pide el nombre y la clase (Guerrero, Mago, etc.). Guarda estos datos al final del archivo `gremio.txt` usando `FileOutputStream(archivo, true)` y `PrintStream`. Utiliza obligatoriamente la estructura **try-with-resources**.
2. **Listar Gremio:** Lee el archivo `gremio.txt` y muestra todos los aventureros registrados. Si el archivo no existe, captura la `FileNotFoundException` para mostrar el mensaje: "Aún no hay aventureros inscritos".
3. **Vaciar Registro:** Borra físicamente el archivo `gremio.txt` del disco.
4. **Salir.**

**Reto extra:** Asegúrate de que el flujo de datos se cierre automáticamente en todas las operaciones usando `try-with-resources`.
