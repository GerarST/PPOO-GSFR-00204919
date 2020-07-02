package com.company;

public class Libro {

    private int isbn;
    private String nombre;
    private int paginas;

    public int getISBN() {
        return isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN='" + isbn + '\'' +
                ", nombre='" + nombre + '\'' +
                ", paginas=" + paginas +
                '}';
    }

    public Libro(String Nombre, int Paginas){
        nombre = Nombre;
        paginas = Paginas;
        isbn = GeneradorISBN.nuevoISBN();
    }


}
