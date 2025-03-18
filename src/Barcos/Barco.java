package Barcos;

public class Barco {
    private int inicio;
    private int[] direccion;


    public Barco(int inicio, int[] direccion) {
        this.inicio = inicio;
        this.direccion = direccion;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int[] getDireccion() {
        return direccion;
    }

    public void setDireccion(int[] direccion) {
        this.direccion = direccion;
    }
}
