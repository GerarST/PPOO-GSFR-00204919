package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Autor unAutor = new Autor("","",'0');
        Libro unLibro = new Libro("",0);
        ArrayList<Autor> Autores = new ArrayList<>();
        ArrayList<Libro> Libros = new ArrayList<>();

        int Opcion = 0;
        String nombre = "";
        String email = "";
        int Paginas = 0;

        char genero;
            do {
                System.out.println("1. Agregar autor.");
                System.out.println("2. Quitar autor.");
                System.out.println("3. Mostrar autores.");
                System.out.println("4. Agregar libro.");
                System.out.println("5. Quitar libro.");
                System.out.println("6. Mostrar libros.");
                System.out.println("0. Salir.");
                System.out.println("Su opcion: ");
                Opcion = in.nextInt();
                in.nextLine();
                switch (Opcion) {
                    case 1:
                        System.out.println("Dijite el nombre del autor: ");
                        nombre = in.nextLine();
                        System.out.println("Dijite el email del autor: ");
                        email = in.nextLine();
                        System.out.println("Dijite el genero del autor: ");
                        genero = in.next().charAt(0);
                        in.nextLine();
                        Autores.add(new Autor(nombre, email, genero));
                        System.out.println("El autor ha sido añadido exitosamente!");
                        break;
                    case 2:
                        System.out.println("Ingrese el nombre del autor a eliminar: ");
                        nombre = in.nextLine();

                        for (Autor e : Autores) {
                            if (nombre.equals(e.getNombre()))
                                unAutor = e;
                        }
                        Autores.remove(unAutor);
                        System.out.println("El autor ha sido removido exitosamente!");
                        break;
                    case 3:
                        for (Autor e : Autores) {
                            System.out.println(e);
                        }
                        break;
                    case 4:
                        System.out.println("Dijite el nombre del libro: ");
                        nombre = in.nextLine();
                        System.out.println("Dijite la cantidad de paginas del libro: ");
                        Paginas = in.nextInt();
                        in.nextLine();
                        Libros.add(new Libro(nombre,Paginas));
                        System.out.println("El libro ha sido añadido exitosamente!");
                        break;
                    case 5:
                        System.out.println("Ingrese el nombre del libro a eliminar: ");
                        nombre = in.nextLine();

                        for (Libro e : Libros) {
                            if (nombre.equals(e.getNombre()))
                                unLibro = e;
                        }
                        Libros.remove(unLibro);
                        System.out.println("El libro ha sido removido exitosamente!");
                        break;
                    case 6:
                        for (Libro e : Libros) {
                            System.out.println(e);
                        }
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        break;
                }
            }while(Opcion != 0);

    }
}
