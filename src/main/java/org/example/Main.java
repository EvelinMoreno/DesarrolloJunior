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

            /*public Empleado(String id, String nombre, String apellido, int edad, String cargo, double salario) {
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.cargo = cargo;
            this.salario = salario;
        }
        */
        Empleado e1=new Empleado("1", "santiago","misas",28,"senior", 3000000 );

        Empleado e2=new Empleado("2", "jose","sosa",24,"junior", 3500000 );

        empleados.add(e1);
        empleados.add(e2);


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

                    Empleado trabajador = new Empleado();
                    trabajador.agregarEmpleado();
                    empleados.add(trabajador);


                    break;
                case 2:
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
                    while(seleccionSubmenu!=6){

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

                            case 5: // mostrar los viaticos del empleado aqui con un for each general
                                // y 4 for each que recorran busqueda de cada viatico

                            case 6:
                                break;

                            default:
                                System.out.println("Seleccione una opcion valida para el menu");

                        }


                    }

                    break;

                case 3:
                    for (Empleado trabajador2:empleados) {

                        System.out.println("*******************************");
                        System.out.println("Nombre Empleado: "+ trabajador2.getNombre()+" "+trabajador2.getApellido());
                        System.out.println("Cargo: "+trabajador2.getCargo());
                        System.out.println("Salario: "+trabajador2.getSalario());
                        //System.out.println("Bono de Viaticos: "+empleado.bonoViajes());
                        //System.out.println("Tipo de Vuelo: "+vuelo.getTipoVuelo());
                        //System.out.println("Gastos totales: "+empleado.calcularCostosTotales());
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