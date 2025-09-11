| Fecha      | Versión | Descripción                             |
| ---------- | ------- | --------------------------------------- |
| 14/09/2021 | 1.0.0   | Versión inicial.                        |
| 16/09/2021 | 1.0.1   | Corrección de numeración de ejercicios. |
| 11/09/2025 | 1.0.5   | Adaptación mkdocs. |



# Ejercicios Unidad 1 - Introducción a la programación

## 1. Programas y Algoritmos.
Responde a las siguientes preguntas con palabras tus (no técnicas).

1. ¿Qué hace un programa?
2. ¿Qué son los datos?
3. ¿Cómo se comunica un programa con el usuario?
4. Un programa y un algoritmo es lo mismo?
5. ¿Qué es un compilador?
6. ¿Por qué Java es portable?
7. Di 3 características deseables de un algoritmo.
8. Di verdadero o falso:
    * Una aplicación informática puede estar formada por muchos programas.
    * Un algoritmo puede representarse de varias maneras.
    * Un algoritmo puede programarse en diversos lenguajes de programación.
    * C es un lenguaje portable.
    * Necesitamos un compilador de C para cada plataforma.

## 2. La información
Responde a las siguientes preguntas con tus palabras (no hace falta que sean técnicas).

1. ¿Cómo se guarda la información en los ordenadores? ¿Por qué tiene que estar organizada?
2. ¿Cuál es la diferencia entre una variable y una constante?
3. Di las tres características de una variable.
4. ¿Qué problemas puede dar la falta de precisión?
5. Di cuáles de los siguientes identificadores son *correctos* o *incorrectos*:
    - `letra`
    - `Letra`
    - `123precio`
    - `__variable__`
    - `precio123`
    - `cantidad_envases`
    - `__.__`
    - `Canto total`
    - `CHAR`
    - `char`

6. Piensa 2 ejemplos de datos compuestos y con qué tipos simples pueden estar formados.


## 3. Expresiones

1. Calcula el valor de cada expresión si es válida. Si no es válida, indica el motivo.

      - `10 * 3 + 5 * 2`
      - `15 % 4`
      - `2 + 7 / 3`
      - `4 +" precio "`
      - `(5 + 2) <8`
      - `4> = 4`
      - `true OR false`
      - `5 OR (2 <3)`
      - `(6> = 2) OR (3 <= 5)`
      - `NOT (NOT (NOT (4 <10)))`
      - `4 + false`
      - `4 + 2 * 4 / 2`
      - `((5 <0) AND (6> = 7)) OR (45% 5 <= 0`
      - `((10 - 4)> 0) OR true`
      - `((10-4) <0) OR true`

2. Dados los siguientes valores de las variables `X = 1, Y = 4, Z = 10` y la constante` PI = 3.14`, evalúa las expresiones siguientes. Importante fijarse en el resultado del tipo de retorno.
   
      - `2 * X + 0.5 * Y - 1/5 * Z`
      - `((PI * X ^ 2)> Y) OR ((2 * PI * X) <= Z)`
      - `" Hola, mundo! " == "Hola," + "mundo!" `
      - ` 'a' == 'A'`

3. A partir de las siguientes constantes `gran = falso; redondo = cierto; suave = falso` indica cuál será el valor después de cada una de las siguientes asignaciones:
   
      - `grande y redondo y suave`
      - `grande o redondo o suave`
      - `grande y redondo o suave`
      - `grande o redondo y suave`
      - `grande y (redondo o suave)`
      - `(grande o redondo) y suave`

4. Indica con paréntesis el orden en que el ordenador ejecutaría las diferentes operaciones.
   
      - `x + y + z`
      - `x * y + z`
      - `x + y * z`
      - `x - y * z`
      - `x + y / z`
      - `x * y / z`
      - `x / y / z`
      - `x / y * y + x% y`
      - `x / y + z + x`

5. Siendo *a, b, c* y *d* variables numéricas, escribe la expresión lógica correspondiente a:

      - Los valores de b y c son ambos superiores al valor de d:
      - a, b y c son idénticos
      - a, b y c son idénticos pero diferentes de d
      - b está comprendido, estrictamente, entre los valores de a y c
      - b está comprendido, estrictamente, entre los valores de a y c, y el valor de a es menor que el valor de c
      - Hay, al menos, dos valores idénticos entre a, b y c

6. Observa la siguiente secuencia de instrucciones. Responde a las cuestiones:

```java
a=5;
b=7;
c=2;
a=a+b+c;
b=c/2;
a=a/b+a^c;
ESCRIBIR(a);
``` 

- ¿Qué valor contiene a después de la cuarta instrucción?
- ¿Qué valor contiene b después de la quinta instrucción?
- ¿Qué valor contiene a después de la sexta instrucción?
- ¿Qué valor imprime la última instrucción?   