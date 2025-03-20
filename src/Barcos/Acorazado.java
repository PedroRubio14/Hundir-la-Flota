package Barcos;

public class Acorazado extends Barco {
int longitud = 3;

    public Acorazado(int[] inicio, int[] direccion) {
        super(inicio, direccion);
    }

    public int getLongitud() {
        return longitud;
    }
}
