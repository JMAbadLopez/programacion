# Actividades Entregables — Unidad 2: Programación Estructurada

!!! info "Resultados de Aprendizaje"
    Estas actividades están diseñadas para afianzar los siguientes RAs del módulo de **Programación**:

    - **RA2, RA3, RA5 y RA6**
        - Escribe y depura código, analizando y utilizando las estructuras de control del lenguaje (`if-else`, `switch`, `for`, `while`, `do-while`).
        - Desarrolla programas aplicando la programación estructurada e introduciendo el tratamiento de datos (arrays y matrices).

!!! abstract "Objetivo General"
    Aplicar los conocimientos sobre variables, condicionales, bucles y arrays (vectores y matrices) para resolver problemas prácticos y estructurados.

---

## Actividad 1: La Cooperativa de Naranjas

La **cooperativa "Casablanca"** necesita un programa para calcular el precio final por kilo de naranja. El precio depende de un **precio inicial** y se ajusta según el **tipo** (A o B) y el **tamaño** (1 o 2):

| Tipo | Tamaño | Ajuste |
|---|---|---|
| A | 1 | +10 céntimos |
| A | 2 | +25 céntimos |
| B | 1 | −5 céntimos |
| B | 2 | −10 céntimos |

El programa solicita el precio inicial, el tipo y el tamaño para realizar el cálculo.

!!! tip "Pista"
    Este problema es ideal para resolverlo con `if-else if` o con un `switch` anidado.

??? example "Ejemplo de salida esperada"
    ```
    --- COOPERATIVA CASABLANCA: CALCULADORA DE PRECIOS ---
    Introduce los siguientes datos:
    - Precio inicial del kilo de naranja: 0.30
    - Tipo de naranja (A/B): A
    - Tamaño de naranja (1/2): 2
    --- RESULTADO ---
    El precio final de venta es 0.55 €/kg
    ```

### Entrega Actividad 1

Genera un fichero Java con el nombre `ud2_actividad1_[tu_nombre].java`.  
Ejemplo: `ud2_actividad1_jose_abad.java`.

---

## Actividad 2: Análisis de Facturación

Una empresa de desinfectantes necesita analizar sus ventas. Cada factura tiene un **código de artículo**, una **cantidad en litros** y un **precio por litro**.

El programa procesa **5 facturas** (introducidas por teclado) y muestra al final:

1. **Facturación total:** suma de todos los importes.
2. **Litros del Artículo 1:** cantidad total de litros vendidos del artículo con código `1`.
3. **Facturas superiores a 200€:** número de facturas cuyo importe supera los 200€.

!!! tip "Pista"
    Necesitas un bucle que se repita 5 veces. Dentro del bucle, pide los datos de cada factura y actualiza tus variables acumuladoras y contadoras.

??? example "Ejemplo de entrada y salida"
    ```
    --- EJEMPLO DE ENTRADA ---
    - Código: 1, Litros: 30, Precio/L: 4.5
    - Código: 2, Litros: 20, Precio/L: 5.0
    - Código: 1, Litros: 50, Precio/L: 4.5
    - Código: 3, Litros: 10, Precio/L: 5.8
    - Código: 3, Litros: 20, Precio/L: 5.8

    --- RESUMEN DE VENTAS ---
    * Facturación total: 634.00 €
    * Cantidad de litros vendidos del artículo #1: 80
    * Número de facturas de más de 200 €: 1
    ```

### Entrega Actividad 2

Genera un fichero Java con el nombre `ud2_actividad2_[tu_nombre].java`.  
Ejemplo: `ud2_actividad2_jose_abad.java`.

---

## Actividad 3: Simulador de Cajero Automático

¡Programa el software de un cajero automático!

**Requisitos:**

1. El cajero dispone de billetes de `500, 200, 100, 50, 20, 10 y 5` euros. Guárdalos en un **array de enteros**.
2. El saldo inicial del usuario es `0`.
3. Muestra un **menú repetitivo** con las opciones:
    - Consultar saldo actual.
    - Ingresar dinero.
    - Retirar dinero.
    - Salir.
4. La opción **Retirar dinero** debe:
    - Comprobar si hay saldo suficiente. Si no, mostrar un mensaje de error.
    - Calcular el **menor número posible de billetes** para entregar la cantidad.
    - Mostrar el desglose de billetes entregados.

??? example "Ejemplo de ejecución"
    ```
    ---- MENÚ CAJERO AUTOMÁTICO ----
    1. Consultar saldo
    2. Ingresar dinero
    3. Retirar dinero
    4. Salir
    Elige una opción: 2
    Cantidad a ingresar: 385
    Saldo actual: 385.0 €

    ---- MENÚ CAJERO AUTOMÁTICO ----
    Elige una opción: 3
    Cantidad a retirar: 280
    Desglose de billetes entregados:
    - 1 billete de 200€
    - 1 billete de 50€
    - 1 billete de 20€
    - 1 billete de 10€
    Operación realizada con éxito.
    Saldo actual: 105.0 €
    ```

### Entrega Actividad 3

Genera un fichero Java con el nombre `ud2_actividad3_[tu_nombre].java`.  
Ejemplo: `ud2_actividad3_jose_abad.java`.

---

## Actividad 4: Gestor de Butacas de Cine

¡Programa el sistema de venta de entradas de un pequeño cine!

**Requisitos:**

1. Crea una **matriz de caracteres de 5×5** para representar la sala.
2. Inicializa todas las butacas con `'L'` (Libre).
3. Muestra un **menú repetitivo** con las opciones:
    1. **Mostrar butacas:** dibuja el estado actual de la sala (`L` = libre, `O` = ocupada).
    2. **Comprar entrada:** pide fila y columna.
        - Si la butaca está libre (`L`): la marca como ocupada (`O`) y confirma la compra.
        - Si ya está ocupada (`O`): muestra "Butaca no disponible".
        - Valida que la fila y columna sean correctas.
    3. **Mostrar estadísticas:** butacas libres, ocupadas y total recaudado (5€/entrada).
    4. **Salir.**

??? example "Ejemplo de salida"
    ```
    ---- CINE DAM ----
    1. Mostrar butacas
    2. Comprar entrada
    3. Ver estadísticas
    4. Salir
    Elige una opción: 1

      Asientos:
      0 1 2 3 4
    0 L L L L L
    1 L L L L L
    2 L L L L L
    3 L L L L L
    4 L L L L L

    Elige una opción: 2
    Introduce la fila (0-4): 2
    Introduce la columna (0-4): 3
    Compra realizada con éxito.

    Elige una opción: 3
    --- ESTADÍSTICAS ---
    Butacas Ocupadas: 1
    Butacas Libres: 24
    Total Recaudado: 5.0 €
    ```

### Entrega Actividad 4

Genera un fichero Java con el nombre `ud2_actividad4_[tu_nombre].java`.  
Ejemplo: `ud2_actividad4_jose_abad.java`.
