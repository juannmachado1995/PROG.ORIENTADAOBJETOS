package com.digitalhouse.poo.clase2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        String nombre = scan.nextLine();

        System.out.println("Ingresa tu apellido");
        String apellido = scan.nextLine();

        String inicialN = String.valueOf(nombre.charAt(0));
        String inicialA = String.valueOf(apellido.charAt(0));

        System.out.println("Ingresa tu dia de nacimiento");
        int dia = scan.nextInt();

        System.out.println("Ingresa tu mes de nacimineto");
        int mes = scan.nextInt();

        System.out.println("Ingresa tu anio de nacimiento");
        int anio = scan.nextInt();

        String fechaNac = dia + "/" + mes + "/" + anio;

        System.out.println("Nombre: " + nombre + " Apellido: " + apellido + "\n Iniciales:" + inicialN + inicialA + "\n Fecha de nacimiento: " + fechaNac);



}}

