Como en cualquier proceso de aprendizaje, hay que empezar por el principio. Es importante tener claros un conjunto de conceptos básicos que ayuden a comprender los conceptos más avanzados que vendrán posteriormente. En este caso, se trata de establecer qué es un programa, como funciona y qué es el modelo general para crear uno. Sólo una vez lo tengáis claro os podéis plantear sentaros ante el ordenador y empezar a programar.

## ¿Qué es un programa?

Un primer paso para poder empezar a estudiar como es debido a hacer un programa informático es tener claro qué es un programa. En contraste con otras términos usados en informática, es posible referirse en un “programa” en el lenguaje coloquial sin tener que estar hablando necesariamente de ordenadores. Os podríais estar refiriendo en el programa de un ciclo de conferencias o de cine. Pero, a pesar de no tratarse de un contexto informático, este uso ya os aporta una idea general de su significado: un conjunto de acontecimientos ordenados de forma que suceden de forma secuencial en el tiempo, uno tras otro.

Otro uso habitual, ahora ya sí que vinculado al contexto de las máquinas y los autómatas, podría ser para referirse al programa de una lavadora o de un robot de cocina. En este caso, pero, lo que sucede es un conjunto no tanto de acontecimientos, sino de órdenes que el electrodoméstico sigue ordenadamente. Un vez seleccionado el programa que queremos, el electrodoméstico hace todas las tareas correspondientes de manera autónoma.

Por ejemplo, el programa de un robot de cocina para hacer una crema de maíz sería:

1. Espera a que introduzcáis maíz y mantequilla.
2. Gira durante un minuto, avanzando progresivamente de la velocidad 1 a la 5.
3. Espera  a que introduzcáis leche y sal.
4. Gira durante 30 segundos a velocidad 7.
5. Gira durante 10 minutos a velocidad 3 mientras cuece a una temperatura de 90 grados.
6. Se para. La crema está lista!

Este conjunto de órdenes no es arbitrario, sino que sirve para llevar a cabo una tarea de cierta complejidad que no se puede hacer de un solo golpe. Se tiene que hacer paso a paso. Todas las órdenes están vinculadas entre sí para llegar a lograr este objetivo y, sobre todo, es muy importante el orden en que se llevan a cabo.

Entrando ya, ahora sí, en el mundo de los ordenadores, la manera como se estructura el tipo de tareas que estos pueden hacer tiene mucho en común con los programas de electrodomésticos. En este caso, en lugar de transformar ingredientes \(o lavar ropa sucia, si se tratara de una lavadora\), lo que el ordenador transforma es información o datos.

> -info-Un _programa informático_ no es más que una serie de órdenes que se llevan a cabo secuencialmente, aplicadas sobre un conjunto de datos.

¿Qué datos procesa un programa informático? Bien, esto dependerá del tipo de programa:

* Un editor procesa los datos de un documento de texto.
* Una hoja de cálculo procesa datos numéricos.
* Un videojuego procesa los datos que dicen la forma y ubicación de enemigos y jugadores, etc.
* Un navegador web procesa las órdenes del usuario y los datos que recibe desde un servidor a Internet.

Por lo tanto, la tarea de un programador informático es escoger qué órdenes constituirán un programa de ordenador, en qué orden se tienen que llevar a cabo y sobre qué datos hay que aplicarlas, para que el programa lleve a cabo la tarea que tiene que resolver. La dificultad de todo será más grande o más pequeña dependiendo de la complejidad misma de aquello que hace falta que el programa haga. No es lo mismo establecer qué tiene que hacer el ordenador para resolver una multiplicación de tres números que para procesar textos o visualizar páginas a Internet.

> -info-**Ejecutar un programa**
>
> Por “ejecutar un programa” se entiende hacer que el ordenador siga todas sus órdenes, desde la primera hasta la última.

Por otro lado, una vez hecho el programa, cada vez que lo ejecutáis, el ordenador cumplirá todas las órdenes del programa.

De hecho, un ordenador es incapaz de hacer absolutamente nada por si mismo, siempre hay que decirle qué tiene que hacer. Y esto se le dice mediante la ejecución de programas. A pesar de que desde el punto de vista del usuario puede parecer que cuando se pone en marcha un ordenador este funciona sin ejecutar ningún programa concreto, hay que tener en cuenta que su sistema operativo es un programa que está siempre en ejecución.

## Tipo de órdenes que acepta un ordenador

Para llevar a cabo la tarea encomendada, un ordenador puede aceptar diferentes tipos de órdenes. Estas se encuentran limitadas a las capacidades de los componentes que lo conforman, del mismo modo que el programa de una lavadora no puede incluir la orden de gratinar, puesto que no tiene gratinador. Por lo tanto, es importante tener presente este hecho para saber qué se puede pedir al ordenador cuando creáis un programa.

La estructura interna del ordenador se divide en una serie de componentes, todos comunicados entre si, tal como muestra la **figura.1** de manera muy simplista, pero suficiente para empezar. Cada orden de un programa está vinculada de una manera u otra a alguno de estos componentes.

![](/programacion-java/assets/img/ini-prog/ic10mu1_01.png)

**Figura1 .1**  Componentes básicos de un ordenador

> -info-**Procesador**
>
> El procesador también es conocido popularmente por sus siglas en inglés: CPU \(Central Processing Unit, unidad central de procesamiento\).

El **procesador** es el centro neurálgico del ordenador y el elemento que es capaz de llevar a cabo las órdenes de manipulación y transformación de los datos. Un conjunto de datos se puede transformar de muchas maneras, según las capacidades que ofrezca cada procesador. Aún así, hay muchas transformaciones que todos pueden hacer. Un ejemplo es la realización de operaciones aritméticas \(suma, resto, multiplicación, división\), tal como hacen las calculadoras.

