package Tableros_Jugadores;

import Barcos.*;
import Juego.Textos;

import java.util.ArrayList;

public class Tablero {
    public Casilla[][] tableroJuego;
    static final int[][] desplazamientos = {{0, 1}, {1, 0}};
    private ArrayList<Barco> barcos;

    public Tablero(int filas, int columnas){
        tableroJuego = new Casilla[filas][columnas];
        barcos = new ArrayList<>();

        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                tableroJuego[i][j] = new Casilla(i,j);
            }
        }

    }


    public boolean sePotColocar(int[] inicio, int[] desplazamiento, Barco b) {
        int fila = inicio[0];
        int columna = inicio[1];

        if(desplazamiento[0] == 0 && desplazamiento[1] == 1){
            if((columna + b.getLongitud())>tableroJuego[0].length){
                return false;
            }
        }
        if(desplazamiento[0]==1 && desplazamiento[1]== 0){
            if(fila + b.getLongitud()>tableroJuego.length){
                return false;
            }
        }

        for (int i = 0; i < b.getLongitud(); i++) {
            if (fila < 0 || fila >= tableroJuego.length || columna < 0 || columna >= tableroJuego[0].length) {
                return false;
            }

            if (tableroJuego[fila][columna].tiene_barco()) {
                return false;
            }

            fila += desplazamiento[0];
            columna += desplazamiento[1];


        }


        return true;
    }


    public void poner_baroc(int[] inicio, int[] desplazamiento, Barco b){

        int longitud = b.getLongitud();

        for( int i = 0; i<longitud; i++){
            Casilla Cb = tableroJuego[inicio[0]][inicio[1]];

            b.agregarPosicion(Cb);
            Cb.setBarco(b);


            inicio[0] += desplazamiento[0];
            inicio[1] += desplazamiento[1];

        }

        barcos.add(b);


    }

    public void mostrarTablero(){
        for(int j = 0; j < tableroJuego[0].length; j++){
            Textos.imprimir(Textos.Codigo.NUMERO, (Integer) j);
        }
        Textos.imprimir(Textos.Codigo.ESPACIO);
        for(int i = 0; i < tableroJuego.length; i++){
            for(int j = 0; j < tableroJuego[i].length; j++){
                if(j == tableroJuego[i].length -1){
                    Textos.imprimir(Textos.Codigo.CASILLA, tableroJuego[i][j]);
                    Textos.imprimir(Textos.Codigo.NUMERO, (Integer) i);
                    Textos.imprimir(Textos.Codigo.ESPACIO);
                } else {
                    Textos.imprimir(Textos.Codigo.CASILLA, tableroJuego[i][j]);
                }
            }
        }
    }



    public void posiciones_barcos(Barco b){

        boolean barcocolocado = false;

        while (!barcocolocado) {
            int [] inicio = new int[2];
            inicio[0] = (int) (Math.random() * tableroJuego.length );
            inicio[1] = (int) (Math.random() * tableroJuego[0].length);

            int diereccion = (int) (Math.random() * desplazamientos.length);

            int[] desplazamiento = new int[2];
            desplazamiento[0] = Tablero.desplazamientos[diereccion][0];
            desplazamiento[1] = Tablero.desplazamientos[diereccion][1];

            if (sePotColocar(inicio, desplazamiento, b)) {

                poner_baroc(inicio, desplazamiento, b);
                barcocolocado = true;


            }
        }

    }

    public void Disparar(int filas, int columnas){
        Casilla C_atc = tableroJuego[filas][columnas];

        if(C_atc.isTocado()){
            Textos.imprimir(Textos.Codigo.YATOCADO);
        } else {


            C_atc.setTocado();


            if (C_atc.tiene_barco()) {
                Textos.imprimir(Textos.Codigo.TOCADO);
            } else {
                // tiene agua
            }
            if (C_atc.getBarco() != null && C_atc.getBarco().hundido()) {
                Textos.imprimir(Textos.Codigo.HUNDIDO);
            }
        }

    }

    public boolean ganador(){
        for(int i = 0; i < barcos.size();i++){
            if(!barcos.get(i).hundido()){
                return false;
            }
        }
        return true;
    }


}
