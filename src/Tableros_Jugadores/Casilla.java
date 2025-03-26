package Tableros_Jugadores;

public class Casilla {
    private boolean barco;
    private boolean tapada;
    private boolean tocado;


    public Casilla(boolean barco, boolean tapada) {
        this.barco = barco;
        this.tapada = tapada;
    }

    public boolean isBarco() {
        return barco;
    }

    public void setBarco(boolean barco) {
        this.barco = barco;
    }

    public boolean isTapada() {
        return tapada;
    }

    public void setTapada(boolean tapada) {
        this.tapada = tapada;
    }

    public boolean isTocado() {
        return tocado;
    }

    public void setTocado(boolean tocado) {
        this.tocado = tocado;
    }

}
