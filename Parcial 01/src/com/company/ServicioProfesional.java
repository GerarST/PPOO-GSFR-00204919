package com.company;

public class ServicioProfesional extends Empleado {

    private int mesesContratado = 0;

    public int getMesesContratado() {
        return mesesContratado;
    }

    public void setMesesContratado(int mesesContratado){
        this.mesesContratado = mesesContratado;
    }

    public ServicioProfesional(String Nombre, String Puesto, double Salario, int mesesContratado){
        this.nombre = Nombre;
        this.puesto = Puesto;
        this.salario = Salario;
        this.mesesContratado = mesesContratado;
    }

}
