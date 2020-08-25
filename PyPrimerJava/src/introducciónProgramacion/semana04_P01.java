package introducciónProgramacion;

import javax.swing.JOptionPane;

public class semana04_P01 {

    public static void main(String[] args) {

        //variables:
        int num[] = new int[99];
        int acumNeg, acumPos;
        int contNeg, contPos;
        float mediaP, mediaN;

        //declaración de variables:
        acumNeg = acumPos = 0;
        contNeg = contPos = 0;

        //entrada:
        JOptionPane.showMessageDialog(null, "pulsa en aceptar para generar los números aleatorios");
        //proceso:

        for (int i = 0; i < 99; i++) {

            num[i] =  (int) (Math.random() * 100);

            if (num[i] > 0) {
                acumPos = acumPos + num[i];
                contPos = contPos + 1;

            } else if (num[i] < 0) {
                acumNeg = acumNeg + num[i];
                contNeg = contNeg + 1;
            }

        }
        mediaP = (acumPos / contPos);
        //mediaN = (acumNeg / contNeg);

        //salida:
        System.out.println("La cantidad de numeros positivos aleatorios es: " + contPos + " y su media: " + mediaP);

        //System.out.println("La cantidad de numeros negativos aleatorios es: " + contNeg + " y su media: " + );
    }

}