La **memoria** permite almacenar datos mientras estas no están siendo directamente manipuladas por el procesador. Cualquier dato que tiene que ser tratado por un programa estará en la memoria. Mediante el programa se puede ordenar al procesador que guarde ciertos datos o que los recupere en cualquier momento. Normalmente, cuando se habla de memoria a este nivel nos referimos a memoria dinámica o RAM \(Random Access Memory, memoria de acceso aleatorio\). Esta memoria no es persistente y una vez acaba la ejecución del programa todos los datos con las cuales trataba se desvanecen. Por lo tanto, la información no se guardará entre sucesivas ejecuciones diferentes de un mismo programa.

En ciertos contextos es posible que nos encontramos también con memoria ROM \(Read-Only memory, memoria sólo de lectura\). En esta, los datos están predefinidos de fábrica y no se  puede almacenar nada, sólo podemos leer el que contiene. Hay que decir que no es el caso más habitual.

El **sistema de entrada/salida** \(abreviado como E/S\) permite el intercambio de datos con el exterior del ordenador, más allá del procesador y la memoria. Esto permite traducir la información procesada en acciones de control sobre cualquier periférico conectado al ordenador. Un ejemplo típico es establecer una vía de diálogo con el usuario, ya sea por medio del teclado o del ratón para pedirle información, como por la pantalla, para mostrar los resultados del programa. Este sistema es clave para convertir un ordenador en una herramienta de propósito general, puesto que lo capacita para controlar todo tipo de aparatos diseñados para conectarse.

Otra posibilidad importante del ordenador, atendidas las limitaciones del sistema de memoria, es poder interactuar con el hardware de almacenamiento persistente de datos, como un disco duro.

> -hint-**Un ordenador es como una pizzería**
>
> Si se quiere hacer un símil con nuestro mundo de cada día, un ordenador es como la cocina de una pizzería que acepta pedidos telefónicos. Hacer un pedido equivale a pedir el inicio de la ejecución de un programa. Para llevar a cabo este pedido, habrá que manipular una serie de ingredientes, que representarían los datos. El cocinero con sus enseres \(horno, pastador, etc.\) serían el procesador, puesto que manipulan y transforman los ingredientes. La nevera, los armarios o los contenedores, de donde el cocinero puede sacar ingredientes o donde los puede dejar mientras no los está manipulando, representarían la memoria. El sistema de entrada/salida serían los elementos de comunicación con el exterior de la pizzería, como el motorista que trae la pizza o el teléfono que el cocinero puede utilizar para pedir que le traigan nuevos ingredientes cuando se le acaban, pedir información adicional al usuario \(“Se ha acabado el pimiento, va bien si  ponemos cebolla?”\), o avisarlo de algún acontecimiento \(“Me sabe mal, tardará algo más del previsto”\). De hecho, continuando con el símil, el cocinero prepara una pizza siguiendo un conjunto de pasos. En este caso la receta son las órdenes que tiene que seguir el programa. Y si el cocinero no tiene la receta no puede llevar a cabo el pedido.
>
> **Lenguaje natural**
>
> El lenguaje natural es aquel que empleamos los humanos para comunicarnos habitualmente.

Partiendo de esta descripción de las tareas que puede llevar a cabo un ordenador según los elementos que lo componen, un ejemplo de programa para multiplicar dos números es el mostrado a la **Tabla 1**. Lo tenéis expresado en lenguaje natural. Notad como los datos tienen que estar siempre almacenadas a la memoria para poder operar.

**Tabla 1** Un programa que multiplica dos números usando lenguaje natural

| Orden para dar | Elemento que lo efectúa |
| :--- | :--- |
| 1. Lee un número del teclado | E/S \(teclado\) |
| 2. Guarda del número en memoria | Memoria |
| 3. Lee otro número del teclado | E/S \(teclado\) |
| 4. Guarda del número en memoria | Memoria |
| 5. Recupera los números de la memoria y hace la multiplicación | Procesador |
| 6. Guarda el resultado en memoria | Memoria |
| 7. Muestra el resultado a la pantalla | E/S \(pantalla\) |

## Crear un programa ejecutable...

Para crear un programa hay que establecer qué órdenes se tienen que dar al ordenador y en qué secuencia. Ahora bien, hoy en día los ordenadores todavía no entienden el lenguaje natural \(cómo se utiliza a la **tabla.1**\), puesto que está lleno de ambigüedades y aspectos semánticos que pueden depender del contexto.

> -info-**Artificial**
> Por artificial entendemos aquello que no ha evolucionado a partir del uso entre humanos, sino que ha sido creado expresamente, en este caso para ser usado con los ordenadores.
>
> **Lenguaje de programación**
> Para especificar las órdenes que tiene que seguir un ordenador el que se usa es un lenguaje de programación. Se trata de un lenguaje artificial diseñado expresamente para crear algoritmos que puedan ser llevados a cabo por el ordenador.

Igual como hay muchas lenguas diferentes, también hay muchos lenguajes de programación, cada uno con sus características propias, que los hacen más o menos indicados para resolver unos tipos de tareas u otras. Todos, pero, tienen una sintaxis muy definida, que hay que seguir para que el ordenador interprete correctamente cada orden que se le da. Es exactamente lo mismo que pasa con las lenguas del mundo: para expresar los mismos conceptos, el castellano y el japonés usan palabras y normas de construcción gramatical totalmente diferentes entre sí.

> -info-En un lenguaje de programación determinado, la agrupación de órdenes concretas que se pide al ordenador que haga se denomina **conjunto de instrucciones**.

Normalmente, el conjunto de instrucciones de un programa se almacena dentro de un conjunto de ficheros. Estos archivos los edita el programador \(vosotros\) para crear o modificar el programa. Para los programas más sencillos basta con un único fichero, pero para los más complejos  pueden hacer falta más de uno.

Los lenguajes de programación se pueden clasificar en diferentes categorías según sus características. De hecho, algunas de las propiedades del lenguaje de programación tienen consecuencias importantes sobre el proceso que hay que seguir para poder crear un programa y para ejecutarlo. Hay dos maneras de clasificar los lenguajes de programación \(estas dos categorías no son mutuamente excluyentes\):

