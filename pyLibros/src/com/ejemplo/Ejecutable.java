package com.ejemplo;

import com.ejemplo.dominio.Biblioteca;
import com.ejemplo.dominio.Libro;
import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //para cadenas
        Scanner entrada2 = new Scanner(System.in); //para otra cosa

        int cant;

        do {
            System.out.println("Ingrese la cantidad de libros de la biblioteca");
            cant = entrada2.nextInt();
        } while (cant <= 0);
        Biblioteca miBiblioteca = new Biblioteca(cant);
        Libro libro1, libro2;

        libro1 = new Libro(); //sin parametros, con valores creados por defecto

        //libro creado con valores por teclado:
        System.out.println("Ingrese ISBN del libro: ");
        String isbn = entrada.nextLine();
        System.out.println("Ingrese Titulo del libro: ");
        String titulo = entrada.nextLine();
        System.out.println("Ingrese Autor del libro: ");
        String autor = entrada.nextLine();
        System.out.println("Ingrese la cantidad de páginas del libro: ");
        int numeroPaginas = entrada2.nextInt();

        libro2 = new Libro(isbn, autor, titulo, numeroPaginas);
        if (miBiblioteca.agregarLibro(libro1) == true) {
            System.out.println("Libro agregado ! ");
        } else {
            System.out.println("No se puedo agregar el libro ! ");
        }

        miBiblioteca.agregarLibro(libro2);

        String listado=miBiblioteca.mostrarListado();
            System.out.println(listado);

//        //resultados:
//        System.out.println("Libro 1: " + libro1.toString());
//        System.out.println("Libro 2: " + libro2.toString());
//        if (libro1.getNumeroPaginas() < libro2.getNumeroPaginas()) {
//            System.out.println("El libro 2, tiene mayor cantidad de páginas "
//                    + "que el libro 1, con una totalidad de " + libro2.getNumeroPaginas()
//                    + " paginas");
//
//        } else if (libro1.getNumeroPaginas() > libro2.getNumeroPaginas()) {
//            System.out.println("El libro 1, tiene mayor cantidad de páginas "
//                    + "que el libro 2, con una totalidad de " + libro1.getNumeroPaginas()
//                    + " paginas");
//
//        } else {
//            System.out.println("Ambos libros tienen la misma cantidad de páginas: "
//                    + libro1.getNumeroPaginas());
//
//        }
    }

}
