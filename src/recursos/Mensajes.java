package recursos;

/**
 * Created by luisb on 17/08/2017.
 */
public class Mensajes {

    public void msjBienvenida(){
        System.out.println("-------------- Bienvenido ----------------------");
        System.out.println("-------------- Selecciona una opcion:");
        System.out.println("-------------- 1. Comprobar año bisiesto");
        System.out.println("-------------- 2. Comprobar validez de fecha");
        System.out.println("-------------- 3. Agregar dias a una fecha");
    }

    public void msjAnioBisiesto(){
        System.out.println("-------------- Año Bisiesto o no ---------------");
        System.out.print("Ingresa el año a comprobar -->");
    }

    public void msjfechaValida(){
        System.out.println("-------------- Fecha Valida ---------------");
        System.out.print("Ingresa fecha Formato: (dd/MM/yyyy) -->");
    }

    public void msjAgregarDias(){
        System.out.println("-------------- Agregar Dias ---------------");
        System.out.print("Ingresa fecha Formato: (dd/MM/yyyy) -->");
    }

}

