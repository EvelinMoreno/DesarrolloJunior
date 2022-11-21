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
                    System.out.println("Ingrese la fecha de comida");
                    objetoAlimentacion.setFechaDeComida(read.next());
                    System.out.println("Ingrese la cantidad de comidas");
                    objetoAlimentacion.setCantidadComidas(read.nextInt());
                    System.out.println("Ingrese el valor de las comidas");
                    objetoAlimentacion.setValorComidas(read.nextDouble());
                    break;
                case 2:

                    System.out.println("Ingrese el tipo de alojamiento");
                    objetoAlojamiento.setTipoAlojamiento(read.next());
                    System.out.println("Ingrese fecha de inicio de alojamiento: ");
                    objetoAlojamiento.setFechaInicio(read.next());
                    System.out.println("Ingrese fecha de salida de alojamiento:");
                    objetoAlojamiento.setFechaFinal(read.next());
                    System.out.println("Ingrese numero de noches de alojamiento:");
                    objetoAlojamiento.setNochesAlojamiento(read.nextInt());
                    System.out.println("Ingrese el valor del alojamiento: ");
                    objetoAlojamiento.setValorAlojamiento(read.nextDouble());

                    break;
                case 3:
                    System.out.println("Ingrese identificacion");
                    System.out.println("Ingrese nombre del empleado");
                    System.out.println("Ingrese el apellido del empleado");
                    System.out.println("Ingrese la edad del empleado");
                    System.out.println("Ingrese el cargo del empleadò");
                    System.out.println("Ingrese el salario del empleado");
                    break;
                case 4:
                    System.out.println("Ingrese el tipo de transporte");
                    System.out.println("Ingrese la fecha de inicio del transporte");
                    System.out.println("Ingrese la fecha final del transporte");
                    System.out.println("Ingrese el costo del transporte");
                    break;
                case 5:
                    System.out.println("Ingrese el tipo de vuelo");
                    System.out.println("Ingrese el origen del vuelo");
                    System.out.println("Ingrese el destino del vuelo");
                    System.out.println("Ingrese la fecha de salida del vuelo");
                    System.out.println("Ingrese la fecha de llegada del vuelo");
                    System.out.println("Ingrese el valor del vuelo");
                    break;
                case 6:
                    System.out.println("");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Selecciona una opción valida");

            }

        }
        while (seleccion != 0);


    }}