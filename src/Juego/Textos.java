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

        }
        public static void imprimir (Codigo codigo, Object...args){
            switch (codigo){
                case PARTIDA_FINALIZADA:
                    System.out.print("La partida ha finalizado");
                    break;

                case CASILLA:
                    if(args[0] instanceof Casilla c){

                        if(c.isTapada()){
                            System.out.printf("[ %s ]" , "\uD83D\uDFE6");
                        } else if(c.isBarco()){
                            System.out.printf("[ %s ]" , "\uD83D\uDEF3\uFE0F");
                        } else {
                            System.out.printf("[ %s ]" , "+"/*"\uD83C\uDF0A"*/);
                        }

                    }
                    break;

                    case ESPACIO:
                    System.out.println();
                    break;


            }
        }
}

