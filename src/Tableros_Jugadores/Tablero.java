package Tableros_Jugadores;

import Juego.Textos;

public class Tablero {
    private final int filas = 12;
    private final int columnas = 12;
    public Casilla[][] tableroJuego;
    static final int[][] desplazamientos = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};

    public Tablero(){
        tableroJuego = new Casilla[columnas][filas];

    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public Casilla[][] getTableroJuego() {
        return tableroJuego;
    }

    public void setTableroJuego(Casilla[][] tableroJuego) {
        this.tableroJuego = tableroJuego;
    }

    public void iniciarTablero(Tablero t){
        t.getTableroJuego();
        for(int i = 0; i < t.tableroJuego.length; i++){
            for(int j = 0; j < t.tableroJuego[i].length; j++){
                t.tableroJuego[i][j] = new Casilla(false, true);
            }
        }

    }

    public boolean sePotColocar(int[] inicio, int[] desplazamiento, int longitud){
       for(int i = 0; i < longitud;i++){
           if(inicio[0] < 0 || inicio[0] > filas ||
              inicio[1] < 0|| inicio[1] > columnas   ){
               return false;
           }

           if(inicio[0]+desplazamiento[0] < 0 || inicio[0]+desplazamiento[0]  > filas ||
                   inicio[1]+desplazamiento[1]  < 0|| inicio[1]+desplazamiento[1]  > columnas ) {
               return false;
           }
           inicio[1]+=desplazamiento[1];
           inicio[0]+=desplazamiento[0];
       }
       return true;
    }

    public void poner_barocs(int[] inicio, int[] desplazamiento, int longitud, Tablero t){
        Casilla[][] tablero = t.getTableroJuego();

        for(int i = 0; i < longitud;i++){
            tablero[inicio[0]][inicio[1]].setBarco(true);
            inicio[1]+=desplazamiento[1];
            inicio[0]+=desplazamiento[0];
        }
    }

    public void mostrarTablero(){
        for(int i = 0; i < tableroJuego.length; i++){
            for(int j = 0; j < tableroJuego[i].length; j++){
                if(j%columnas == 0){
                    Textos.imprimir(Textos.Codigo.ESPACIO);
                } else {
                    Textos.imprimir(Textos.Codigo.CASILLA, tableroJuego[i][j]);
                }
            }
        }
    }
}
