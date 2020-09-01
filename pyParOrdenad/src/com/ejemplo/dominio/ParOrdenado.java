package com.ejemplo.dominio;

/**
 *
 * @author Usuario
 */
public class ParOrdenado {
    //atributos:

    private double coordenadaX;
    private double coordenadaY;

    //constructor: por defecto
    public ParOrdenado() {
        coordenadaX = 0;
        coordenadaY = 0;
    }

    public double getCordenadaX() {
        return coordenadaX;
    }

    public void setCordenadaX(double cordenadaX) {
        this.coordenadaX = cordenadaX;
    }

    public double getCordenadaY() {
        return coordenadaY;
    }

    public void setCordenadaY(double cordenadaY) {
        this.coordenadaY = cordenadaY;
    }

    //métodos:
    @Override
    public String toString() {
        return "El par ordenado ingresado es: ( " + coordenadaX + " ; " + coordenadaY + " )";

    }

    public String getCuadrante() {
        String cuadrante = "";

        if (coordenadaX > 0 && coordenadaY > 0) {
            cuadrante = "Primer cuadrante";

        } else if (coordenadaX > 0 && coordenadaY < 0) {
            cuadrante = "Cuarto cuadrante";

        } else if (coordenadaX < 0 && coordenadaY < 0) {
            cuadrante = "Tercer cuadrante";

        } else if (coordenadaX < 0 && coordenadaY > 0) {
            cuadrante = "Segundo cuadrante";

        } else {
            cuadrante = "Alguna de las coordenadas está sobre el origen";
        }

        return "El par se encuentra en el " + cuadrante;
    }

    public String getDistanciaOrigen() {
        double sumatorias;
        double raiz;
        sumatorias = Math.pow(coordenadaX, 2) + Math.pow(coordenadaY, 2);
        raiz = Math.sqrt(sumatorias);

        return "La distancia al Origen de coordendas es de: " + raiz;
    }

}
