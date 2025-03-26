package Juego;
import Tableros_Jugadores.Tablero;
import Tableros_Jugadores.Casilla;

public class Juego {

    public void partida(){
        Tablero t = new Tablero();
        t.iniciarTablero(t);
        t.mostrarTablero();


    }

    public void Turno(Tablero t){
        Disparar(t);


    }

    public void Disparar(Tablero t){
        int fila = Textos.llegirInt();
        int columna = Textos.llegirInt();

        if(Tocado(fila, columna,t)){

        } else {

        }
        if(Hundido(fila,columna,t)){

        }
    }

    private boolean Tocado(int f, int c,Tablero t){
        if(t.tableroJuego[f][c].isBarco()){
            t.tableroJuego[f][c].setTocado(true);
            return true;
        }
        return false;

    }
    private boolean Hundido(int f, int c,Tablero t){
        return false;
    }


}
