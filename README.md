# Módulo de Programación — 1º DAM

**IES Camp de Morvedre · CFGS Desarrollo de Aplicaciones Multiplataforma**

Repositorio del material didáctico del módulo de **Programación** de **1º de DAM**. El sitio web con el contenido publicado está disponible en:

🌐 **<https://jmabadlopez.github.io/programacion/>**

---

## Descripción

Este repositorio contiene las unidades teóricas, los boletines de ejercicios y los recursos del módulo de Programación. El material está construido con [MkDocs Material](https://squidfunk.github.io/mkdocs-material/) y se publica automáticamente en GitHub Pages mediante GitHub Actions.

El módulo cubre el ciclo completo del desarrollo en Java: desde los fundamentos de la programación estructurada hasta el diseño de aplicaciones orientadas a objetos con acceso a base de datos e interfaz gráfica con JavaFX.

---

## Contenido

### Unidades Didácticas

| Unidad | Título |
| :---: | :--- |
| UD1 | Introducción a la programación. Lenguaje Java |
| UD2 | Programación estructurada. Estructuras de control y repetición |
| UD3 | Funciones y procedimientos |
| UD4 | Estructuras de datos dinámicas |
| UD5 | Programación Orientada a Objetos (POO) |
| UD6 | POO Avanzada: Herencia, Interfaces y Polimorfismo |
| UD7 | Ficheros y Excepciones |
| UD8 | Acceso a Bases de Datos con JDBC |
| UD9 | Interfaces Gráficas con JavaFX |

### Boletines de Ejercicios

Cada unidad cuenta con uno o más boletines de ejercicios organizados por nivel (iniciación, intermedio, avanzado) y actividades entregables. Consulta la web del módulo para acceder a ellos.

### Recursos

- Guía de instalación de IntelliJ IDEA
- Infografías interactivas (bucles, ArrayList, burbuja, recursividad)
- Algorítmica básica

---

## Tecnología

- **Generador:** [MkDocs](https://www.mkdocs.org/) con el tema [Material](https://squidfunk.github.io/mkdocs-material/)
- **Extensiones:** `pymdownx.tabbed`, `pymdownx.details`, `admonition`, `pymdownx.superfences` (con soporte Mermaid)
- **Despliegue:** GitHub Actions → GitHub Pages (rama `gh-pages`)

Para construir el sitio en local:

```bash
pip install mkdocs-material
mkdocs serve        # servidor de desarrollo en http://127.0.0.1:8000
mkdocs gh-deploy    # publicar en GitHub Pages
```

---

## Autoría

Este material ha sido elaborado y es mantenido por **José Manuel Abad López** — docente del IES Camp de Morvedre.

- 📧 <jm.abadlopez@edu.gva.es>
- 🌐 <https://jmabadlopez.github.io>

Las unidades UD1 y UD2 están basadas en el trabajo original de **Lorenzo Díaz de Haro** y **José Manuel Romero Martínez**, adaptadas para el presente curso.

---

## Licencia

Este material se distribuye bajo licencia [Creative Commons CC BY-SA 4.0](https://creativecommons.org/licenses/by-sa/4.0/). Puedes reutilizarlo y adaptarlo siempre que cites la autoría y mantengas la misma licencia.
