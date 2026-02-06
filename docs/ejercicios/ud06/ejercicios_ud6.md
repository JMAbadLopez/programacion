# Boletín de Ejercicios - Unidad 6: Herencia y Polimorfismo

Este boletín contiene ejercicios prácticos diseñados para reforzar los conceptos de la Unidad 6. Están organizados por temáticas progresivas.

---

## 1. Composición

### Ejercicio 1: El PC Gamer
Queremos montar un ordenador por piezas.

1.  Crea las clases `Procesador` (modelo, precio), `MemoriaRAM` (capacidad, precio) y `TarjetaGrafica` (modelo, precio).
2.  Crea la clase `Ordenador`.

    *   **Atributos:** Debe tener un objeto de cada uno de los componentes anteriores (Composición).
    *   **Métodos:**
        *   `getPrecioTotal()`: Suma el precio de todos los componentes.
        *   `toString()`: Muestra la configuración completa del PC.
3.  En el `main`, monta tu PC ideal y muestra su precio.

### Ejercicio 2: La Casa Real
Vamos a modelar una vivienda.

1.  Crea la clase `Habitacion` con atributos `nombre` (ej: "Salón", "Cocina") y `metrosCuadrados`.
2.  Crea la clase `Casa`.
    *   **Atributos:** Una lista (`ArrayList`) de habitaciones.
    *   **Constructor:** Inicializa la lista vacía.
    *   **Métodos:**
        *   `agregarHabitacion(Habitacion h)`.
        *   `borrarHabitacion(String nombre)`.
        *   `getMetrosTotales()`: Recorre la lista y suma los metros cuadrados de todas las habitaciones.
3.  Crea una casa, añade 3 habitaciones y comprueba los metros totales.

---

## 2. Herencia

### Ejercicio 3: Electrodomésticos Inteligentes
1.  Clase Padre: `Electrodomestico` (precio, peso, color).
    *   Constructor, Getters/Setters y un método `consumirEnergia()` que imprime "Electrodoméstico consumiendo...".
2.  Clases Hijas:
    *   `Lavadora`: Añade atributo `carga` (kg) y sobreescribe `consumirEnergia()`.
    *   `Television`: Añade `resolucion` (pulgadas) y sobreescribe `consumirEnergia()`.
3.  Prueba a crear objetos de ambos tipos y llama a sus métodos.

### Ejercicio 4: Red Social
1.  Clase Base: `Publicacion` (usuario, fecha, likes).
2.  Clases Derivadas:
    *   `Tweet` (texto). Restricción: No puede superar los 280 caracteres.
    *   `Foto` (urlImagen, filtro).
    *   `Video` (duracion).
3.  Crea un método `darLike()` en la clase base que incremente el contador.

---

## 3. Clases Abstractas

### Ejercicio 5: Figuras Geométricas
1.  Clase Abstracta: `Figura2D`.
    *   Métodos abstractos: `double calcularArea()` y `double calcularPerimetro()`.
2.  Clases Concretas:
    *   `Circulo`: Atributo `radio`. Implementa las fórmulas ($Area = \pi * r^2$).
    *   `Rectangulo`: Atributos `base`, `altura`.
3.  Crea una figura de cada tipo y muestra sus áreas. Intenta instanciar `Figura2D` para ver el error.

### Ejercicio 6: Gestión de Empleados
1.  Clase Abstracta `Empleado` (nombre, apellidos, dni).
    *   Método abstracto: `double calcularSalarioMensual()`.
2.  Hijos:
    *   `Asalariado`: Tiene un sueldo fijo mensual al año (14 pagas). Salario mensual = sueldoAnual / 14.
    *   `Comisionado`: Tiene un sueldo base + comisión por ventas. Añade atributo `ventasRealizadas`.
    *   `PorHoras`: Cobra por hora trabajada. Atributos: `precioHora`, `horasTrabajadas`.

---

## 4. Interfaces

### Ejercicio 7: Reproductor Multimedia
1.  Interfaz `Reproducible`.
    *   Métodos: `play()`, `pause()`, `stop()`.
2.  Clases:
    *   `CancionSpotify`: Al hacer play dice algo como "Reproduciendo canción de rock...".
    *   `VideoYoutube`: Al hacer play dice "Mostrando vídeo...".
    *   `Podcast`: Al hacer play dice "Reproduciendo audio...".
3.  Prueba a meterlos todos en un array de `Reproducible` y dale al play a todo.

### Ejercicio 8: Sistema de Notificaciones
1.  Interfaz `Notificable` con método `enviar(String mensaje)`.
2.  Implementaciones:
    *   `Email`: Imprime "Enviando correo a [email]: [mensaje]".
    *   `SMS`: Imprime "Enviando SMS a [telefono]: [mensaje]".
    *   `PushNotification`: Imprime "Notificación app: [mensaje]".
3.  Crea una clase `Alerta` que tenga una lista de `Notificable` y un método `lanzarAlerta(String msg)` que notifique por todas las vías a la vez.

---

## 5. Polimorfismo

### Ejercicio 9: El Garaje Inteligente
1.  Clase Abstracta `Vehiculo` (matricula, marca). Método abstracto `calcularPrecioParking()`.
2.  Hijos:
    *   `Coche`: 0.02€ por minuto.
    *   `Moto`: 0.01€ por minuto.
    *   `Camion`: 0.04€ por minuto.
3.  Clase `Garaje`:
    *   Tiene un `ArrayList<Vehiculo>`.
    *   Método `entrar(Vehiculo v)`.
    *   Método `salir(Vehiculo v, int minutos)` que cobra según el tipo de vehículo (Polimorfismo puro).

### Ejercicio 10: La Orquesta Sinfónica
1.  Interfaz `Instrumento` con método `tocar()`.
2.  Clases: `Piano`, `Guitarra`, `Violin`.
    *   Añade un método exclusivo a `Piano`: `afinarTecla()`.
3.  En el `main`:
    *   Crea una lista de instrumentos variados.
    *   Recórrelos y haz que suenen.
    *   **Reto:** Usa `instanceof` para detectar si hay algún piano en la orquesta y, solo si es un piano, llámale a `afinarTecla()`.
