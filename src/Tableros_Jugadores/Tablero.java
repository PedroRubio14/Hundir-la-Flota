package Tableros_Jugadores;

import Barcos.*;
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
        for(int i = 0; i < t.tableroJuego.length; i++){
            for(int j = 0; j < t.tableroJuego[i].length; j++){
                t.tableroJuego[i][j] = new Casilla(false , false);
            }
        }
        crear_barcos(t);
    }

    private void crear_barcos(Tablero t){
        Barco[] barcos = new Barco[5];
        barcos[0] = new Acorazado();
        barcos[1] = new Destructor();
        barcos[2] = new Fragata();
        barcos[3]= new Portaviones();
        barcos[4]= new Submarino();

        for(int i = 0; i < barcos.length;i++){
            posiciones_barcos(barcos[i], t);
        }
    }

    public boolean sePotColocar(int[] inicio, int[] desplazamiento, int longitud) {
        int fila = inicio[0];
        int columna = inicio[1];

        for (int i = 0; i < longitud; i++) {
            if (fila < 0 || fila >= filas || columna < 0 || columna >= columnas) {
                return false;
            }

            if (tableroJuego[fila][columna].isBarco()) {
                return false;
            }
            fila += desplazamiento[0];
            columna += desplazamiento[1];
        }

        return true;
    }


    public void poner_barocs(int[] inicio, int[] desplazamiento, Barco b, Tablero t){

        int longitud = b.getLongitud();

        for( int i = 0; i<longitud; i++){
            t.tableroJuego[inicio[0]][inicio[1]].setBarco(true);




            inicio[0] += desplazamiento[0];
            inicio[1] += desplazamiento[1];

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



    public static void posiciones_barcos(Barco b,Tablero t){

        boolean barcocolocado = false;

        while (!barcocolocado) {
            int [] inicio = new int[2];
            inicio[0] = (int) (Math.random() * t.getFilas());
            inicio[1] = (int) (Math.random() * t.getColumnas());

            int diereccion = (int) (Math.random() * 4);

            int[] desplazamiento = new int[2];
            desplazamiento[0] = Tablero.desplazamientos[diereccion][0];
            desplazamiento[1] = Tablero.desplazamientos[diereccion][1];

            if (t.sePotColocar(inicio, desplazamiento, b.getLongitud())) {

                t.poner_barocs(inicio, desplazamiento, b, t);
                barcocolocado = true;


            }
        }

    }

}
