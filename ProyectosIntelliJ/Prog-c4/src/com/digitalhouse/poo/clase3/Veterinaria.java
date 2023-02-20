package com.digitalhouse.poo.clase3;
import java.util.Scanner;
public class Veterinaria {

    public static void cantidadPaquetes(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese nombre perrito: ");
        String nombrePerrito = scan.nextLine();
        System.out.println("Ingrese cantidad de alimento x kg: ");
        double cantidadAlimento = scan.nextDouble();

        while(cantidadAlimento < 3){
            System.out.println(nombrePerrito + " necesita comer minimo 3kg diarios");
            cantidadAlimento = scan.nextDouble();
        }

        int cantPaquetes = 0;
        double kilosTotales = 0;

        while (cantidadAlimento > kilosTotales){
            System.out.println("Ingrese el peso del paquete: ");
            kilosTotales += scan.nextDouble();
            cantPaquetes++;
        }

        System.out.println("Para alimentar a " + nombrePerrito + " Se necesitan: " + cantPaquetes + " paquetes de alimentos");

    }

    public static void main(String[] args) {

        cantidadPaquetes();

    }
}
