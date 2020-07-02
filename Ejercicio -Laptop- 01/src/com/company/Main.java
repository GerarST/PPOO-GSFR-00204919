package com.company;

public class Main {

    public static void main(String[] args) {

        Laptop unaLaptop = new Laptop ("HP","098s87x355");
        Bebida unaBebida = new Bebida ();

        unaLaptop.encenderL();
        unaBebida.bebiendo(true);
        unaLaptop.apagarL();
        unaBebida.consumiendo(true);
    }
}
