package Barcos;

public class Destructor extends Barco {
    int longitud = 2;

    public Destructor(int[] inicio, int[] direccion) {
        super(inicio, direccion);
    }
    public int getLongitud() {
        return longitud;
    }
}
