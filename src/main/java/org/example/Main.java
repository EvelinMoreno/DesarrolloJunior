package org.example;

import org.example.controladores.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);




        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        ArrayList<Alimentacion> alimentaciones = new ArrayList<Alimentacion>();
        ArrayList<Alojamiento> alojamientos = new ArrayList<Alojamiento>();
        ArrayList<Transporte> transportes = new ArrayList<Transporte>();
        ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();

        int seleccion = 0;
        int seleccionSubmenu=0;

        System.out.println("0. Salir del menu");
        System.out.println("1. Agregar Empleado");
        System.out.println("2. Agregar Viatico");
        System.out.println("3. Mostrar Empleados");

        do {
            System.out.println(" Ingrese opción del menu: ");
            seleccion = read.nextInt();

            switch(seleccion){
                case 0:
                    System.out.println("Has salido del sistema");
                    break;
                case 1:

                    Empleado empleado = new Empleado();
                    empleado.agregarEmpleado();
                    empleados.add(empleado);







                    break;
                case 2:
                    for (Empleado empleado:empleados) {

                        System.out.println("*******************************");
                        System.out.println("Nombre Empleado: "+ empleado.getNombre()+" "+empleado.getApellido());
                        System.out.println("Cargo: "+empleado.getCargo());
                        System.out.println("Salario: "+empleado.getSalario());
                        System.out.println("*******************************");
                    }
                    System.out.println("Ingrese la cedula del empleado que quieres añadirle el viatico");
                    String idempleado=read.next();

                    System.out.println("1. Ingresar costo de alojamiento");
                    System.out.println("2. Ingresar costo de alimentacion");
                    System.out.println("3. Ingresar costo de transporte");
                    System.out.println("4. Ingresar costo de vuelo");
                    System.out.println("5. Volver al meu principal");
                    seleccionSubmenu=read.nextInt();
                    //Menu para agregar viatico por tipo,
                    /* Arraylist del tipo de viatico, seleccionar */
                    while(seleccionSubmenu!=5){

                        switch (seleccionSubmenu){
                            case 1:
                                Alojamiento alojamiento = new Alojamiento();
                                alojamiento.agregarAlojamiento();
                                alojamientos.add(alojamiento);

                                break;

                            case 2:
                                Alimentacion alimentacion = new Alimentacion();
                                alimentacion.agregarComidas();
                                alimentaciones.add(alimentacion);
                                break;

                            case 3:
                                Transporte transporte = new Transporte();
                                transporte.agregarTransporte();
                                transportes.add(transporte);
                                break;

                            case 4:
                                Vuelo vuelo = new Vuelo();
                                vuelo.agregarVuelo();
                                vuelos.add(vuelo);
                                break;

                            case 5:
                                break;

                            default:
                                System.out.println("Seleccione una opcion valida para el menu");

                        }


                    }

                    break;

                case 3:
                    for (Empleado empleado:empleados) {

                        System.out.println("*******************************");
                        System.out.println("Nombre Empleado: "+ empleado.getNombre()+" "+empleado.getApellido());
                        System.out.println("Cargo: "+empleado.getCargo());
                        System.out.println("Salario: "+empleado.getSalario());
                        System.out.println("Bono de Viaticos: "+empleado.bonoViajes());
                        System.out.println("Tipo de Vuelo: "+vuelo.getTipoVuelo());
                        System.out.println("Gastos totales: "+empleado.calcularCostosTotales());
                        System.out.println("*******************************");
                    }

                    break;
                default:
                    System.out.println("Selecciona una opción valida");

            }

        }
        while (seleccion != 0);


    }
}