* Según si se trata de un **lenguaje compilado o interpretado**. Esta propiedad afecta los pasos que hay que seguir para llegar a obtener un fichero ejecutable. O sea, un fichero con el mismo formato que el de las aplicaciones que podéis tener instaladas a vuestro ordenador.
* Según si se trata de un **lenguaje de nivel alto o bajo**. Esta propiedad indica el grado de abstracción del programa y si sus instrucciones están más o menos estrechamente vinculadas al funcionamiento del hardware de un ordenador.

### ...en lenguaje máquina

El lenguaje máquina o código máquina es el lenguaje que elegiríamos si quisiéramos hacer un programa que trabajara directamente sobre el procesador. Es interesante de conocer porque ayuda a entender el proceso de generación de un programa.

En este lenguaje, cada una de las instrucciones se representa con una secuencia binaria, en ceros \(0\) y unos \(1\), y todo el conjunto de instrucciones del programa queda almacenado de manera consecutiva dentro de un fichero de datos en binario. Si lo intentáis abrir con un editor de texto, lo que veréis en pantalla son símbolos totalmente incomprensibles.

> -info-**Transistor**
>
> El transistor es el componente básico de un sistema digital. Se puede considerar como un interruptor, en qué 1 indica que  pasa corriendo y 0 que no  pasa.

Cuando se pide la ejecución de un programa en lenguaje máquina, este se carga a la memoria del ordenador. A continuación, el procesador va leyendo una por una cada una de las instrucciones, las descodifica y las convierte en señales eléctricas de control sobre los elementos del ordenador para que hagan la tarea pedida. A muy bajo nivel, casi se puede llegar a establecer una correspondencia entre los 0 y 1 de cada instrucción y el estado resultante de los transistores dentro de los chips internos del procesador.

El conjunto de instrucciones que es capaz de descodificar correctamente un procesador y convertir en señales de control es específico para cada modelo y está definido por su fabricante. El diseñador de cada procesador se inventó la sintaxis y las instrucciones del código máquina de acuerdo con sus necesidades cuando diseñó el hardware. Por lo tanto, las instrucciones en formato binario que puede descodificar un tipo de procesador pueden ser totalmente incompatibles con las que puede descodificar otro. Esto es lógico, puesto que sus circuitos son diferentes y, por lo tanto, las señales eléctricas de control que tiene que generar son diferentes para cada caso. Dos secuencias de 0 y 1 iguales pueden tener efectos totalmente diferentes en dos procesadores de modelos diferentes, o resultar incomprensibles para alguno.

> -warning-Un programa escrito en lenguaje de máquina es específico para un tipo de procesador concreto. No se puede ejecutar sobre ninguno otro procesador, salvo que sean compatibles. Un procesador concreto sólo entiende directamente el lenguaje de máquina especificado por su fabricante.

A pesar de que, como se puede ver, en realidad hay muchos lenguajes máquina diferentes, se usa esta terminología para englobarlos a todos. Si se quiere concretar más se puede decir “lenguaje máquina del procesador X”.

Ahora bien, estrictamente hablando, si optarais para hacer un programa en lenguaje de máquina, nunca lo haríais generando directamente ficheros con todo secuencias binarias. Sólo os tenéis que imaginar el aspecto de un programa de este tipo en formato imprimido, consistente en una enorme retahíla de 0 y 1. Sería totalmente incomprensible y prácticamente imposible de analizar. En realidad el que se usa es un sistema auxiliar de mnemotécnicos en el cual se asigna a cada instrucción en binario un identificador en formato de texto legible, más fácilmente comprensible para los humanos. De este modo, es posible generar un programa a partir de ficheros en formado texto.

> -info-Esta compilación de mnemotécnicos es el que se conoce como el **lenguaje ensamblador.**

A título ilustrativo, la **tabla 2** muestra las diferencias de aspecto entre un lenguaje  máquina y ensamblador equivalentes para un procesador de modelo 6502. Sin entrar en más detalles, es importante mencionar que tanto en lenguaje máquina como en ensamblador cada una de las instrucciones se corresponde a una tarea muy simple sobre uno de sus componentes. Hacer que el ordenador haga tareas complejas implica tener que generar muchas instrucciones en estos lenguajes.

**Tabla 2.** Tabla de equivalencia entre lenguaje ensamblador y lenguaje máquina.

| Instrucción ensamblador | Lenguaje máquina |
| :--- | :--- |
| LDA \#6 | 1010100100000110 |
| CMP &3500 | 110011010000000000110101 |
| LDA &70 | 1010010101110000 |
| INX | 11101111 |
|  |  |

### ...mediante un lenguaje compilado

> -info-**Editores de texto simples**
>
> Un editor de texto simple es aquel que permite escribir sólo texto sin formato.  Son ejemplos el Bloc de Notas \(Windows\), Gedit o Emacs \(Unix\).

Para crear un programa lo que haremos es crear un archivo y escribir el conjunto de instrucciones que queremos que el ordenador ejecute. Para empezar será suficiente con un editor de texto simple.

> -info-Una vez se ha acabado de escribir el programa, el conjunto de ficheros de texto resultante donde se encuentran las instrucciones que contiene se llama el **código fuente**.

Este sistema de programar más cómodo para los humanos hace surgir un problema, y es que los ficheros de código fuente no contienen lenguaje máquina y, por lo tanto, resultan incomprensibles para el procesador. No se le puede pedir que lo ejecute directamente; esto sólo es posible usando lenguaje máquina. Para poder generar código máquina hay que hacer un proceso de traducción desde los mnemotécnicos que contiene cada fichero a las secuencias binarias que entiende el procesador.

> -info-El proceso denominado **compilación** es la traducción del código fuente de los ficheros del programa en ficheros en formato binario que contienen las instrucciones en un formato que el procesador puede entender. El contenido de estos ficheros se denomina **código objeto**. El programa que hace este proceso se denomina **compilador**.

