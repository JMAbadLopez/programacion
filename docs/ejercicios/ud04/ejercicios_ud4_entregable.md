# Actividad Entregable UD4: La Logística de Santa Claus 🎅🎁

**Objetivo:** Diseñar y construir un programa complejo aplicando los principios de colecciones y estructuras de datos dinámicas. Haciendo un uso de `ArrayList`, `HashSet` y `HashMap`.

**Resultados de Aprendizaje (RAs) Trabajados: RA6.**

* Se han reconocido las librerías de clases relacionadas con tipos de datos avanzados.
* Se han utilizado listas para almacenar y procesar información.
* Se han utilizado iteradores para recorrer los elementos de las listas.
* Se han reconocido las características y ventajas de cada una de las colecciones de datos disponibles.

## Contexto

**Santa Claus** necesita un programa para optimizar el reparto de regalos de una zona e integrarlo en el GPS de su trineo. Y te ha encomendado la misión de hacerlo.

Como sabemos, los repartos se realizan a la velocidad de la luz, por lo que en cada *población* sólo necesita unos *milisegundos* para completar la tarea.

Sin embargo, **Santa Claus** quiere optimizar el reparto y **empezar primero por las poblaciones que necesiten menos tiempo**.

Cada población tiene unos milisegundos asignados. Por ejemplo:

* **Benifairó:** 500 ms
* **Gilet:** 1000 ms
* **Canet:** 1800 ms
* **Faura:** 950 ms
* **Sagunto:** 20000 ms

Si optimizamos los tiempos, la **ruta de reparto** quedaría así:

```mermaid
graph LR
    A[Benifairó] --> B[Faura]
    B --> C[Gilet]
    C --> D[Canet]
    D --> E[Sagunto]
```

## Enunciado

Desarrolla una aplicación modular de consola usando estructuras de datos dinámicas y modular. Cumpliará los siguientes puntos:

1. **Menú de la aplicación:**

   * El menú de la aplicación es el siguiente:

    ```text
    --- SANTA MAPS ---

    A) Añadir población
    B) Calcular ruta
    C) Visitar población
    D) Resumen reparto
    E) Salir

    - Escoge una opción [A-E]: 
    ```

2. **Añadir población y sus *milisegundos*:**
    * Solicitará el nombre de una población y el tiempo en *milisegundos*.
  
    ```text
    --- AÑADIR POBLACIÓN ---

    - Indica el nombre de la población: Benifairó
    - Indica el tiempo de reparto (ms): 500
    
    [MENSAJE] Población añadida con éxito
    ```

    * Una población no puede repetirse pero los tiempos sí.

    !!! info "Registro datos"
        Usa un `HashMap` para llevar el registro de las poblaciones y sus tiempos

3. **Calcular ruta:**
    * Mostrará la ruta optimizada por pantalla y el tiempo total que cuesta recorrerla. Por ejemplo:

        ```text
        --- RUTA DE SANTA ---

        [Benifairó de les Valls]->[Faura]->[Gilet]->[Canet]->[Sagunto]
        - Tiempo estimado: 24.250 ms 
        ```

    !!! info "Cálculo de ruta"
        Usa `ArrayList` para crear la ruta y mostrar sus datos. Ten en cuenta que la lista se genera **cada vez** que calculas la ruta.

4. **Visitar población:**
    * El programa solicitará el *nombre* de la población.
  
        ```text
        --- VISITAR POBLACIÓN ---

        - Indica la población visitada: Benifairó

        [MENSAJE] Población visitada con éxito
        ```

    * Cuando **Santa** visita una población, ésta quedará registrada como *poblacion visitada*.

        ```mermaid
            graph LR
                subgraph "Poblaciones visitadas"
                direction TB
                E1((Benifairó))
                end
        ```

    * Las poblaciones visitadas se irán acumulando y **servirán para calcular de nuevo la ruta**. Si la población está *visitada* no se usará para **Calcular ruta**.

    !!! info "Poblaciones visitadas"
        Usa un `HashSet` para almacenar las poblaciones visitadas. Ten en cuenta que **no queremos eliminar el registro de poblaciones y sus tiempos**.

5. **Resumen reparto:**
    * Mostará las poblaciones donde se ha hecho el reparto y el **tiempo empleado** utilizado.
  
    ```text
    --- RESUMEN REPARTO ---

    - Poblaciones visitadas:

    (Benifairó)

    - Tiempo empleado: 500 ms
    ```

    !!! danger "Cuidado con los cambios"
        En cualquier momento, se puede **añadir una población nueva con su tiempo** o **vistar una población**. Debes considerarlo cuando realices el **cálculo de la ruta**.
