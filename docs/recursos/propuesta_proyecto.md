# Diagrama de Clases UML Proyecto Intermodular (posible solución)

A continuación se muestra una posible solución para el diagrama de las clases del proyecto, incluyendo sus atributos, métodos principales y las relaciones de cardinalidad entre ellas:

```mermaid
classDiagram
    class Departamento {
        -int idDepartamento
        -String nombre
        -double presupuesto
        -String ubicacion
        +aumentarPresupuesto(double cantidad)
        +reducirPresupuesto(double cantidad)
    }

    class Empleado {
        -int idEmpleado
        -String nombre
        -String apellidos
        -Date fechaContratacion
        -double salario
        -String rol
        -Departamento departamento
        +asignarDepartamento(Departamento d)
        +actualizarSalario(double porcentaje)
        +obtenerAntiguedad() int
    }

    class Dispositivo {
        -int idDispositivo
        -String mac
        -String ip
        -String tipo
        -String sistemaOperativo
        -Empleado responsable
        +asignarResponsable(Empleado e)
        +liberarDispositivo()
    }

    class Incidencia {
        -int idIncidencia
        -String estado
        -Dispositivo dispositivo
        -Empleado resolutor
        -Date fechaAlta
        -Date fechaCierre
        +vincularDispositivo(Dispositivo d)
        +asignarResolutor(Empleado e)
        +cambiarEstado(String nuevoEstado)
        +cerrarIncidencia()
    }

    Departamento "1" o-- "0..*" Empleado : pertenece
    Empleado "1" -- "0..*" Dispositivo : es_responsable
    Dispositivo "1" *-- "0..*" Incidencia : tiene
    Empleado "0..1" -- "0..*" Incidencia : resuelve
```
