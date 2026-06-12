# Ejercicios UD1 — Introducción a la programación

!!! info "Sobre estos ejercicios"
    Los ejercicios de esta sección son **conceptuales**: trabajan el razonamiento y la comprensión antes de escribir código. No necesitas el ordenador para resolverlos (aunque puedes usarlo para comprobar).

---

## 1. Programas y algoritmos

Responde con **tus propias palabras**, sin tecnicismos:

1. ¿Qué hace un programa? ¿En qué se diferencia de un algoritmo?
2. ¿Qué son los datos? Pon dos ejemplos de datos que podría manejar un programa de gestión de una biblioteca.
3. ¿Cómo se comunica un programa con el usuario? Piensa en al menos dos formas distintas.
4. ¿Qué es un compilador? ¿Y un intérprete? ¿Cuál usa Java y por qué es especial?
5. ¿Por qué Java es portable? ¿Qué papel juega la JVM?
6. Di tres características deseables de un algoritmo (pista: piensa en una receta de cocina).
7. Indica si son verdaderas o falsas:
    - Una aplicación informática puede estar formada por muchos programas.
    - Un algoritmo solo puede representarse de una manera.
    - Un algoritmo puede programarse en distintos lenguajes de programación.
    - C es un lenguaje portable de la misma forma que Java.
    - Necesitamos un compilador de C diferente para cada plataforma.

---

## 2. La información: variables y tipos

1. ¿Cómo guarda la información un ordenador? ¿Por qué tiene que estar organizada en tipos?
2. ¿Cuál es la diferencia entre una variable y una constante? Pon un ejemplo de cada una.
3. Di las tres características principales de una variable.
4. ¿Qué problemas puede causar elegir un tipo de dato demasiado pequeño para una variable?
5. Clasifica los siguientes identificadores como **válidos** o **inválidos**, y explica el motivo cuando son inválidos:

    | Identificador | ¿Válido? | Motivo (si es inválido) |
    |---|---|---|
    | `letra` | | |
    | `Letra` | | |
    | `123precio` | | |
    | `__variable__` | | |
    | `precio123` | | |
    | `cantidad_envases` | | |
    | `__.__` | | |
    | `Canto total` | | |
    | `CHAR` | | |
    | `char` | | |

6. Piensa en dos ejemplos de **datos compuestos** e indica con qué tipos simples podrían estar formados.

---

## 3. Expresiones

### 3.1 Calcula el resultado

Calcula el valor de cada expresión si es válida. Si no lo es, indica el motivo:

| Expresión | Resultado / Motivo |
|---|---|
| `10 * 3 + 5 * 2` | |
| `15 % 4` | |
| `2 + 7 / 3` | |
| `4 + "precio"` | |
| `(5 + 2) < 8` | |
| `4 >= 4` | |
| `true OR false` | |
| `5 OR (2 < 3)` | |
| `(6 >= 2) OR (3 <= 5)` | |
| `NOT (NOT (NOT (4 < 10)))` | |
| `4 + false` | |
| `4 + 2 * 4 / 2` | |
| `((5 < 0) AND (6 >= 7)) OR (45 % 5 <= 0)` | |
| `((10 - 4) > 0) OR true` | |
| `((10 - 4) < 0) OR true` | |

### 3.2 Con variables

Dados `X = 1`, `Y = 4`, `Z = 10` y la constante `PI = 3.14`, evalúa:

| Expresión | Resultado |
|---|---|
| `2 * X + 0.5 * Y - 1/5 * Z` | |
| `(PI * X^2 > Y) OR (2 * PI * X <= Z)` | |
| `"Hola, mundo!" == "Hola," + "mundo!"` | |
| `'a' == 'A'` | |

!!! tip "Atención al tipo de retorno"
    Fíjate en el tipo del resultado: ¿es numérico, lógico o alfanumérico?

### 3.3 Expresiones lógicas con booleanos

Dadas `grande = falso`, `redondo = cierto`, `suave = falso`, evalúa:

| Expresión | Resultado |
|---|---|
| `grande AND redondo AND suave` | |
| `grande OR redondo OR suave` | |
| `grande AND redondo OR suave` | |
| `grande OR redondo AND suave` | |
| `grande AND (redondo OR suave)` | |
| `(grande OR redondo) AND suave` | |

### 3.4 Orden de evaluación

Indica con paréntesis el orden en que el ordenador evaluaría estas expresiones (siendo `x`, `y`, `z` variables numéricas):

```
x + y + z          →
x * y + z          →
x + y * z          →
x - y * z          →
x + y / z          →
x * y / z          →
x / y / z          →
x / y * y + x % y  →
x / y + z + x      →
```

### 3.5 Expresiones lógicas complejas

Siendo `a`, `b`, `c`, `d` variables numéricas, escribe la expresión lógica que representa cada condición:

1. Los valores de `b` y `c` son ambos superiores al valor de `d`.
2. `a`, `b` y `c` son idénticos.
3. `a`, `b` y `c` son idénticos pero diferentes de `d`.
4. `b` está comprendido estrictamente entre `a` y `c`.
5. `b` está comprendido estrictamente entre `a` y `c`, y `a` es menor que `c`.
6. Hay al menos dos valores idénticos entre `a`, `b` y `c`.

### 3.6 Traza de un programa

Observa la siguiente secuencia de instrucciones:

```java
a = 5;
b = 7;
c = 2;
a = a + b + c;
b = c / 2;
a = a / b + a^c;
ESCRIBIR(a);
```

Responde sin ejecutar el código:

1. ¿Qué valor tiene `a` después de la 4.ª instrucción?
2. ¿Qué valor tiene `b` después de la 5.ª instrucción?
3. ¿Qué valor tiene `a` después de la 6.ª instrucción?
4. ¿Qué valor imprime `ESCRIBIR(a)`?
