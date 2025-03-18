public class Tablero {
    private int filas;
    private int columnas;
    public Casilla[][] tableroJuego;
    private static final int[][] desplazamientos = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};

    public Tablero(int filas, int columnas){
        this.filas = filas;
        this.columnas = columnas;
        tableroJuego = new Casilla[columnas][filas];

    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public Casilla[][] getTableroJuego() {
        return tableroJuego;
    }

    public void setTableroJuego(Casilla[][] tableroJuego) {
        this.tableroJuego = tableroJuego;
    }
}
