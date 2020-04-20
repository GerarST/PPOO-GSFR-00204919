package com.company;

public class PlazaFija extends Empleado{

    private int extension = 0;

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

    public PlazaFija(String Nombre, String Puesto, double Salario, int Extension){
        this.nombre = Nombre;
        this.puesto = Puesto;
        this.salario = Salario;
        this.extension = Extension;
    }
}
