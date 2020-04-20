package com.company;
import java.lang.Exception;

class ExcepcionNegative extends Exception {
    public ExcepcionNegative() {
        super("No se permiten numeros negativos.");
    }
}
