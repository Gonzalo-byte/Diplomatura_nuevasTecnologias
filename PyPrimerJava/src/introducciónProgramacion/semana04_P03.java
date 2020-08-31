package introducciónProgramacion;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class semana04_P03 {

    public static void main(String[] args) {

        //variables    
        float tiempo[] = new float[5];
        float tiempos;
        float acumTiempo;
        float prom;
        int abandonos;
        float tiempoMay;
        float tiempoMen;

        //declaracion:
        abandonos = 0;
        acumTiempo = 0;
        tiempoMay = 0;
        tiempoMen = 5000;
        Scanner entrada = new Scanner(System.in);

        //proceso:
        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Introduce el tiempo N° " + (i + 1) + " en minutos");
                tiempos = entrada.nextFloat();

            } while (tiempos < 0);

            tiempo[i] = tiempos;
            acumTiempo += tiempo[i];

            if (tiempo[i] == 0) {
                abandonos += 1;

            } else if (tiempo[i] > tiempoMay) {
                tiempoMay = tiempo[i];

            }
            if (tiempo[i] < tiempoMen) {
                tiempo[i] = tiempoMen;

            }

        }
        prom = acumTiempo / 5;
        //Arrays.sort(tiempo);

        System.out.println("El tiempo promedio de carrera es de: " + prom + "  minutos\nLa cantidad de bandonos fue de: " + abandonos + "\nEl tiempo ganador fue de: " + tiempoMen + "  minutos");
        System.out.println("La totalidad de los tiempos fue:");
        System.out.println(Arrays.toString(tiempo));
        //salida:
    }

}
