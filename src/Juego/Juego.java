package Juego;
import Tableros_Jugadores.Ordenador;
import Tableros_Jugadores.Tablero;

public class Juego {

    public void partida(){
        Tablero t = new Tablero();
        t.iniciarTablero(t);
        t.mostrarTablero();

    }


}
