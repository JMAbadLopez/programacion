# Ejercicios Unidad 4: Estructuras de Datos Dinámicas (Avanzados)

**Objetivo:** Aplicar los conocimientos sobre `ArrayList` y estructuras de datos dinámicas para resolver problemas complejos que requieren gestión de múltiples colecciones, visualización de datos y lógica de negocio.

---

## Actividad 1: Gestor de Deuda de Clientes

**Enunciado:**
Vamos a implementar un sistema sencillo para gestionar las deudas de los clientes de una empresa. La información se almacenará en dos listas paralelas:

* `ArrayList<String> clientes`: Almacena los nombres.
* `ArrayList<Double> deudas`: Almacena la cantidad (en euros) que debe cada cliente.

**Menú Principal:**
El programa mostrará un menú repetitivo con las siguientes opciones (recogerá un `char`como opción):

1. **Añadir cliente (A):** Pide nombre y deuda inicial. Si el cliente ya existe, muestra un error.
2. **Eliminar cliente (E):** Pide el nombre y, si existe, lo borra de ambas listas.
3. **Consultar listado (D):** Muestra una tabla con todos los clientes y sus deudas, y el **total global** de deuda acumulada.
4. **Consultar saldo cliente (C):** Pide un nombre y muestra cuánto debe esa persona específica.
5. **Modificar deuda (M):** Pide un nombre y la nueva cantidad. Actualiza el valor en la lista de deudas.
6. **Salir (S):** Muestra un mensaje de despedida y **vacía** ambas listas antes de terminar (simulando una limpieza de memoria).

**Salida por Pantalla Esperada (Opción D - Listado):**

```text
--- ESTADO DE DEUDAS ---
CLIENTE          DEUDA
----------------------
Juan Pérez       150.50 €
Ana García       0.00 €
Empresa S.L.     3200.75 €
----------------------
TOTAL DEUDA:     3351.25 €
```

**Requisitos Técnicos:**

* Debes usar `ArrayList`.
* Las listas deben mantenerse sincronizadas (el índice 0 de `clientes` corresponde al índice 0 de `deudas`).
* Controla que las listas **no estén vacías antes de intentar eliminar o consultar**.
* Modulariza el código

---

## Actividad 2: El Climograma Internacional

**Enunciado:**
Debes desarrollar un programa que genere un climograma (gráfico de temperaturas) a partir de los datos meteorológicos de una ciudad.

**Datos de entrada:**

1. Un `ArrayList<Integer>` con las **temperaturas medias** mensuales: `[12, 14, 13, 15, 17, 21, 24, 26, 22, 17, 15, 14]`.
2. Una matriz de `String[][]` con los nombres de los meses en **tres idiomas** (Español, English, Valencià).
    * Fila 0: Español ("Enero", "Febrero"...)
    * Fila 1: Inglés ("January", "February"...)
    * Fila 2: Francés ("Gener", "Febrer"...)

**Funcionamiento:**

1. El programa pedirá al usuario en qué idioma desea ver el gráfico (1. Español, 2. English, 3. Valencià).
2. Mostrará los datos de la forma siguiente:

    **Representación Horizontal:**
    * Muestra el nombre completo del mes (en el idioma elegido).
    * A su derecha, dibuja una barra de asteriscos `*` proporcional a la temperatura (1 asterisco = 1 grado).
    * Muestra el valor numérico al final.

**Salida por Pantalla Esperada (Ejemplo en Español):**

```text
Seleccione idioma (1. Español, 2. Inglés, 3. Francés): 1

--- GRÁFICO HORIZONTAL ---
Enero      : ************ (12)
Febrero    : ************** (14)
Marzo      : ************* (13)
Abril      : *************** (15)
Mayo       : ***************** (17)
Junio      : ********************* (21)
Julio      : ************************ (24)
Agosto     : ************************** (26)
Septiembre : ********************** (22)
Octubre    : ***************** (17)
Noviembre  : *************** (15)
Diciembre  : ************** (14)
```

**Requisitos Técnicos:**

* Usa `ArrayList` para las temperaturas.
* Usa una matriz `String[][]` para los idiomas.
* Modulariza el código.
