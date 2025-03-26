package Juego;

import Tableros_Jugadores.Casilla;

import java.util.Scanner;

public class Textos {

        static Scanner sc = new Scanner(System.in);

        public static int llegirInt (){
            return sc.nextInt();
        }

        public static String llegirString() {
            return sc.nextLine();
        }



        public enum Codigo {
            ESPACIO,
            PARTIDA_FINALIZADA,
            CASILLA,
            TOCADO,
            HUNDIDO,

        }
        public static void imprimir (Codigo codigo, Object...args){
            switch (codigo){
                case PARTIDA_FINALIZADA:
                    System.out.print("La partida ha finalizado");
                    break;

                case CASILLA:
                    if(args[0] instanceof Casilla c){

                        if(!c.isTocado()){
                            System.out.printf("[ %s ]" , "\uD83D\uDFE6");
                        } else if(c.tiene_barco()){
                            System.out.printf("[ %s ]" , "\uD83D\uDEF3\uFE0F");
                        } else {
                            System.out.printf("[ %s ]" , "\uD83C\uDF0A");
                        }

                    }
                    break;

                    case ESPACIO:
                    System.out.println();
                    break;

                case TOCADO:
                    System.out.println("TOCADO" + "\uD83D\uDCA5");
                    break;
                case HUNDIDO:
                    System.out.println("HUNDIDO" + "\uD83D\uDCA5"+"\uD83D\uDCA5"+"\uD83D\uDCA5");
                    break;



            }
        }
}

