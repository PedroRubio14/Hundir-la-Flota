package Juego;
import Barcos.*;
import Tableros_Jugadores.Tablero;
import Tableros_Jugadores.Casilla;

public class Juego {

    public void partida(){
        Tablero t = new Tablero(12,12);
        crearBarcos(t);
        t.mostrarTablero();


    }

    public void Turno(Tablero t){
        int filas = Textos.llegirInt();
        int col = Textos.llegirInt();
        t.Disparar(filas, col);


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
