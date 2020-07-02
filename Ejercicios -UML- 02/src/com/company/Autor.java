package com.company;

public class Autor {

    private String nombre;
    private String email;
    private char genero;

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", genero=" + genero +
                '}';
    }

    public Autor(String Nombre, String Email, char Genero){
        nombre = Nombre;
        email = Email;
        genero = Genero;
    }



}
