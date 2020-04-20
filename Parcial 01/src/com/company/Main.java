package com.company;

public class Main {

    public static void main(String[] args) {

        ServicioProfesional sProfesional = new ServicioProfesional("Eduardo", "Servicio General", 300.00, 14);
        PlazaFija pFija = new PlazaFija("Marta", "Gerente", 550.67, 25006578);

        System.out.println("\nPara empleado de Servicio Profesional");
        System.out.println("El salario de empleado es de: $" + CalculadoraImpuestos.calcularPago(sProfesional));
        System.out.println(CalculadoraImpuestos.mostrarTotales());

        System.out.println("\nPara empleado de Plaza Fija");
        System.out.println("El salario de empleado es de: $" + CalculadoraImpuestos.calcularPago(pFija));
        System.out.println(CalculadoraImpuestos.mostrarTotales());
    }
}
