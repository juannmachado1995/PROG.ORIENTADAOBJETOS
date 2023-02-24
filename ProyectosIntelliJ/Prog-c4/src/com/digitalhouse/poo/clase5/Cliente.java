package com.digitalhouse.poo.clase5;

public class Cliente {

    //CLASE "CLIENTE" // ATRIBUTOS (SIEMPRE PRIVADOS)
    private Integer numeroCliente;
    private String nombre;
    private Double deuda;



    //CONSTRUCTORES


    public Cliente() {
    }

    public Cliente(String nombreCliente , Integer numeroCliente){
        nombre = nombreCliente;
        this.numeroCliente = numeroCliente;
        deuda = 0.;
    };
    //CONSTRUCTOR CON ATAJO (ALT+INSERT)


    public Cliente(Integer numeroCliente, String nombre, Double deuda) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.deuda = deuda;
    }

    //GETTERS (Metodos) trae (retorna variable) Y SETTERS setea algo(asigna valor a la variable )
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }



    //METODOS PROPIOS DE CLASE
    public void incrementarDeuda (Double monto){
         deuda += monto;
         System.out.println("El valor actual de su deuda es: " + deuda);
    }
    public void pagarDeuda (){
        deuda = 0.;
        System.out.println("Su deuda ah sido cancelada");
    }

}

