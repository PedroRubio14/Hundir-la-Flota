package Tableros_Jugadores;
import java.util.Random;
import Barcos.Barco;

public class Ordenador {


    public static void posiciones_barcos(Barco b,Tablero t){

        Barco[] barcos = new Barco[5];

        int [] inicio = new int[2];
        inicio[0] = (int) (Math.random() * 11);
        inicio[1] = (int) (Math.random() * 11);

        int diereccion = (int) (Math.random() * 3);

        int[] desplazamiento = new int[2];
        desplazamiento[0] = Tablero.desplazamientos[diereccion][0];
        desplazamiento[1] = Tablero.desplazamientos[diereccion][1];

        if(t.sePotColocar(inicio, desplazamiento,b.getLongitud())){

            t.poner_barocs(inicio, desplazamiento,b.getLongitud(), t );
            b.setDireccion(desplazamiento);
            b.setInicio(inicio);

        }



    }
}
