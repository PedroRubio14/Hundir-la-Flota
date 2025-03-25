package Barcos;

import Tableros_Jugadores.Tablero;

public abstract class Barco {
    private int[] inicio;
    private int[] direccion;
    private int longitud;


    public Barco(int[] inicio, int[] direccion) {
        this.inicio = inicio;
        this.direccion = direccion;
    }

    public int[] getInicio() {
        return inicio;
    }

    public void setInicio(int[] inicio) {
        this.inicio = inicio;
    }

    public int[] getDireccion() {
        return direccion;
    }

    public void setDireccion(int[] direccion) {
        this.direccion = direccion;
    }
    public int getLongitud() {
        return longitud;
    }
}
