package funciones;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
public class ConfirmarFecha {
    private String fecha;

    public ConfirmarFecha(String fecha) {
        this.fecha = fecha;
    }           //github.com/luisbenitez02/date_java

    public boolean revisarFecha(String fecha) {
        boolean result = true;

        try {           //github.com/luisbenitez02/date_java
            //------------------- https://www.youtube.com/watch?v=9jVF9Ci9HSc&t=328s
            Date formato_largo = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);//devuelve formato largo de fecha
            //la anterior linea es 'inteligente' y si agregas por ejemplo 40/02/1998 va a devolver: 11/03/1998

            String fechaOut = new SimpleDateFormat("dd/MM/yyyy").format(formato_largo);//convierte el foramto largo al simple

           /* System.out.println("El ingreso: " + fecha);
            System.out.println("El formato: " + formato_largo);
            System.out.println("La salida : " + fechaOut);*/

            if(fecha.equals(fechaOut)){//si la fecha de entrada y la de salida son iguales:

            } else{
                return false;
            }

        } catch (ParseException e) {//si no podemos hacer parseo (la fecha no se ingresa en el formato dd/MM/yyyy)
            //e.printStackTrace();
            result=false;
        }
                        //github.com/luisbenitez02/date_java
        return result;
    }
}
