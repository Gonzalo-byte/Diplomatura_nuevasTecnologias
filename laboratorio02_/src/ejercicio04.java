
import java.util.*;

public class ejercicio04 {

    public static void main(String[] args) {

        int bil1000 = 0;
        int bil500 = 0;
        int bil200 = 0;
        int bil100 = 0;
        int monto = 1;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Ingrese Monto a Retirar");
            monto = entrada.nextInt();
        } while (monto % 100 != 0);

        bil1000 = monto / 1000;
        bil500 = (monto % 1000) / 500;
        bil200 = ((monto % 1000) % 500) / 200;
        bil100 = (((monto % 1000) % 500) % 200) / 100;

        System.out.println("El número de billetes a devolver es:\n" + bil1000 + "Billetes de $1000\n" + bil500 + "Billetes de $500\n"
                + +bil200 + "Billetes de $200\n" + bil100 + "Billetes de $100\n");

    }

}
