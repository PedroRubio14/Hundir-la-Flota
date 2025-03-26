package Barcos;


import Tableros_Jugadores.Casilla;

import java.util.ArrayList;

public abstract class Barco {
    private ArrayList<Casilla> posiciones;
    private int longitud;


    public Barco() {

    }

    public ArrayList<Casilla> getPosiciones() {
        return posiciones;
    }

    public void setPosiciones(ArrayList<Casilla> posiciones) {
        this.posiciones = posiciones;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }

}
