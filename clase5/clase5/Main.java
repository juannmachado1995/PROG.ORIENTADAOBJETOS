package com.digitalhouse.poo.clase5;

public class Main {
    public static void main(String[] args) {
        //instanciamos un objeto de tipo Cliente
        Cliente cliente1 = new Cliente("Luciana", 0001);

        //llamamos a los metodos de los que dispone todo objeto de tipo Cliente
        cliente1.incrementarDeuda(1000.);
        cliente1.pagarDeuda();

    }
}
