package introducciónProgramacion;


import java.io.*;

public class Practica04 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double gasto;
		int km;
		int kml;
		double lts;
		double pr;
		// entrada:
		System.out.println("Ingrese Km recorridos: ");
		km = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese relación KM por litro: ");
		kml = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese el precio del combustible por litro: ");
		pr = Double.parseDouble(bufEntrada.readLine());
		// Proceso 
		lts = km/kml;
		gasto = lts*pr;
		// salida
		System.out.println("El total de litros consumidos: "+lts);
		System.out.println("Gasto total en pesos: "+gasto);
	}


}

