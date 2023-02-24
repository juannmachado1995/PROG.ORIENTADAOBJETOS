package com.digitalhouse.poo.clase5;

public class Cliente {

    //Atributos
    private String nombre;
    private Double deuda;
    private Integer numeroCliente;


    //Constructor
    public Cliente(){
    }

    public Cliente(String nombreCliente, Integer numeroCliente){
        nombre = nombreCliente;
        this.numeroCliente = numeroCliente;
        deuda = 0.;
    }

    //atajo alt+insert
    public Cliente(String nombre, Double deuda, Integer numeroCliente) {
        this.nombre = nombre;
        this.deuda = deuda;
        this.numeroCliente = numeroCliente;
    }

    //Getters y Setters
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Double getDeuda() {
        return deuda;
    }

    public void setDeuda(Double deuda) {
        this.deuda = deuda;
    }

    public Integer getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(Integer numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    //Metodos propios
    public void incrementarDeuda(Double monto){
        deuda += monto;
        System.out.println("El valor actualizado de su deuda es: $" + deuda);
    }

    public void pagarDeuda(){
        deuda = 0.;
        System.out.println("Su deuda ha sido saldada");
    }

}

