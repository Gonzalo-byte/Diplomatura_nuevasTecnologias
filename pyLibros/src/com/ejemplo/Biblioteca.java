package com.ejemplo;

import com.ejemplo.dominio.Libro;
import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //para cadenas
        Scanner entrada2 = new Scanner(System.in); //para otra cosa
        int cant;

        do {
            System.out.println("Ingrese la cantidad de libros de la biblioteca");
            cant = entrada2.nextInt();
        } while (cant <= 0);

        //crear un arreglo que represente fisicamente el estante
        Libro estantería[] = new Libro[cant];
        for (int i = 0; i < estantería.length; i++) {
            //libro creado con valores por teclado:
            System.out.println("Ingrese ISBN del libro: ");
            String isbn = entrada.nextLine();
            System.out.println("Ingrese Titulo del libro: ");
            String titulo = entrada.nextLine();
            System.out.println("Ingrese Autor del libro: ");
            String autor = entrada.nextLine();
            System.out.println("Ingrese la cantidad de páginas del libro: ");
            int numeroPaginas = entrada2.nextInt();
            estantería[i] = new Libro(isbn, autor, titulo, numeroPaginas);
            //cada vuelta crea un nuevo objeto Libro
        }
        for (int i = 0; i < estantería.length; i++) {
            System.out.println("Libro " + (i + 1) + ": " + estantería[i].toString());

        }

    }

}
