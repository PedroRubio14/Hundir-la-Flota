package Barcos;

import Tableros_Jugadores.Tablero;

public abstract class Barco {
    private PiezasBarco[] posiciones;
    private int longitud;


    public Barco() {

    }

    public PiezasBarco[] getPosiciones() {
        return posiciones;
    }

    public void setPosiciones(PiezasBarco[] posiciones) {
        this.posiciones = posiciones;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }
}
