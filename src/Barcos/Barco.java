package Barcos;


import Tableros_Jugadores.Casilla;

import java.util.ArrayList;

public abstract class Barco {
    private ArrayList<Casilla> posiciones;
    private int ataques;
    private int longitud;


    public Barco() {
    this.posiciones = new ArrayList<>();
    this.ataques = 0;
    }

    public void agregarPosicion(Casilla c) {
        posiciones.add(c);
    }

    public void tocado(){
        ataques++;
    }

    public boolean hundido(){
        return ataques >=posiciones.size();
    }


    public int getLongitud() {
        return longitud;
    }

}
