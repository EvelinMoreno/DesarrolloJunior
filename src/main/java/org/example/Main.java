package org.example;

import org.example.controladores.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Alimentacion objetoAlimentacion = new Alimentacion();
        Alojamiento objetoAlojamiento = new Alojamiento();
        Transporte objetoTransporte = new Transporte();
        Vuelos objetoVuelos = new Vuelos();
        Empleado objetoEmpleado = new Empleado();

        ArrayList<Empleado> empleados = new ArrayList<Empleado>();

        int seleccion = 0;

        System.out.println("0. Salir del menu");
        System.out.println("1. Alimentacion");
        System.out.println("2. Alojamiento");
        System.out.println("3. Transporte");
        System.out.println("4. Vuelos");
        System.out.println("5. Empleado");
        System.out.println("6. Mostrar Empleados");

        do {
            System.out.println(" Ingrese opción del menu");
            seleccion = read.nextInt();

            switch(seleccion){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                default:
                    System.out.println("Selecciona una opción valida");

            }

        }
        while (seleccion != 0);


    }}