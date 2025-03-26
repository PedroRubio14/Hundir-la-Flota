package Tableros_Jugadores;

import Barcos.Barco;

public class Casilla {
    private int fila;
    private int columna;
    private boolean tocado;
    private Barco barco;


    public Casilla(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.tocado = false;
        this.barco = null;
    }


    public boolean isTocado() {
        return tocado;
    }

    public void setTocado() {
        this.tocado = true;
        if(barco != null){
            barco.tocado();
        }

    }
    public boolean tiene_barco(){
        if(barco != null){
            return true;
        }
        return false;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
}
