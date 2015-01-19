# Programación en Android

## Introducción a Android

* Sistema Operativo?
* Aplicaciones
* Seguridad
* ¿es gratuito?
* Versiones
* Historia

## Estructura

* Librerias
* Apps

## Programación

* Estructura del IDE
* ¿con qué se puede programar?

## Instalación del IDE

### Instalación de eclipse


### Instalación de Android Studio

* Problemas de rendimiento

* Gradle

### Elementos comunes

* SDK
* Actualizaciones
#### Componentes
* SDK Manager
* AVD Manager

## Estructura de una aplicación

### Código Java
### Recursos

* Configuración Visual
	* Layout
	* Views
	* Estilos
	* Imágenes
* Cadenas

* Ejemplo: pantalla de login. 

## Estructura visual

### Tipos de layout
* RelativeLayout
* TableLayout
* AbsoluteLayout

### Modificadores visuales

* Weight
* Gravity

#### Ejemplo de layouts de aplicaciones: Login, calculadora

#### Construcción de la estructura compleja de la pantalla de una calculadora, juego tipo memory

Se usan:

* TableLayout
* TableRow
* Views
* Estilos
* Weight

### Componentes

#### Tipos
* Button
* TextView
* EditText
* ImageView

#### Propiedades
* Layout
* Text
* Aspecto

* Ejemplo de propiedades en diversos controles

#### Estilos
* Utilidad
* Generación de estilos (extract)

#### Acceso a los componentes
* findViewByID
* Casting

* Ejemplo: crear una variable global con el control "cacheado"

#### Eventos: Listener

* OnClicK
* Notificaciones: Toast
* ¿Otros eventos?: onCreate

* Ejemplo: calculadora muestra pulsación
* Ejercicio: tecla ".", "0" como valor inicial

## Depuracion

* Uso del emulador para depuracion
* Puntos de ruptura
* Ver variables
* Parar, continuar, saltar, ...

### Errores frecuentes

* Distinto nombre de la función de eventos y en fichero xml
* No se inicializan las variables


## Activities

* Creación
* Cierre
* Estructura
* Necesidad de comunicación

## Intent

* Contenidos
* Tipos
