package introducciónProgramacion;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class semana04_P02 {

    public static void main(String[] args) {

        //variables:
        int dado1[];
        int dado2[];
        int n;
        boolean bandera;
        bandera = false;
        int contIgual = 0;
        int impar = 0;
        float porcentaje;

        Scanner entrada = new Scanner(System.in);

        //entrada:
        System.out.println("Ingrese la cantidad de veces que quiere tirar los dados");
        n = entrada.nextInt();
        dado1 = new int[n];
        dado2 = new int[n];

        //proceso:
        for (int i = 0; i < n; i++) {

            dado1[i] = (int) (Math.random() * 100);
            dado2[i] = (int) (Math.random() * 100);

            if (dado1[i] == dado2[i]) {

                contIgual = contIgual + 1;
            } else if (bandera == false) {
                if (((dado1[i] + dado2[i]) % 2) != 0) {
                    bandera = true;
                    impar = (i + 1);

                }

            }
            System.out.println("El lanzamiento n° " + (i + 1) + "  de dados arrojaron:\n" + dado1[i] + "\n" + dado2[i]);

        }

        porcentaje = (contIgual / n) * 100;

        //salida:
        System.out.println("La cantidad de veces que ambos dados coincidieron fue: " + contIgual + " y representa el:" + porcentaje + " %");
        System.out.println("La primera vez que la suma de ambos dados fue impar fue en el tiro: " + impar);

    }

}
