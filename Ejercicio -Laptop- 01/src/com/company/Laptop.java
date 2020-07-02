package com.company;

public class Laptop {

    private String marca;
    private String modelo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Laptop(){
    }

    public Laptop(String marcaL, String modeloL){
        marca = marcaL;
        modelo = modeloL;
    }

    public void encenderL(){
        System.out.println("La laptop se esta encendiendo...");
    }

    public void apagarL(){
        System.out.println("La laptop se esta apagando...");
    }

}
