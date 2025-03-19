package Tableros_Jugadores;
import java.util.Random;
import Barcos.Barco;

public class Ordenador extends Tablero {
    public Ordenador() {
        super();
    }


    public void colocar_barcos(Barco b){
        int [] inicio = new int[2];
        inicio[0] = (int) (Math.random() * 11);
        inicio[1] = (int) (Math.random() * 11);

        int diereccion = (int) (Math.random() * 3);

        int[] desplazamiento = new int[2];
        desplazamiento[0] = Tablero.desplazamientos[diereccion][0];
        desplazamiento[0] = Tablero.desplazamientos[diereccion][1];

        b.setDireccion(desplazamiento);
        b.setInicio(inicio);



    }
    public void lanzar_bomba(){

    }
}
