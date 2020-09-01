package com.ejemplo.dominio;

/**
 *
 * @author Usuario
 */
public class Biblioteca {

    private final Libro[] estantería;

    public Biblioteca() {
        estantería = new Libro[20];
    }

    public Biblioteca(int cant) {
        estantería = new Libro[cant];
    }

    public Libro[] getEstantería() {
        return estantería;
    }

    public boolean agregarLibro(Libro unLibro) {
        boolean aux = false;
        for (int i = 0; i < estantería.length; i++) {
            if (estantería[i] == null) {
                estantería[i] = unLibro;
                aux = true;
                break;
            }

        }
        return aux; //informa si efectivamente se pudo agregar el Libro

    }

    public String mostrarListado() {
        String aux = "Estantería:\n";

        for (int i = 0; i < estantería.length; i++) {
            if (estantería != null) {
                aux += estantería[i].getTitulo() + "\t|";

            } else {
                aux = aux + "Lugar vacío\t|";
            }

        }
        return aux;
    }
}
