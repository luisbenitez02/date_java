package recursos;

import funciones.AgregarDias;
import funciones.AnioBisiesto;
import funciones.ConfirmarFecha;
import sun.applet.Main;

import java.util.Scanner;

/**
 * Created by luisb on 17/08/2017.
 */
public class Auxiliar {

    private Mensajes msj = new Mensajes();//clase con mensajes en texto para las diferentes opciones

    public void iniciar(){
        Mensajes msj = new Mensajes();//clase que contiene nuestros mensajes
        Auxiliar aux = new Auxiliar();//clase que contiene lector de entradas

        msj.msjBienvenida();
        aux.leerMenu();
    }

    public void leerMenu(){
        Scanner lector = new Scanner(System.in);
        int op;

        System.out.print("--> ");

        op = lector.nextInt();

        switch (op){
            case 1:
                leerAnio();
                break;
            case 2:
                leerFecha();
                break;
            case 3:
                leerFechaDias();
                break;
            default:
                System.out.println("!Upps! Selecciona numeros entre 1 y 3");
                leerMenu();
        }
    }

    /*Vamos a capturar el anio que se desea evaluar y luego se lo pasamos a la funcion AnioBiciesto*/
    public void leerAnio(){
        msj.msjAnioBisiesto();
        int anio;

        Scanner lector = new Scanner(System.in);

        anio = lector.nextInt();

        AnioBisiesto execute = new AnioBisiesto(anio);

        if(execute.confirmaBisiesto(anio)){//si retorna verdadero
            System.out.println("!!!!!!----- El año ingresado SI es un año bisiesto----!!!!!!");
        } else{
            System.out.println("¡¡¡¡¡¡----- El año ingresado NO es un año bisiesto----¡¡¡¡¡¡");
        }

        regresar();
    }

    //Captura fecha para saber si es correcta
    public void leerFecha(){
        msj.msjfechaValida();

        String fecha;

        Scanner lector = new Scanner(System.in);

        fecha = lector.nextLine();

        ConfirmarFecha execute = new ConfirmarFecha(fecha);

        if (execute.revisarFecha(fecha)){
            System.out.println("!!!!!!----- La fecha ingresada SI es correcta----!!!!!!");
        }else{
            System.out.println("¡¡¡¡¡¡----- La fecha ingresada NO es valida ----¡¡¡¡¡¡");
            System.out.println("NOTA: Recuerda usar las diagonales (/)");
        }

        regresar();
    }

    /*Lee la fecha para saber si es correcta y luego agregar dias*/
    public void leerFechaDias(){
        msj.msjAgregarDias();

        String fecha;

        Scanner lector = new Scanner(System.in);

        fecha = lector.nextLine();

        ConfirmarFecha execute = new ConfirmarFecha(fecha);

        if (execute.revisarFecha(fecha)){//si la fecha esta en un formato correcto
            //ejecuto adicion de dias
            System.out.print("Dias a añadir --->");
            int dias=0;

            dias = lector.nextInt();

            AgregarDias add = new AgregarDias(fecha,dias);

            String[] retorno;

            retorno =  add.sumarDias(fecha,dias);

            System.out.println("Ingresaste: "+ retorno[0]);
            System.out.println("Añadiendo "+ dias + " dias: " + retorno[1]);

        }else{
            //si no es correcta repito metodo
            System.out.println("¡¡¡¡¡¡----- La fecha ingresada NO es valida ----¡¡¡¡¡¡");
            leerFechaDias();//repito metodo
        }

    }
    /*
    * Regresa al menu y muestra de nuevo la pantalla
    * */
    public void regresar(){

        System.out.println("------------ Ingresa 0 para vovler al menu, otro numero para terminar");
        int op;

        Scanner lector = new Scanner(System.in);

        op = lector.nextInt();

        if (op == 0){
            iniciar();
        } else{
            salir();
        }
    }

    public void salir(){
        System.exit(0);
    }


}
