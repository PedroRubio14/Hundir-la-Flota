package Barcos;

import Tableros_Jugadores.Casilla;

public class PiezasBarco {
    private Casilla pieza;
    private int[] posicion = new int[2];


    public int[] getPosicion() {
        return posicion;
    }

    public void setPosicion(int[] posicion) {
        this.posicion = posicion;
    }
}
