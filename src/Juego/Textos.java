package Juego;

import Tableros_Jugadores.Casilla;

import java.util.Scanner;

public class Textos {

        static Scanner sc = new Scanner(System.in);



        public static int llegirInt () {
            return sc.nextInt();
        }


        public static void llegirString () {
            sc.nextLine();
        }



        public enum Codigo {
            ESPACIO,
            PARTIDA_FINALIZADA,
            CASILLA,
            TOCADO,
            YATOCADO,
            HUNDIDO,
            AGUA,
            ELECCION,
            ELECCION1,
            GANADOR,
            NUMERO,
            EX1,
            EX2,

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
                case AGUA:
                    System.out.println("AGUA");
                    break;
                case ELECCION:
                    System.out.println();
                    System.out.print("FILA: ");
                    break;
                case ELECCION1:
                    System.out.println();
                    System.out.print("COLUMNA: ");
                    break;
                case YATOCADO:
                    System.out.println("ESTA CASILLA YA HABIA SIDO ATACADA");
                    break;
                case GANADOR:
                    System.out.println("HA GANADO ");
                    System.out.println("FINAL DE LA PARTIDA ");
                    break;
                case NUMERO:
                    if(args[0] instanceof Integer n) {
                        System.out.printf("[ %1d ]",n);
                    }
                    break;
                case EX1:
                    System.out.println("INTRODUCE UN NUMERO VALIDO");
                    break;
                case EX2:
                    System.out.println("NUMERO FUERA DE RANGO");
                    break;

            }
        }
}

