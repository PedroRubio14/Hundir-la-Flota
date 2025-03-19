package Tableros_Jugadores;

public class Tablero {
    private final int filas = 12;
    private final int columnas = 12;
    public Casilla[][] tableroJuego;
    static final int[][] desplazamientos = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};

    public Tablero(){
        tableroJuego = new Casilla[columnas][filas];

    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public Casilla[][] getTableroJuego() {
        return tableroJuego;
    }

    public void setTableroJuego(Casilla[][] tableroJuego) {
        this.tableroJuego = tableroJuego;
    }
}
