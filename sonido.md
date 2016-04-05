# Desarrollo de aplicaciones Android (161811FP07)

## Marzo-Abril de 2016. CEP de Granada

## José Antonio Vacas @javacasm

javacasm@gmail.com

![cc](https://raw.githubusercontent.com/javacasm/CodeWeek-programacion/master/images/Licencia_CC.png)


Sonidos (descargados de http://soundbible.com) :

[Acierto](https://raw.githubusercontent.com/javacasm/Memory2014/master/app/src/main/res/raw/sonido_acierto.ogg)

[Risa error](https://raw.githubusercontent.com/javacasm/Memory2014/master/app/src/main/res/raw/evil.ogg)

[Aplauso](https://raw.githubusercontent.com/javacasm/Memory2014/master/app/src/main/res/raw/applause.ogg)

Se puede utilizar casi cualquier formato: wav, midi, mp3. Pero el recomendado es el ogg, formato completa libre y tan versátil como el mp3. Si queremos usar este formato podemos convertir cualquier otro formato a ogg con este conversor online http://audio.online-convert.com/es/convertir-a-ogg

Para trabajar en Android con sonidos tenemos 2 opciones:

* MediaPlayer: una librería capaz de reproducir todos los formatos, tanto de vídeo como de audio, que nos proporciona una gran versatilidad pero con el coste de necesitar muchos recursos, lo que a veces la hace lenta.

* SoundPool: una clase pensada para reproducir sonidos de manera rápida (como es necesario en los juegos) y que nos permite preparar con antelación la reproducirón de los audios, para que en el momento necesario estos suenen de manera instantánea.

Usaremos este último. Para su uso solo tenemos que crear el objeto SoundPool, cargar los sonidos con el método load, lo que prepara su reproducción y luego utilizar play para hacer que estos se reproduzcan instantáneamente.

En la parte de la creación del objeto, vamos a ver cómo hacer una zona de código condicional, es decir que dependiendo de la versión de Android que usemos se utilice un código u otro ([ejemplo](http://stackoverflow.com/questions/28210921/set-audio-attributes-in-soundpool-builder-class-for-api-21))

En concreto podemos ver que a partir del API 21 se ha cambiado la forma de crear los objetos SoundPool, haciendo necesario usar el método Builder

	SoundPool sp;
    if((android.os.Build.VERSION.SDK_INT) >= 21){
        SoundPool.Builder sp21 = new SoundPool.Builder();
        sp21.setMaxStreams(5);
        sp = sp21.build();
    }
    else{
        sp = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
    }

Una vez creado el objeto sólo tenemos que cargar los sonidos con load, lo que nos devolverá un id para cada sonido

    idAplauso= sp.load(this,R.raw.applause,0);
    idMal=sp.load(this,R.raw.evil,0);
    idAcierto=sp.load(this,R.raw.sonido_acierto,0);

Para reproducirlo sólo haremos play

    sp.play(idAcierto,1,1,1,0,1);

con los argumentos: play(idSonido,volumenIzda,volumenDrcha,repeticion,prioridad,velocidad)
