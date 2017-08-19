package funciones;

import java.util.GregorianCalendar;
/*
* Desarrollado por Luis Hernando Benitez
* https://github.com/luisbenitez02
* luisbenitez02@gmial.com
*
* Este codigo ha sido compartido de manera libre y gratuita, incluye fragmentos
* de codigo correspondiente a otros autores cuyas fuentes se encuentran comentadas
* en su implementacion. Utiliza el codigo para el aprendizaje y no olvides dar credito
* POR FAVOR, INCLUYE EL LINK AL PROYECTO: https://github.com/luisbenitez02/date_java
*
* */
public class AnioBisiesto {
    private int anio;           //github.com/luisbenitez02/date_java

    public AnioBisiesto(int anio) {
        this.anio = anio;
    }

    public boolean confirmaBisiesto(int anio){

        GregorianCalendar esbisiesto = new GregorianCalendar();//metodo que provee funcion para revisar el anio

        boolean confirma;

        if (esbisiesto.isLeapYear(anio)){           //github.com/luisbenitez02/date_java
            confirma = true;//es bisiesto
        }else{
            confirma = false;//no es bisiesto
        }

        return confirma;
    }

}
