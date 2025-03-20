package Barcos;

public class Portaviones extends Barco{
    int longitud = 5;

    public Portaviones(int[] inicio, int[] direccion) {
        super(inicio, direccion);
    }
    public int getLongitud() {
        return longitud;
    }
}
