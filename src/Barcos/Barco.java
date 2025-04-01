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

    public boolean tocado(){
        for(int i = 0; i<posiciones.size();i++){
            if(posiciones.get(i).isTocado()){
                return true;
            }
        }
        return false;
    }

    public boolean hundido(){
        for(int i = 0; i<posiciones.size();i++){
            if(!posiciones.get(i).isTocado()){
                return false;
            }
        }
        return true;
    }


    public int getLongitud() {
        return longitud;
    }

}
