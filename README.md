# Llanquihue Tour App

**Sistema de Gestión para Agencia de Turismo**  
*Desarrollado como actividad sumativa - Semana 5*

## Descripción
Aplicación en Java que permite gestionar tours turísticos y personal vinculado (guías, operadores y proveedores) de la agencia **Llanquihue Tour**. 

El sistema lee datos desde archivos externos (.txt), los carga en colecciones dinámicas (`ArrayList`), aplica validaciones, filtros y búsquedas, demostrando principios de **organización modular**, **separación de responsabilidades** y **buenas prácticas** de programación orientada a objetos.

## Estructura del Proyecto

```plaintext
LlanquihueTourApp/
├── src/
│   └── llanquihuetourapp/
│       ├── model/
│       │   ├── Tour.java
│       │   └── Persona.java
│       ├── data/
│       │   └── GestorDatos.java
│       ├── service/
│       │   └── TourService.java
│       ├── util/
│       │   └── Validador.java
│       └── ui/
│           └── Main.java
├── resources/
│   ├── tours.txt
│   └── personas.txt
└── README.md
````


## Paquetes y Responsabilidades

- **`model`** → Clases de dominio (`Tour` y `Persona`)
- **`data`** → Gestión de archivos y carga de datos
- **`service`** → Lógica de negocio y operaciones (filtros, búsquedas)
- **`util`** → Clases de utilidad y validaciones
- **`ui`** → Interfaz de usuario (Main)

## Funcionalidades Implementadas

- Lectura de datos desde archivos `.txt`
- Validaciones de RUT y teléfono
- Uso de `ArrayList` y Streams
- Filtros por precio y tipo
- Búsquedas por nombre y categoría
- Manejo de excepciones
- Código modular y reutilizable

## Cómo Ejecutar

1. Abrir el proyecto en **Apache NetBeans**.
2. Asegurarse que la carpeta `resources` esté configurada como **Source Package Folder**.
3. Ejecutar la clase `llanquihuetourapp.ui.Main`.
4. Observar la carga de datos y los resultados en consola.

## Tecnologías Utilizadas

- Java (JDK 8 o superior)
- Apache NetBeans
- Programación Orientada a Objetos
- Manejo de archivos con `BufferedReader`
- Colecciones de Java

---
## Semana 6 - Jerarquías de Clases con Herencia

**Objetivo:** Implementar herencia simple para modelar diferentes tipos de servicios turísticos.

**Clases implementadas:**
- `ServicioTuristico` (superclase)
- `RutaGastronomica`, `PaseoLacustre` y `ExcursionCultural` (subclases)

**Conceptos aplicados:**
- Herencia
- Uso de `super()` 
- Sobrescritura de métodos (`toString()`)
- Polimorfismo

**Cómo ejecutar:** Ejecutar la clase `llanquihuetourapp.ui.Main`
