# Llanquihue Tour App - Sistema de Gestión

**Proyecto desarrollado durante el curso de Programación Orientada a Objetos**

## Descripción General
Sistema completo para la agencia de turismo **Llanquihue Tour** que gestiona tours, personal, vehículos y colaboradores mediante principios de POO.

## Funcionalidades por Semana

- **Semanas 4-5**: Lectura de archivos, ArrayList y filtrado
- **Semana 6**: Jerarquía de clases con herencia (`ServicioTuristico`)
- **Semana 7**: Polimorfismo y colecciones genéricas
- **Semana 8 (Sumativa)**: Interfaces, `instanceof`, y GUI básica

## Estructura del Proyecto


```plaintext
src/
└── llanquihuetourapp/
    ├── model/
    │   ├── Tour.java
    │   ├── Persona.java
    │   ├── ServicioTuristico.java          
    │   ├── RutaGastronomica.java          
    │   ├── PaseoLacustre.java              
    │   ├── ExcursionCultural.java
    │   ├── Vehiculo.java                 ← Nueva clase
    │   ├── Registrable.java              ← Nueva clase
    │   ├── GuiaTuristico.java            ← Nueva clase
    │   └── ColaboradorExterno.java       ← Nueva clase 
    ├── data/
    │   ├── GestorDatos.java
    │   ├── GestorServicios.java
    │   └── GestorEntidades.java      ← Nueva clase  
    ├── service/
    │   └── TourService.java
    ├── util/
    │   └── Validador.java
    └── ui/
        ├── Main.java        ← actualizada
        └── GUIPrincipal.java    ← Nueva clase
  
resources/
    ├── tours.txt
    └── personas.txt
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


## Semana 7 - Polimorfismo y Colecciones Genéricas

**Objetivo:** Aplicar polimorfismo mediante una colección de tipo `List<ServicioTuristico>` y el método `mostrarInformacion()` sobrescrito.

**Conceptos aplicados:**
- Colecciones genéricas (`List<ServicioTuristico>`)
- Polimorfismo (llamar métodos sobrescritos desde referencia de superclase)
- Clase abstracta con método abstracto
- Sobrescritura con `@Override`

**Cómo ejecutar:**
Ejecutar la clase `llanquihuetourapp.ui.Main`

## Tecnologías y Conceptos Aplicados (Semana 8)

- **Interfaz**: `Registrable`
- **Polimorfismo** y colecciones genéricas (`List<Registrable>`)
- **Diferenciación de tipos** con `instanceof`
- **Interfaz Gráfica** con Swing (`JFrame` + `JOptionPane`)
- Herencia, abstracción y encapsulamiento

## Cómo Ejecutar

### Opción 1: Modo Consola
Ejecutar la clase `llanquihuetourapp.ui.Main`

### Opción 2: Interfaz Gráfica (Recomendada)
Ejecutar la clase `llanquihuetourapp.ui.GUIPrincipal`
