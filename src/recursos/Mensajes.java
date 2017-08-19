package recursos;

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
public class Mensajes {                 //github.com/luisbenitez02/date_java

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

    public void msjfechaValida(){           //github.com/luisbenitez02/date_java
        System.out.println("-------------- Fecha Valida ---------------");
        System.out.print("Ingresa fecha Formato: (dd/MM/yyyy) -->");
    }

    public void msjAgregarDias(){           //github.com/luisbenitez02/date_java
        System.out.println("-------------- Agregar Dias ---------------");
        System.out.print("Ingresa fecha Formato: (dd/MM/yyyy) -->");
    }

}

