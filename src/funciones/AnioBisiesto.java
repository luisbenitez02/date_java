package funciones;

import java.util.GregorianCalendar;

/**
 * Created by luisb on 17/08/2017.
 */
public class AnioBisiesto {
    private int anio;

    public AnioBisiesto(int anio) {
        this.anio = anio;
    }

    public boolean confirmaBisiesto(int anio){

        GregorianCalendar esbisiesto = new GregorianCalendar();//metodo que provee funcion para revisar el anio

        boolean confirma;

        if (esbisiesto.isLeapYear(anio)){
            confirma = true;//es bisiesto
        }else{
            confirma = false;//no es bisiesto
        }

        return confirma;
    }

}
