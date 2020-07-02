package com.company;

public final class  GeneradorISBN{

    private static int contador = 0;

    public GeneradorISBN() {
    }

    public static int nuevoISBN(){
        return contador + 1;
    }

}