Para el caso del ensamblador el proceso de compilación es muy sencillo, puesto que es una mera traducción inmediata de cada mnemotécnico a la secuencia binaria que le corresponde. En principio, con esto ya habría bastante para poder hacer cualquier programa, pero ceñirse sólo al uso de lenguaje ensamblador comporta ciertas ventajas e inconvenientes que hacen que en realidad no sea usado normalmente, sólo en casos muy concretos.

Por el lado positivo, con ensamblador el programador tiene control absoluto del hardware del ordenador a nivel muy bajo. Prácticamente se puede decir que controla cada señal eléctrica y los valores de los transistores dentro de los chips. Esto permite llegar a hacer programas muy eficientes en que el ordenador hace exactamente aquello que le decís sin ningún tipo de ambigüedad. En contraposición, los programas en ensamblador sólo funcionan para un tipo de procesador concreto, no son portables. Si se tienen que hacer para otra arquitectura, normalmente hay que empezar de cero. Además —y es el motivo de más peso para pensárselo dos veces si se quiere usar este lenguaje— crear un programa complejo requiere un grado enorme de experiencia sobre cómo funciona el hardware del procesador, y el trabajo sería considerable. Esto hace que sean programas complicados de entender y que haya que dedicar mucho tiempo a hacerlos.

#### Lenguajes compilados de alto nivel

> -info-**Programas de bajo nivel**
>
> Se considera que el código máquina y el ensamblador son los lenguajes de nivel más bajo existentes, puesto que sus instrucciones dependen directamente del tipo de procesador.

Actualmente, para generar la inmensa mayoría de programas se utilizan los llamados lenguajes de alto nivel. Estos ofrecen un conjunto de instrucciones que son fáciles de entender para el ser humano y, por lo tanto, poseen un grado de abstracción más alto que el lenguaje ensamblador \(puesto que no están vinculados a un modelo de procesador concreto\). Cada una de las instrucciones se corresponde a una orden genérica en qué lo más importante es su aspecto funcional \(qué se quiere hacer\), sin que importe como se materializa esto en el hardware del ordenador ni mucho menos en señales eléctricas. En cualquier caso, hay que advertir que esta clasificación no siempre es absoluta. Se puede decir que un lenguaje es de “nivel más alto o bajo que otro”, según el grado relativo de abstracción de sus instrucciones y su proximidad al funcionamiento interno del hardware de un ordenador.

El proceso para generar un programa a partir de un lenguaje de nivel alto es muy parecido al que hay que seguir para hacerlo usando el lenguaje ensamblador, puesto que las instrucciones también se escriben en formado texto dentro de ficheros de código fuente. La ventaja adicional es que el formato y la sintaxis ya no están ligados al procesador, y por lo tanto, pueden tener el formato que quiera el inventor del lenguaje sin que tenga que tener en cuenta el hardware de los ordenadores donde se ejecutará. Normalmente, las instrucciones y la sintaxis han sido elegidas para facilitar la tarea de creación y comprensión del código fuente del programa.

De hecho, en los lenguajes de nivel alto más frecuentes, entre los cuales está el que aprenderéis a usar en este módulo, las instrucciones dentro de un programa se escriben como una secuencia de sentencias.

> -info-Una **sentencia** es el elemento mínimo de un lenguaje de programación, a menudo identificado por una cadena de texto especial, que sirve para describir exactamente una acción que el programa tiene que hacer.

Por lo tanto, a partir de ahora se usará el término **sentencia en lugar de instrucción** cuando el texto se refiera a un lenguaje de este tipo.

Una vez se han acabado de generar los ficheros con su código fuente, estos también se tienen que compilar para traducirlos a código objeto. Ahora bien, en este caso, el proceso de traducción a código objeto será bastante más complicado que desde ensamblador. El compilador de un lenguaje de nivel alto es un programa mucho más complejo. En cuanto al proceso de compilación, una consecuencia adicional del hecho de que el lenguaje no dependa directamente del tipo de procesador es que desde un mismo código fuente se puede generar código objeto para diferentes procesadores. Sólo hay que disponer de un compilador diferente para cada tipo de procesador que se quiera soportar. Por lo tanto, un mismo código fuente original puede servir para generar programas que funcionen con diferentes tipos de procesador sin tenerlo que modificar cada vez.

Puesto que para cada fichero de código fuente se genera un fichero de código objeto, después del proceso de compilación hay un paso adicional llamado enlazamiento \(_link_\), en el cual estos dos códigos se combinan para generar un único fichero ejecutable. Coloquialmente, cuando os pedimos que compiláis un programa ya se suele dar por hecho que también se enlazará, si se tercia. Aún así, formalmente se consideran dos pasos diferenciados.

La **figura 2** muestra un esquema que sirve de resumen del proceso de generación del fichero ejecutable usando un lenguaje compilado.

**Figura 2**. Proceso de compilación \(y enlazamiento\) del código fuente

![](/programacion-java/assets/img/ini-prog/ic10mu1_03.png)Algunos ejemplos de lenguajes de nivel alto compilados muy populares son C o Pascal. Cómo se ha visto, el ensamblador también es un lenguaje compilado, pero de nivel bajo.

#### Errores de compilación

El compilador es fundamental para generar un programa en un lenguaje compilado, ya sea de nivel alto o bajo. Para poder hacer su trabajo de manera satisfactoria y generar código objeto a partir del código fuente hace falta que las instrucciones sigan perfectamente la sintaxis del lenguaje elegido. Por ejemplo, hay que usar sólo las instrucciones especificadas en el lenguaje y hacerlo en el formato adecuado. Si no es así, el compilador es incapaz de entender la orden que se quiere dar al ordenador y no sabe como traducirla a lenguaje máquina.

> -alert-Cuando el compilador detecta que una parte del código fuente no sigue las normas del lenguaje, el proceso de compilación se interrumpe y anuncia que hay un **error de compilación**

