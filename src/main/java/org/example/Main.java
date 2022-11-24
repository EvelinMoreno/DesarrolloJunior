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


        ArrayList<Empleado> empleados = new ArrayList<Empleado>();

        int seleccion = 0;

        System.out.println("0. Salir del menu");
        System.out.println("1. Alimentacion");
        System.out.println("2. Alojamiento");
        System.out.println("3. Empleado");
        System.out.println("4. Trasporte");
        System.out.println("5. Vuelos");
        System.out.println("6. Mostrar Empleados");

        do {
            System.out.println(" Ingrese opción del menu: ");
            seleccion = read.nextInt();

            switch(seleccion){
                case 1:
                    objetoAlimentacion.agregarComidas();

                case 2:

                    objetoAlojamiento.agregarAlojamiento();

                    break;
                case 3:

                    objetoTransporte.agregarTransporte();

                    break;
                case 4:

                    objetoVuelos.agregarVuelo();

                    break;
                case 5:

                    Empleado objetoEmpleado = new Empleado();
                    objetoEmpleado.agregarEmpleado();
                    empleados.add(objetoEmpleado);
                    break;
                case 6:

                    for (Empleado empleado:empleados) {
                        System.out.println(empleado.getNombre()+empleado.getApellido()+empleado.getCargo()
                                +empleado.getSalario());
                    }

                    break;
                default:
                    System.out.println("Selecciona una opción valida");

            }

        }
        while (seleccion != 0);


    }
}