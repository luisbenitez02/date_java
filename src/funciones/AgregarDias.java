package funciones;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
public class AgregarDias {
    private String fecha;
    private int dias;

    public AgregarDias(String fecha, int dias) {
        this.fecha = fecha;
        this.dias = dias;               //github.com/luisbenitez02/date_java
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
            datos[1] = calendar.getTime().toString();           //github.com/luisbenitez02/date_java

        } catch (ParseException e) {
            e.printStackTrace();            //github.com/luisbenitez02/date_java
        }
        return datos;
    }
}
