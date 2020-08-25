package introducciónProgramacion;

import java.util.Scanner;

public class claseArreglos {

    public static void main(String[] args) {

        //variables
        int n;
        float acum;
        boolean avisoMenos10;

        Scanner entrada = new Scanner(System.in);

        //inicializar variables
        acum = 0;
        float prom = 0;
        avisoMenos10=false;
        

        //Entrada
        do {
            System.out.println("Ingrese la cantidad de temperaturas a procesar");
            n = entrada.nextInt();
        } while (n <= 0);
        float temp[] = new float[n];
        
        //proceso
        
        for (int i = 0; i < temp.length; i++) {
            System.out.println("Ingrese la temperatura " + (i + 1) + " en °C");
            temp[i] = entrada.nextFloat();
            acum = acum + temp[i];
            if (temp[i]<=-10){
                avisoMenos10=true;
            }

        }
        prom = (acum / n);
        
        //ordenar los valores de temp y luego mostrar
        

        //salida
        System.out.println("La temperatura promedio es de: " + prom + " °C");
        if(avisoMenos10==true){
            System.out.println("Al menos una Temperatura registró -10°C");
        }
    }

}
