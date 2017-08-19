package funciones;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by luisb on 18/08/2017.
 */
public class ConfirmarFecha {
    private String fecha;

    public ConfirmarFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean revisarFecha(String fecha) {
        boolean result = true;

        try {
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

        return result;
    }
}
