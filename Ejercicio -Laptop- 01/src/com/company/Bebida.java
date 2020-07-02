package com.company;

public class Bebida {

    private Boolean bebiendo;
    private Boolean consumiendo;

    public Boolean getBebiendo() {
        return bebiendo;
    }

    public void setBebiendo(Boolean bebiendo) {
        this.bebiendo = bebiendo;
    }

    public Boolean getConsumiendo() {
        return consumiendo;
    }

    public void setConsumiendo(Boolean consumiendo) {
        this.consumiendo = consumiendo;
    }

    public Bebida(){
    }

    public Bebida(Boolean bebiendoB, Boolean consumiendoB){
        bebiendo = bebiendoB;
        consumiendo = consumiendoB;
    }

    public void bebiendo(Boolean Bebiendo){
        if (Bebiendo)
            System.out.println("La bebida se esta bebiendo...");
    }

    public void consumiendo(Boolean Consumiendo){
        if (Consumiendo)
            System.out.println("La bebida se esta consumiendo...");
    }

}
