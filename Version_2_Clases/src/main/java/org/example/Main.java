package org.example;

import org.example.controladores.Empleado;
import org.example.controladores.Viaje;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        ArrayList<Viaje> viajes = new ArrayList<Viaje>();

        Empleado e1=new Empleado("1", "santiago","misas",28,"senior", 3000000 );

        Empleado e2=new Empleado("2", "santiago","gaviria",24,"junior", 3500000 );
        empleados.add(e1);
        empleados.add(e2);

        int seleccion = 0;
        int seleccionSubmenu=0;

        System.out.println("0. Salir del menu");
        System.out.println("1. Agregar Empleado");
        System.out.println("2. Agregar Viatico");
        System.out.println("3. Mostrar Empleados");
        System.out.println("4. Mostrar viajes de un empleado");
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
                    String idBuscado;
                    System.out.println("Ingrese el Id del empleado para agregar viaticos");
                    idBuscado=read.next();
                    Viaje viaje=new Viaje();
                    viaje.setIdEmpleado(idBuscado);
                    viaje.agregarViaje();
                    viajes.add(viaje);
                    boolean busqueda=false;
                    for (Empleado empleado1:empleados) {
                        if (empleado1.getId().equals(idBuscado)) {
                            busqueda=true;
                            if (empleado1.getCargo().equals("junior") && viaje.getTipoViaje().equals("nacional")) {
                                empleado1.setSalario(empleado1.getSalario()+(empleado1.getSalario()* 0.20));
                            } else if (empleado1.getCargo().equals("junior") && viaje.getTipoViaje().equals("internacional")) {
                                empleado1.setSalario(empleado1.getSalario()+(empleado1.getSalario()* 0.24));
                            } else if (empleado1.getCargo().equals("senior") && viaje.getTipoViaje().equals("nacional")) {
                                empleado1.setSalario(empleado1.getSalario()+(empleado1.getSalario()* 0.30));
                            } else if (empleado1.getCargo().equals("senior") && viaje.getTipoViaje().equals("internacional")) {
                                empleado1.setSalario(empleado1.getSalario()+(empleado1.getSalario()* 0.50));
                            } else {
                                System.out.println("Error de digitacion de cargo o tipo de vuelo");
                            }
                            break;
                        }

                    }
                    if(!busqueda){
                        System.out.println("El empleado no existe");
                    }

                    break;
                case 3:
                    for (Empleado empleado2:empleados) {

                        System.out.println(empleado2.toString());

                    }
                    break;
                case 4:
                    System.out.println("Ingrese el Id del empleado para agregar viaticos");
                    idBuscado=read.next();
                    for (Viaje viaje1:viajes) {
                        if (viaje1.getIdEmpleado().equals(idBuscado)) {
                            System.out.println(viaje1.toString());
                        }


                    }
                    break;
                default:
                    System.out.println("Selecciona una opción valida");

            }

        }
        while (seleccion != 0);
    }

    }
