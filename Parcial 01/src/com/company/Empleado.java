package com.company;

public class Empleado {

     protected String nombre = "";
     protected String puesto = "";
     protected double salario = 0;

     public String getNombre(){
         return nombre;
     }

     public String getPuesto(){
         return puesto;
     }

     public double getSalario(){
         return salario;
     }

     public void setSalario(double pSalario){
         this.salario = pSalario;
     }

    public void Empleado(String Nombre, String Puesto, double Salario){
         this.nombre = Nombre;
         this.puesto = Puesto;
         this.salario = Salario;
    }

}
