package introducciónProgramacion;


import java.util.*;

public class clubNautico {

    public static void main(String[] args) {

        //declarar variables:
        Scanner entrada = new Scanner(System.in);
        Scanner lectorCadena = new Scanner(System.in);

        int n, tipo; //tipo:1 velero, :2 lancha
        String nombre, nombreMayor;
        float monto, montoMayor;
        float acumVelero, acumLancha, cuotaPromedio;
        boolean primerVelero = false;

        acumVelero = acumLancha = 0;
        nombreMayor = "";
        montoMayor = 0;

        //Leer datos entrada:
        do {
            System.out.println("Ingrese la cantidad de embarcaciones a procesar");
            n = entrada.nextInt();
        } while (n <= 0);

        //procesar datos:
        for (int i = 0; i < n; i++) {

            //leerdatos de cada embarcacion:
            System.out.println("ingrese el nombre de la embarcación");
            nombre = lectorCadena.nextLine();
            do {
                System.out.println("ingrese el tipo de embarcación 1:velero 2:lancha");
                tipo = entrada.nextInt();
                if (tipo < 1 || tipo > 2);
                System.out.println("Valor incorrecto! Ingrese nuevamente 1 o 2");
            } while (tipo < 1 || tipo > 2);

            System.out.println("Ingrese monto mensual de cuota");
            monto = entrada.nextFloat();

            if (tipo == 1) {
                acumVelero = acumVelero + monto; //acumVelero+=monto;
                if (primerVelero == false) {
                    nombreMayor = nombre;
                    montoMayor = monto;
                    primerVelero = true;

                } else if (monto > montoMayor) {
                    nombreMayor = nombre;
                    montoMayor = monto;

                }

            } else {
                acumLancha += monto;

            }

        }
        //mostrar resultados:
        cuotaPromedio = (acumVelero + acumLancha) / n;

        System.out.println("Total anual recaudado por veleros:" + (acumVelero * 12));
        System.out.println("Total anual recudado por lanchas" + (acumLancha * 12));
        if (primerVelero == true) {

            System.out.println("El nombre del velero con la mayor cuota es:" + nombreMayor);
            System.out.println("De $:" + montoMayor);

        }
        System.out.println("La cuota mensual promedio es de:" + cuotaPromedio + "pesos");
    }

}
