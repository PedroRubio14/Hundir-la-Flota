package Juego;
import Barcos.*;
import Tableros_Jugadores.Tablero;
import Tableros_Jugadores.Casilla;

public class Juego {

    public void partida(){
        Tablero t = new Tablero(12,12);
        crearBarcos(t);
        t.mostrarTablero();
        boolean partida_finalizada = false;

        while (!partida_finalizada){
            Turno(t);

        }


    }

    public void Turno(Tablero t){
        Textos.imprimir(Textos.Codigo.ELECCION);
        int filas = Textos.llegirInt();
        Textos.imprimir(Textos.Codigo.ELECCION1);
        int col = Textos.llegirInt();
        t.Disparar(filas, col);
        t.mostrarTablero();

        if(t.ganador()){
            Textos.imprimir(Textos.Codigo.GANADOR);
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
