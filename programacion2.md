# Programación 2
Vamos a ver algunas técnias más avanzadas de programación, como pueden ser crear arrays de id o de atributos.

Para ello vamos a hacer una programación TopDown, es decir, empezaremos creando la estructura del código a partir del [pseudocódigo](./presudocodigoMemory.md).

Para ello creamos las funciones:

* inicializacion
* clickImagen
* botonStart
* botonStop

Añadiremos a las funciones pseudocódigo para indicar las tareas que se deben realizar en cada uno de ellos, utilizando comentarios de tipo TODO a los que podremos seguir la pista en la ventana TODO del entorno



    void inicializacion()
    {
        // TODO: rellenar aleatoriamente (rellenar imagenBoton )
        // TODO: cargar sonidos
        // TODO: puntuacion a 0
        // TODO: tiempo a 0
    }

    public void botonStart(View v)
    {
        inicializacion();  // Ya sabemos cómo hacerlo

        // TODO: hacer visible Las cartas (tablelayout.setVisibility(Visible) );

    }
    public void clickImagen(View v)
    {
        // TODO: ¿Y si el boton ya esta pulsado?
        // TODO: Buscar boton para ver su imagen
        // TODO: Mostrar imagen (iv.setImageResource(R.drawable.IMAGEN); )


        // TODO: ¿EsLaPrimera?
        // TODO:	SI Volteamos
        // TODO:    NO 
            // TODO: Si imágenes iguales
                // TODO: actualizar visor puntuacion
                // TODO: sonido victoria
                // TODO: No cliceable la 2ª
            // TODO: No son iguales
                // TODO: sonido fracaso total
                // TODO: Volteamos

        }


## Estructura de datos

Ahora vamos a ir declarando las variables necesarias para realizar las tareas que hemos indicado en las funciones

TODO: ¿usar Tag?

    int []imagenBoton={R.drawable.conejo,R.drawable.oveja,R.drawable.pollo,
            R.drawable.conejo,R.drawable.oveja,R.drawable.pollo,
            R.drawable.rinoceronte,R.drawable.serpiente,R.drawable.tiburon,
            R.drawable.rinoceronte,R.drawable.serpiente,R.drawable.tiburon
    };  // Guarda la imagen de cada boton
    int []idBoton={R.id.iv11,R.id.iv12,R.id.iv13,
                  R.id.iv21,R.id.iv22,R.id.iv23,
                  R.id.iv31,R.id.iv32,R.id.iv33,
                  R.id.iv41,R.id.iv42,R.id.iv43}; // Guarda el id de los botones

    int iPuntuacion=0;
    int iTiempo=0;


    boolean bEsLaPrimera=true; // Para saber si es la primera o 2ª carta
    int idBotonPrimeroPulsado=0;
    int idBotonSegundoPulsado=0;
    int idImagenPrimerBotonPulsado=0;
    
## Código

Ahora vamos a completar el código. La mayor parte tiene una traducción directa. Sólo vamos a comenta el método que busca un control en toda la lista disponible

    int iNumeroBotonPulsado=0;
    for(int i=0;i<12;i=i+1)
    {
        if(v.getId()==idBoton[i])
        {
            iNumeroBotonPulsado=i;
            break;
        }
    }

donde vemos que iteramos por medio de un bucle a lo largo de todos los ids hasta encontrar la del control pulsado. En ese caso guardamos la posición en a variable iNumeroBotonPulsado

## Sonido

## Eventos en diferido

Una característica de Android es ...

TODO: Handler

## Tiempo

Podemos usar:
* Una medida de tiempos "a mano"
* Un control del interface de tiempos Chronometer


## Des-Ordenación de cartas

¿Funciona shufle?

![PseudocodigoACodigo](./imagenes/PseudocodigoACodigo.png)
![PseudocodigoACodigo2](./imagenes/PseudocodigoACodigo2.png)

## Start y stop del juego