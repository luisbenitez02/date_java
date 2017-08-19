package funciones;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by luisb on 19/08/2017.
 */
public class AgregarDias {
    private String fecha;
    private int dias;

    public AgregarDias(String fecha, int dias) {
        this.fecha = fecha;
        this.dias = dias;
    }

    public String[] sumarDias(String fecha, int dias){
        String[] datos = new String[2];
        try {
            Date formato_largo = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(formato_largo);

            datos[0] = calendar.getTime().toString();

            //aniadimos los dias
            calendar.add(Calendar.DAY_OF_YEAR,dias);
            datos[1] = calendar.getTime().toString();

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return datos;
    }
}
