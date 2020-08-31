package com.ejemplo.dominio;

/**
 *
 * @author Usuario
 */
public class Libro {

    //atributos:
    private String isbn;
    private String autor;
    private String titulo;
    private int numeroPaginas;

    //constructores:
    public Libro() {
        isbn = " sin ISBN";
        autor = " Desconocido";
        titulo = " Desconocido";
        numeroPaginas = 0;

    }

    public Libro(String isbn, String autor, String titulo, int numeroPaginas) {
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.numeroPaginas = validarPaginas(numeroPaginas);
    }

    //métodos accesores:
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = validarPaginas(numeroPaginas);

    }

    //comportamientos propios:
    @Override
    public String toString() { //permite devolver la representación del objeto como una cadena
        String aux = "El libro con ISBN " + isbn + ", creado por el autor: "
                + autor + " tiene: " + numeroPaginas + " paginas.";
        return aux;

    }

    private int validarPaginas(int numeroPaginas) {
//        int aux = 1;
//        if (numeroPaginas >= 1) {
//            aux = numeroPaginas;
//
//        }
        return (numeroPaginas > 0) ? numeroPaginas : 1;

    }

}
