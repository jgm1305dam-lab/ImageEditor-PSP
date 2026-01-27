# PSP-ImageEditor 🎨
Aplicación de edición de imágenes para Android que aplica filtros y transformaciones en paralelo utilizando corrutinas y arquitectura MVVM con Jetpack Compose.
Enlace al vídeo demostrativo en YouTube: https://youtu.be/S-N_zpxYPos

## Descripción general
Este proyecto forma parte de la asignatura de Programación de Servicios y Procesos (PSP) y tiene como objetivo desarrollar un editor de imágenes con procesamiento concurrente y una interfaz moderna basada en Jetpack Compose.
La app permite cargar imágenes, aplicar diferentes filtros y transformaciones, y visualizar el resultado antes de guardar los cambios.

## Objetivos del proyecto
- Aplicar conceptos de concurrencia en Kotlin mediante corrutinas y `Dispatchers` para procesar imágenes en paralelo.  
- Diseñar una arquitectura **MVVM** con separación clara entre capas `ui`, `domain` y `data`.
- Implementar una interfaz de usuario fluida con Jetpack Compose y Material 3, optimizada para dispositivos Android.

## Funcionalidades principales
- Carga de imágenes desde la galería del dispositivo.
- Aplicación de filtros básicos (escala de grises, brillo, sepia, etc.).
- Aplicación de filtros avanzados (detección de bordes, desenfoque, etc.).
- Aplicación de transformaciones (rotaciones, volteos y redimensionamiento).
- Procesamiento paralelo de filtros utilizando corrutinas para mejorar el rendimiento.
- Vista previa antes/después con posibilidad de alternar rápidamente entre imagen original y editada.
- Creación de un histograma para observar los cambios implementados.

## Arquitectura y tecnologías
- Lenguaje: **Kotlin**.
- UI: Jetpack Compose + Material 3.
- Patrón de arquitectura: MVVM con `ViewModel` y `StateFlow` para gestión de estado reactivo.
- Concurrencia: corrutinas de Kotlin (`launch`, `async`, `withContext`) para procesar filtros en `Dispatchers.Default`.
Estructura de paquetes principal:
- `ui/` – Pantallas de galería, editor, historial, ajustes.
- `domain/` – Casos de uso para aplicar filtros, cargar/guardar imágenes y gestionar el historial.
- `data/` – Acceso a sistema de archivos, almacenamiento de preferencias y cachés de imágenes.
- `util/` - Clases y archivos utiles para el desarrollo global del proyecto.

## Requisitos y ejecución
- Mínimo Android 7.0 (API 24) o superior.
- Proyecto creado con plantilla de Jetpack Compose en Android Studio y Gradle con Kotlin DSL.
Pasos básicos de ejecución:
1. Descargar el archivo .apk.
2. Instalar el .apk en un dispositivo Android.
3. Abrir o ejecutar la aplicación tras su instalación.

## Estado del desarrollo
- Bloque 1 (estructura MVVM + pantalla inicial con StateFlow): completado.
- Bloque 2 (pantalla de galería y selección de imagen): Completado 
- Implementación de filtros y procesamiento paralelo: Completado