Cuando pasa esto, habrá que repasar el código fuente e intentar averiguar donde está el error. Normalmente, el compilador da algún mensaje sobre lo que considera que está mal.

Hay que ser conscientes que un programador puede llegar a dedicar una buena parte del tiempo de la generación del programa a la resolución de errores de compilación. Ahora bien, que un programa compile correctamente sólo quiere decir que se ha escrito de acuerdo con las normas del lenguaje de programación, pero no aporta ninguna garantía que sea correcto, es decir, que haga correctamente la tarea para la cual se ha ideado.

> -info-**Los lenguajes de programación y el lenguaje natural**
>
> Intentando hacer un símil entre un lenguaje de programación y el lenguaje natural, si una persona que habla castellano es como un compilador, que es capaz de entender o traducir una frase siempre que se sigan las normas de esta lengua, sin un poco de imaginación se le puede hacer difícil entender la frase: ”helado kérem un comra”. Hay palabras en un orden extraño, y además hay otras que no pertenecen al castellano o que no simplemente no existen…
>
> Por otro lado, la frase “El helado conduce una hoja de papel” puede ser gramaticalmente correcta y no tener ningún error de sintaxis. Alguien que hable castellano la puede entender. Ahora bien, está claro que algo no encaja. En la comprensión del significado de un lenguaje hay aspectos que van más allá de la sintaxis, y los lenguajes de programación no  son excepción.

### ... mediante un lenguaje interpretado

En contraposición de los lenguajes compilados, tenemos los lenguajes interpretados. En este caso, no se hace una distinción interna entre nivel alto y bajo, puesto que la inmensa mayoría de lenguajes interpretados son de nivel alto. Lo que interesa es entender la idea general del funcionamiento y las diferencias con los compilados. Como en el caso de los lenguajes compilados, los programas también se escriben en ficheros de texto que contienen código fuente. La divergencia surge inmediatamente después de acabar de escribirlos, en la manera como se genera un fichero ejecutable. El quid de la cuestión es que, precisamente, ni se genera ningún código objeto ni ningún fichero ejecutable. Se trabaja directamente con el fichero de código fuente. Una vez este está escrito, el proceso de creación del programa ejecutable ha finalizado.

> -warning-**Intérprete**
>
> Un intérprete no traduce el código fuente del programa a código objeto y entonces lo ejecuta. Lo que hace es ejecutar diferentes instrucciones de su propio código según cada instrucción leída del código fuente.

Imagináis un programa que acepta una serie de datos que codifican unas instrucciones, las va leyendo una por una y las va procesando de forma que actúa de una forma o de otra, es decir, ejecuta una parte u otra de su propio código objeto según el tipo de instrucción leída. A fin de cuentas, sería un programa que imita el comportamiento de un procesador, pero a escala de software. Pues esto es exactamente un intérprete.

> -info-Un lenguaje interpretado se ejecuta indirectamente, mediante la ayuda de un programa auxiliar llamado intérprete, que procesa el código fuente y  gestiona la ejecución.

Igual que en los lenguajes compilados, puede suceder que el programador haya incluido sin darse cuenta algún error de sintaxis en las instrucciones. En este caso, será el intérprete quién mostrará el error y se negará a ejecutar el programa hasta que haya sido solucionado.

> -info-Coloquialmente, la generación de bytecode a partir del código fuente se denomina igualmente **compilar**.

Algunos lenguajes interpretados usan una aproximación híbrida. El código fuente se compila y como resultado se genera un fichero de datos binarios llamados **bytecode**. Este bytecode, no obstante, no es formalmente código objeto, puesto que no es capaz de entenderlo el hardware de ningún procesador. Sólo un intérprete lo puede procesar y ejecutar. Simplemente es una manera de almacenar más eficiente y en menos espacio, en formato binario y no en texto, las instrucciones incluidas en el código fuente. Este es el motivo por el cual, a pesar de necesitar un proceso de compilación, estos lenguajes no se consideran realmente compilados y se continúan clasificando como interpretados.

Por sus características, los lenguajes interpretados no requieren un proceso posterior de enlazamiento.

La **figura 3** muestra un esquema del proceso de ejecución de un programa en lenguaje interpretado. Notad que en el caso de un lenguaje con bytecode, lo que se proporciona al intérprete son ficheros con la versión del código fuente previamente compilado en bytecode, y no el código fuente directamente.

**Figura 3** Proceso de interpretación del código fuente

