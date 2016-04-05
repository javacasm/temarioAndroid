# Desarrollo de aplicaciones Android (161811FP07)

## Marzo-Abril de 2016. CEP de Granada

## José Antonio Vacas @javacasm

javacasm@gmail.com

![cc](https://raw.githubusercontent.com/javacasm/CodeWeek-programacion/master/images/Licencia_CC.png)



# Estructura de una aplicación

Los proyectos de Android Studio son muy complejos en cuanto a que incorporan un gran número de ficheros. La filosofía de Google a la hora de usar el entorno es intentar que los desarrolladores hagamos un trabajo todo lo profesiona posible.

Por eso han dotado al entorno de todo lo necesario para mejorar la calidad de sistema:

* Se han incorporado herramientas de control de versiones como Git o SVN y conectores con repositorios como github.com
* Al crear una aplicación se crean casos de test para garantizar la calidad del código
* Se "obliga" a aplicar buenas prácticas por medio de avisos que se muestran al ir creando las aplicaciones. Un ejemplo de esto puede ser la "obligación" hacer toda aplicación fácilmente traducible.

Esto da lugar a una simple aplicación está compuesta por docenas de ficheros.

Para simplicarnos la vida existen diversas vistas de un mismo proyecto

![Formas de visualizacion](./imagenes/FormasVisualizacion.png)

De todas ellas, las más interesantes de momento son:

* Android: Una vista simplificada que nos muestras los ficheros que se usan y modifican el 90% del tiempo
![VistaAndroid](./imagenes/VistaAndroid.png)

* Project: vemos todo el detalle del proyecto
![VistaProject](./imagenes/VistaProject.png)

Mi recomendación es que inicialmente usemos la vista Android.

Veamos lo que contiene cada carpeta de esta vista Android:

* Código Java
* Recursos
	* diseños:layout
	* imágenes
	* traducciones
	* estilos
