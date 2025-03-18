import java.util.Scanner;

public class Textos {

        static Scanner sc = new Scanner(System.in);

        public static int llegirInt (){
            return sc.nextInt();
        }

        public static String llegirString() {
            return sc.nextLine();
        }

        public static final String RESET = "\033[0m";
        public static final String GRIS = "\033[37m";
        public static final String ROJO = "\033[31m";
        public static final String AZUL = "\033[34m";

        public static final String[] COLORES_BOMBAS = {
                "\033[37m", // Gris
                "\033[34m", // Azul
                "\033[32m", // Verde
                "\033[31m", // Rojo
                "\033[35m", // Magenta
                "\033[36m", // Cian
                "\033[33m", // Amarillo
                "\033[91m", // Rojo claro
                "\033[94m", // Azul claro
        };


        public enum Codigo {
            ESPACIO,
            PARTIDA_FINALIZADA,
            CASILLA_TAPADA,

        }
        public static void imprimir (Codigo codigo, Object...args){
            switch (codigo){
                case PARTIDA_FINALIZADA:
                    System.out.print("La partida ha finalizado");
                    break;

                case CASILLA_TAPADA:
                    System.out.printf("[ %s ]" ,GRIS + "⬜" + RESET);
                    break;

                case ESPACIO:
                    System.out.println();
                    break;


            }
        }
}

