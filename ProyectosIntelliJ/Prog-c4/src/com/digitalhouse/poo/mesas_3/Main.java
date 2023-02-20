package com.digitalhouse.poo.mesas_3;
import java.util.Scanner;
public class Main {

    public static int piedraPapelTijera (String jugada1 , String jugada2){
        if (jugada1.equals(jugada2)) {
            return 0;
        }
        else if (
                (jugada1.equals("tijera") && jugada2.equals("piedra")) ||
                        (jugada1.equals("piedra")&& jugada2.equals("papel")) ||
                        (jugada1.equals("papel")&& jugada2.equals("tijera"))
        ){
                return 2;
        }
        else return 1;

    }

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Ingrese jugada 1:");
    String jugada1 = scan.nextLine();

    System.out.println("Ingrese jugada 2:");
    String jugada2 = scan.nextLine();

    int ganador = piedraPapelTijera(jugada1,jugada2);

    if (ganador == 1){
        System.out.println("Gano el jugador 1");}
        else if (ganador == 2){
            System.out.println("Gano el jugador 2");}
        else System.out.println("Empate");
        }

}
