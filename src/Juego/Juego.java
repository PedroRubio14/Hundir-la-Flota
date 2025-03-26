package Juego;
import Barcos.*;
import Tableros_Jugadores.Tablero;

import java.util.InputMismatchException;


public class Juego {
    boolean partida_finalizada = false;

    public void partida(){
        Tablero t = new Tablero(12,12);
        crearBarcos(t);
        t.mostrarTablero();


        while (!partida_finalizada){
            Turno(t);

        }


    }

    public void Turno(Tablero t){
        int filas;
        int col;
        while (true) {
            try {
                Textos.imprimir(Textos.Codigo.ELECCION);
                filas = Textos.llegirInt();
                Textos.imprimir(Textos.Codigo.ELECCION1);
                col = Textos.llegirInt();

                t.Disparar(filas, col);
                t.mostrarTablero();


                if(t.ganador()){
                    Textos.imprimir(Textos.Codigo.GANADOR);
                    partida_finalizada = true;

                }
                break;
            } catch (InputMismatchException e) {
                Textos.imprimir(Textos.Codigo.EX1);
                Textos.llegirString();
            } catch (ArrayIndexOutOfBoundsException e){
                Textos.imprimir(Textos.Codigo.EX2);


            }
        }


    }

    public void crearBarcos(Tablero t){
        Barco acorazado = new Acorazado();
        Barco destructor = new Destructor();
        Barco fragata = new Fragata();
        Barco portaviones = new Portaviones();
        Barco submarino = new Submarino();

        t.posiciones_barcos(acorazado);
        t.posiciones_barcos(destructor);
        t.posiciones_barcos(fragata);
        t.posiciones_barcos(portaviones);
        t.posiciones_barcos(submarino);
    }






}
