package com.company;

public final class CalculadoraImpuestos {

    private static double totalRenta = 0;
    private static double totalAFP = 0;
    private static double totalISSS = 0;

    private CalculadoraImpuestos(){
    }

    public static double calcularPago(Empleado empleado){
        if(empleado instanceof PlazaFija) {

                totalAFP = 0.0625 * empleado.salario;
                totalISSS = 0.03 * empleado.salario;
                double Restante = empleado.salario - totalAFP - totalISSS;
                double X = Restante;

                    if (X > 0.01 && X < 472.00) {
                        totalRenta = 0;
                        empleado.salario = X;
                    } else if (X > 472.01 && X < 895.24) {
                        totalRenta = 0.1 * (X - 472) + 17.67;
                        empleado.salario = X - totalRenta;
                    } else if (X > 895.25 && X < 2038.10) {
                        totalRenta = 0.2 * (X - 895.24) + 60;
                        empleado.salario = X - totalRenta;
                    } else if (X > 2038.11) {
                        totalRenta = 0.3 * (X - 2038.10) + 288.57;
                        empleado.salario = X - totalRenta;
                    }
                    }

        else if(empleado instanceof ServicioProfesional){
            totalRenta = 0.1*empleado.salario;
            empleado.salario -= totalRenta;
        }
        double SalarioR = RedondeoDecimales.redondearDecimales(empleado.salario, 2);
        return SalarioR;
    }

    public static String mostrarTotales(){
        String Descuentos = "";
        double AFPR, ISSSR, RR;
        AFPR = RedondeoDecimales.redondearDecimales(totalAFP, 2);
        ISSSR = RedondeoDecimales.redondearDecimales(totalISSS, 2);
        RR = RedondeoDecimales.redondearDecimales(totalRenta, 2);
        Descuentos = "El descuento total de AFP es: $" + AFPR
                    +"\nEl descuento total de ISSS es: $" + ISSSR
                    +"\nEl descuento total de Renta es: $" + RR;
        return Descuentos;
    }
}
