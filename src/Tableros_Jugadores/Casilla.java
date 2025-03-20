package Tableros_Jugadores;

public class Casilla {
    private boolean barco;
    private boolean tapada;

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
}
