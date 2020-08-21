package introducciónProgramacion;


import java.util.*;

public class ejercicio01 {

    public static void main(String[] args) {

        int segundos;
        int minutos;
        int hora;
        Scanner entrada = new Scanner(System.in);

        System.out.println("INTRODUCE LOS SEGUNDOS TRANSCURRIDOS");
        int dato = entrada.nextInt();
        hora = dato / 3600;
        minutos = (dato % 3600) / 60;
        segundos = ((dato % 3600) % 60);

        //otra opción vieja:
        /*
        hora = dato / 3600;
        minutos = (dato - hora * 3600) / 60;
        segundos = (dato - hora * 3600 - minutos * 60);*/
        
        
        System.out.println("Han transcurrido:\n" + hora + " horas, " + minutos + "minutos, " + segundos + "segundos");
    }

}
