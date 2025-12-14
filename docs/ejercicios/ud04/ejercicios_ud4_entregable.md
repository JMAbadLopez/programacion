# Actividad Entregable UD4: La Logística de Santa Claus 🎅🎁

**Objetivo:** Diseñar y construir un programa complejo aplicando los principios de colecciones y estructuras de datos dinámicas. Haciendo un uso de `ArrayList`, `HashSet` y `HashMap`.

**Resultados de Aprendizaje (RAs) Trabajados: RA6.**

*  Se han reconocido las librerías de clases relacionadas con tipos de datos avanzados.
*  Se han utilizado listas para almacenar y procesar información.
*  Se han utilizado iteradores para recorrer los elementos de las listas.
*  Se han reconocido las características y ventajas de cada una de las colecciones de datos disponibles.

## Contexto

Santa Claus necesita un programa para optimizar el reparto de regalos de una zona e integrarlo en el GPS de su trineo. Y te ha encomendado la misión de hacerlo.

Como sabemos, los repartos se realizan a la velocidad de la luz, por lo que en cada población sólo necesita unos milisegundos para completar la tarea. Sin embargo, quiere optimizarlo y **empezar primero por las poblaciones que necesiten menos tiempo** de reparto.

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

Tu programa, deberá hacer los siguiente:

1. **Añadir población y sus *milisegundos*:**
    * Solicitará el nombre de una población y el tiempo en *milisegundos*. 
    * Una población no puede repetirse pero los tiempos sí.
2. **Calcular ruta:** 
    * Mostrará la ruta optimizada por pantalla y el tiempo total que cuesta recorrerla. Por ejemplo:

        ```text
        --- RUTA DE SANTA ---

        [Benifairó de les Valls]->[Faura]->[Gilet]->[Canet]->[Sagunto]
        - Tiempo estimado: 24.250 ms 
        ```
    
3. **Visitar población:**
    * Cuando **Santa** visita una población, ésta quedará registrada como *poblacion visitada*.

        ```mermaid
            graph LR
                subgraph "Poblaciones visitadas"
                direction TB
                E1((Benifairó))
                end
        ```

    * Las poblaciones visitadas se irán acumulando y **servirán para calcular de nuevo la ruta**. Si la población está *visitada* no se usará para **Calcular ruta**.

4. **Resumen reparto:**
    * Mostará las poblaciones donde se ha hecho el reparto y el **tiempo empleado** utilizado.
  
    ```text
    --- RESUMEN REPARTO ---

    - Poblaciones visitadas:

    (Benifairó)

    - Tiempo empleado: 500 ms
    ```