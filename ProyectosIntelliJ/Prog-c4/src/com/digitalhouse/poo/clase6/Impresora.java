package com.digitalhouse.poo.clase6;


public class Impresora {

    //ATRIBUTOS

    private String tipoConexion;
    private String modelo;
    private int cantidadHojasDisponibles;
    private String fechaFabricacion;

    private boolean tieneTinta;
    private boolean estaEncendida;

    //CONSTRUCTOR

    public Impresora(String tipoConexion, String modelo, int cantidadHojasDisponibles, String fechaFabricacion) {
        this.tipoConexion = tipoConexion;
        this.modelo = modelo;
        this.cantidadHojasDisponibles = cantidadHojasDisponibles;
        this.fechaFabricacion = fechaFabricacion;
        tieneTinta = false;
        estaEncendida = false;
    }


    //GETTERS Y SETTERS = Los vamos a escribir recien cuando los necesitemos.

    public void setEstaEncendida(boolean estaEncendida) {
        this.estaEncendida = estaEncendida;
    }

    public void setTieneTinta(boolean tieneTinta) {
        this.tieneTinta = tieneTinta;
    }
//METODOS PROPIOS

    public boolean tienePapel(){
        if (cantidadHojasDisponibles > 0 ) return true;
        return false;
    }

    public void imprimir (String texto){
        String impresoraTieneTinta = tieneTinta ? "Si" : "No"; //Operador Ternario
        if (estaEncendida) {
            if (tienePapel() && tieneTinta) {
                System.out.println(texto);
            }
            else {
                System.out.println("No se puede imprimir");
                System.out.println("Tinta: " + impresoraTieneTinta + "\n" + " Cantidad de Hojas: " + cantidadHojasDisponibles);
            }
        }
        else {
            System.out.println("La impresora esta apagada");
        }
    }

}