![](/programacion-java/assets/img/ini-prog//ic10mu1_04.png)Entre los lenguajes interpretados más conocidos encontramos Javascript, PHP o Perl. Muchos son lenguajes de script, que permiten el control de aplicaciones dentro de un sistema operativo, llevar a cabo procesos por lotes \(batch\) o generar dinámicamente contenido web. Entre los lenguajes interpretados basados en bytecode, Java es uno de los más populares.

## Entornos integrados de desarrollo

> -info-Un **IDE** \(Integrated Development Environment o Entorno Integrado de Desarrollo\) es una herramienta que integra todo lo que hace falta para generar programas de ordenador, de forma que el trabajo sea mucho más cómodo.

Una vez se ha descrito el proceso general para desarrollar y llegar a ejecutar un programa, se hace evidente que hay que tener instalados y correctamente configurados dos programas completamente diferentes e independientes en vuestro ordenador para desarrollarlos: editor, por un lado, y compilador \(incluyendo el enlazador\) o intérprete por la otra, según el tipo de lenguaje. Cada vez que queráis modificar y probar vuestro programa tendréis que ir alternando ejecuciones entre los dos. Realmente, sería mucho más cómodo si todo ello se pudiera hacer desde un único programa, que integrara los tres. Un editor avanzado desde el cual se pueda compilar, enlazar si se tercia, e iniciar la ejecución de código fuente para comprobar si funciona.

> -info-**Ejemplos de IDE**
>
> Algunos ejemplos de IDE son Visual Studio, para los lenguajes C\#, C++ y Visual Basic; IntelliJ IDEA , Netbeans y Eclipse, para los lenguajes Java y Ruby; Dev-Pascal, para el lenguaje Pascal, o el Dev-C, para el lenguaje C.

La utilización de estas herramientas agiliza increíblemente el trabajo del programador. Además, los IDE más modernos van más allá de integrar editor, compilador y enlazador o intérprete, y aportan otras características que hacen todavía más eficiente la tarea de programar. Por ejemplo:

* Posibilidad de hacer resaltar con códigos de colores los diferentes tipos de instrucciones o aspectos relevantes de la sintaxis del lenguaje soportado, para facilitar la comprensión del código fuente.
* Acceso a documentación y ayuda contextual sobre las instrucciones y sintaxis de los lenguajes soportados.
* Detección, y en algunos casos incluso corrección, automática de errores de sintaxis en el código, de manera similar a un procesador de texto. Así, no hay que compilar para saber que el programa está mal.
* Apoyo simultáneo del desarrollo de lenguajes de programación diferentes.
* Un depurador, una herramienta muy útil que permite pausar la ejecución del programa en cualquier momento o hacerla instrucción por instrucción, de forma que permite analizar como funciona el programa y detectar errores.
* En los más avanzados, sistemas de ayuda para la creación de interfaces gráficas.

En definitiva, usar un IDE para desarrollar programas es una opción muy recomendable. Aún así, hay que tener presente que son programas más complejos que un simple editor de texto y, como pasaría con cualquiera otro programa, hay que dedicar un cierto tiempo a familiarizarse con estos y con las opciones de que disponen.

## Vuestro primer programa

> -hint-En este módulo, el lenguaje con el que aprenderemos a programar será Java.

Hay diferentes lenguajes de programación, algunos realmente muy diferentes entre sí. Antes de seguir adelante hay que elegir uno que será el usado para practicar todos los conceptos de programación básica que veréis de ahora en adelante. Una vez aprendáis a programar en un lenguaje, dominar otros lenguajes os será muy fácil, puesto que muchos de los conceptos básicos, e incluso algunos aspectos de la sintaxis, se mantienen entre diferentes lenguajes de nivel alto.

Un lenguaje muy popular parecido a Java es el C. La sintaxis del Java está claramente basada en la de este lenguaje.

La siguiente gráfica muestra la relevancia de los lenguajes de programación existentes.

![](/programacion-java/assets/img/ini-prog//tiobe.png)

Fuente: [https://www.tiobe.com/tiobe-index/](https://www.tiobe.com/tiobe-index/)

## Características relevantes de Java

Desgraciadamente, no hay el lenguaje perfecto, sin ningún inconveniente y que sea ideal para crear cualquier tipo de programa. Siempre hay que llegar a un compromiso entre ventajas e inconvenientes. De hecho, la elección misma de qué lenguaje hay que usar puede llegar a condicionar enormemente el proceso de creación de un programa, y no es sensato usar siempre el mismo para resolver cualquier problema. En cualquier caso, vale la pena comentar los motivos por los cuales se considera interesante usar Java.

> -info-**Aplicación de escritorio**
>
> Se considera una aplicación de escritorio \(desktop application\) la que es totalmente autocontenida y que se puede ejecutar en ordenadores de sobremesa o portátiles. Este término se usa en contraposición con las aplicaciones basadas en Web.

* **Popular**: Java fue creado en 1995 por la firma Sun Microsystems, que el 2009 fue comprada por la empresa de bases de datos Oracle. Su propósito era ofrecer un lenguaje lo menos ligado posible a la arquitectura sobre la cual se ejecuta.  Desde entonces, su popularidad ha ido en aumento también como lenguaje para crear aplicaciones de escritorio, y actualmente es uno de los lenguajes más utilizados en este campo. Esto hace que la demanda de profesionales que lo dominen sea muy alta y que tenga una gran aceptación y cantidad de documentación disponible.

* **De nivel alto con compilador estricto**: Java es un lenguaje de nivel bastante alto, con todas las ventajas que esto implica. Adicionalmente, su compilador es especialmente estricto a la hora de hacer comprobaciones sobre la sintaxis empleada y cómo se manipulan los datos que se están tratando en el programa. Si bien esto a veces puede parecer un poco fastidioso cuando se producen ciertos errores de compilación, en realidad es una ventaja, puesto que enseña al programador a tener más grado de control sobre el código fuente que genera, de forma que sea correcto.

* **Multiplataforma**: uno de los factores decisivos en la popularidad de Java es que sus programas se pueden ejecutar en cualquier plataforma sin que haya que volver a compilar. Una vez el código fuente se ha compilado una vez, el bytecode resultante puede ser traído a otras plataformas basadas en otros tipos de procesador y continuará funcionando. Sólo hay que disponer del intérprete correspondiente para la nueva plataforma. Esto homogeneiza enormemente el aprendizaje del lenguaje independientemente de la plataforma que usáis para estudiarlo.

* **Orientado a objetos**: este es el nombre de una metodología avanzada, muy popular y útil, para diseñar programas. Es un mecanismo de nive alto para acercar la manera como se hacen los programas al método de pensamiento humano.

> -info-**Multiplataforma**
>
> La propiedad de ser multiplataforma es el que los programadores de Java describen como “_Compile once, run everywhere_” \(Compila una vez, ejecuta en todas partes\).

## Creación y ejecución de programas Java

> -info-Por ahora se tratará el caso de la creación de programas sencillos que se compongan de un único fichero de código fuente.

Este apartado se centrará en mostrar en detalle cómo se crea y se ejecuta un programa en lenguaje Java.

Dado que Java es un lenguaje interpretado, las herramientas que os hacen falta son:

1. Un editor de texto simple cualquiera.
2. Un compilador del lenguaje Java, para generar bytecode.
3. Un intérprete de Java, para poder ejecutar los programas.

Disponer de un editor de texto es lo menos problemático, puesto que todos los sistemas operativos de propósito general suelen tener instalado alguno por defecto. Ahora bien, cuando se edita un fichero de código fuente, hay que asignarle una extensión específica de acuerdo con el lenguaje de programación empleado, de forma que pueda ser fácilmente identificado como tal.

> -info-La extensión de los ficheros de código fuente en Java es `.java`.

Otros lenguajes tienen otras extensiones. A título de ejemplo, en lenguaje C los ficheros tienen la extensión .c, en ensamblador .asm, en Perl .pl, etc. Es importante que al editar código fuente desde cualquier editor de texto guardéis el fichero con esta extensión y no la que os ofrezca por defecto \(normalmente, .txt\).

> -hint-**Camel Case** ¿Por qué se llama notación de camello?
>
> En el caso concreto de Java, hay una convención a la hora de dar nombre a un fichero de código fuente. Se suele usar UpperCamelCase \(notación de camello con mayúsculas\). Esta corresponde a usar sólo letras consecutivas sin acentos \(ni espacios, subrayados o números\), y en que la inicial de cada palabra usada sea siempre en mayúscula. Esto no es estrictamente imprescindible, pero sí muy recomendable, puesto que es el estilo de nomenclatura que siguen todos los programadores de Java y la que encontraréis en documentación, guías u otros programas. Además, en algunos sistemas, el uso de caracteres especiales, como los acentos, puede llevar a errores de compilación.
>
> Algunos ejemplos de nombres de ficheros de código fuente aceptables son: `Prueba.java, HolaMundo.java, MiPrimerPrograma.java`, etc.

El compilador y el intérprete de Java son dos programas que tendréis que instalar en vuestro ordenador, puesto que normalmente no están preinstalados por defecto. Hay varios tipos, de diferentes fabricantes, pero lo más recomendable es instalar el que proporciona de manera gratuita el actual propietario de Java, la empresa Oracle, en su página de descargas. Hay diferentes versiones de la entorno a trabajo con Java, pero el más habitual es trabajar con la Java SE \(Java standard edition, edición estándar de Java\).

> -info-La página de descargas de Oracle es [http://www.oracle.com/downloads](http://www.oracle.com/downloads). Hay versiones del JDK para diferentes procesadores y sistemas operativos.

El compilador de Java está incluido dentro del llamado JDK \(Java development kit, herramientas de desarrollo del Java\). Este proporciona una serie de ejecutables vía línea de órdenes que sirven para hacer diferentes tareas con código fuente Java.

El programa que pone en marcha el compilador es el ejecutable llamado javac \(en un sistema Windows, javac.exe\). Por lo tanto, para el fichero con código fuente Java llamado `HolaMundo.java` habría que abrir una línea de instrucciones y ejecutar:

```bash
javac HolaMundo.java
```

> -info-El fichero con bytecode resultante del proceso de compilación se denomina igual que el fichero de código fuente, pero con la extensión `.class`.

Una vez disponemos del fichero con bytecode, este sólo puede ser ejecutado con la ayuda del intérprete de Java, conocido popularmente como la JVM \(Java virtual machine, máquina virtual de Java\). Esta se incluye dentro del paquete llamado JRE \(Java runtime environment, entorno a ejecución de Java\). A la vez, el JRE ya va incorporado automáticamente dentro del JDK. La **figura 4** muestra un esquema de la relación entre herramientas incluidas a los diferentes paquetes para el desarrollo y ejecución de programas en Java.

**Figura 4** Relación de herramientas incluidas en cada paquete de software del Java![](/programacion-java/assets/img/ini-prog/ic10mu1_06.png)

El ejecutable que pone en marcha el intérprete de Java es el llamado java \(en un sistema Windows, java.exe\). Una vez se dispone del fichero de bytecode `HolaMundo.class` se puede ejecutar desde la línea de órdenes haciendo:

```bash
java HolaMundo
```

> -warning-Notad que no se especifica ninguna extensión. Él solo deduce que la extensión tiene que ser `.class`. Inmediatamente, el programa se pondrá en marcha.

A pesar de que este es el entorno básico de desarrollo de Java, afortunadamente hay varios IDE que soportan este lenguaje y concentran en un único entorno este software. Para trabajar con Java hay varios IDE con diferentes grados de popularidad: Eclipse, Netbeans, Jcreator, etc. Cada uno tiene sus propias particularidades y grados de complejidad de configuración y uso.

> -info-Finalmente, es importante remarcar que en el supuesto de que sólo queráis ejecutar un programa que ya ha sido desarrollado por otro, sea mediante un IDE o no, la única herramienta que hay que tener instalada en el ordenador para poder ejecutar el fichero .`class` resultante es la última versión del JRE. No hay que instalar nada más.

## Hola, mundo!

> -info-Podéis encontrar una lista del código fuente del programa “Hello, world!” para diferentes lenguajes a [http://www.scriptol.com/programming/hello-world.php](http://www.scriptol.com/programming/hello-world.php)

Dentro del ámbito de la programación es tradición que el primer programa que se escribe y se ejecuta cuando se inicia el estudio de un nuevo lenguaje sea el llamado “Hola, mundo!” \(originalmente en inglés, “Hello, world!”\). Esta tarea es un simple ejercicio de copiar el código fuente del programa, por lo cual ni siquiera hay que entender todavía la sintaxis del lenguaje. El objetivo principal de hacer este programa es ver que el entorno a trabajo se encuentra correctamente instalado y configurado, puesto que por su sencillez es difícil que dé problemas. Además, también os sirve como plantilla de la estructura básica de un programa en el lenguaje escogido y permite repasar la estructura y algunos de los elementos básicos.

> -alert-El lenguaje Java es sensible a mayúsculas y minúsculas. El significado de los términos varía según cómo están escritos. Por lo tanto, es imprescindible que tanto el código fuente como el nombre del fichero se escriban exactamente tal como se muestran.

El código fuente para la versión en Java es el siguiente:

![1536595378196](/programacion-java/assets/img/ini-prog//1536595378196.png)

> -reto-**Reto 1**: copiad el código fuente de este programa en un fichero llamado `HolaMundo.java` y ejecutadlo en el vuestro entorno de trabajo. El resultado de la ejecución tendría que ser que por pantalla se muestre la frase Hola, mundo!.

La **figura 5** os muestra a qué parte característica de un fichero de código fuente se corresponde cada parte del texto del código fuente.

**Figura 5** Elementos del código fuente del programa “Hola, mundo!”
![](/programacion-java/assets/img/ini-prog//ic10mu1_07.png)

### Importación de extensiones \(bibliotecas\)

Una biblioteca es un conjunto de extensiones al conjunto de instrucciones disponibles cuando generáis un programa. Para poder usar estas instrucciones adicionales hace falta que, dentro del código fuente, como preámbulo,  declaréis la importación. En caso contrario, las extensiones no están disponibles por defecto dentro del lenguaje. En el caso del programa “Hola, mundo!”, al ser muy sencillo, no es necesario, pero en Java se usaría la sintaxis:

### Indicador de inicio del código fuente

El código fuente donde empieza realmente el programa en Java empieza con el texto de declaración que se muestra a continuación, en que &lt;NombreFichero&gt; puede variar pero siempre tiene que corresponder exactamente con el nombre del fichero que lo contiene. Esto es esencial. De lo contrario, el compilador nos dará un error. El código del programa se escribirá a continuación, siempre entre llaves, { … }.

```java
public class <NombreFichero> {

  ...

}
```

> -alert-Para desgracia del programador principiante, muchas partes de la sintaxis de Java están vinculadas a la orientación a objetos.

Este texto declara que este fichero es el inicio de aquello que en nomenclatura Java se denomina una clase. Este es un término estrechamente vinculado a la orientación a objetos, pero por ahora lo usaremos simplemente para referirnos a un fichero que contiene código fuente de Java.

### Comentarios al código

Opcionalmente, también se pueden escribir comentarios dentro del código fuente. Se trata de texto que representa anotaciones libres al programa, pero que el compilador no procesa. Normalmente, un comentario se identifica para ser una línea de texto libre que empieza por una combinación de caracteres especiales. Los comentarios pueden estar en cualquier parte del fichero, puesto que el compilador los ignora. No sirven realmente para nada en orden a la ejecución del programa, y sólo son de utilidad para quien está editando el fichero de código fuente.

Comentar el código fuente para explicar qué hace cada parte del programa, especialmente en aquellas más complejas, es una tarea muy importante que demuestra si un programador es cuidadoso o no.

En el programa Hola, mundo hay el comentario siguiente:

```java
//El programa "Hola, mundo!" en Java
```

En lenguaje Java los comentarios se escriben o bien precediéndolos con dos barras, en el supuesto de que tengan una sola línea, o bien en el formato siguiente si ocupan más de una línea.

```java
/** 
 * Este es el programa "Hola, mundo!"
 * en el lenguaje de programación Java
*/
```

A partir de ahora, en todos los ejemplos de código, los detalles sobre que hace cada parte del programa se describirán mediante un comentario antes de cada instrucción.

### Indicador de la primera instrucción para ejecutar

Para que el ordenador sepa por donde empezar a ejecutar instrucciones, ante todo tiene que saber cuál es la primera de todas. Una vez localizada, continuará ejecutando el resto de manera secuencial, por orden de aparición al código fuente. En algunos lenguajes esto se hace implícitamente, puesto que la primera instrucción es directamente la primera línea de texto que aparece al código fuente. En el caso del Java, hay un texto que la indica claramente.

> -info-En Java, el bloque de instrucciones en que se engloba la primera instrucción del programa en la mayoría de lenguajes de programación se denomina el **método principal**.

Este método principal engloba todas las instrucciones del programa dentro de un bloque de instrucciones, entre llaves, {…}. Antes de las llaves hay una serie de texto que se tiene que escribir exactamente tal como se muestra. Si no, el intérprete de Java será incapaz de encontrarlo y de iniciar correctamente la ejecución del programa. Concretamente, dirá que “No encuentra el método pricipal” \(main method not found\).

```java
public static void main (String[] args) {

  ...

}
```

La primera instrucción es la primera que está escrita apenas después de la llave abierta, {. La última instrucción es la escrita inmediatamente antes de la llave cerrada, }.

### Bloques de código o de instrucciones

Las instrucciones o sentencias del programa están escritas una detrás de la otra, normalmente en líneas separadas para hacer el código más fácil de entender. En algunos lenguajes, al final de cada línea hace falta un delimitador especial, que sirva para indicar cuando acaba una sentencia y  empieza otra. Con el salto de línea no hay bastante. En el caso del Java, se trata del punto y coma, **;**.

Los programas más simples, como los que veremos por ahora, sólo disponen de un único bloque de instrucciones.

Las diferentes instrucciones se suelen agrupar en **bloques de instrucciones**. El inicio y el fin de cada bloque diferente quedan identificados en Java porque las instrucciones están rodeadas por llaves, {…}.

Por lo tanto, en este programa sólo hay una única, a la vez primera y última, instrucción.

```java
System.out.println("Hola, mundo!");
```

A pesar de que todavía no conocéis ninguna de las instrucciones de Java ni su sintaxis, posiblemente podéis deducir de todas maneras que esta sirve para ordenar al ordenador que muestre por pantalla el texto escrito entre comillas. Es decir, que es una orden sobre el componente de entrada/salida \(pantalla\). Esta es una instrucción muy útil. En este código también se puede apreciar que en el lenguaje Java las instrucciones acaban con un punto y coma, ;.

> -reto-**Reto 2**: modificad el código fuente para que el programa muestre por pantalla Adiós, mundo!