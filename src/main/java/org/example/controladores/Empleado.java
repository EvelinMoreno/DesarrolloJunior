package org.example.controladores;

import org.example.interfaces.Metodos;

import java.util.Scanner;



public class Empleado {

    private String id;
    private String nombre;
    private String apellido;
    private int edad;
    private String cargo;
    private double salario;


    public Empleado() {
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) { if (edad<18){
        System.out.println("Ingrese una edad valida");
    }
    else if (edad>110) {
        System.out.println("Edad invalida");
    }
        else {
        this.edad = edad;
    }

    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if (cargo.equals("senior")) {
            this.cargo = cargo;
        } else if (cargo.equals("junior")) {
            this.cargo = cargo;
        }else {
            System.out.println("Cargo invalido");
        }

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0 ) {
            System.out.println("Ingresa una cantidad de salario valida");
        }else{
            this.salario = salario;
        }

    }


    public void agregarEmpleado(){
        Scanner read=new Scanner(System.in);

        System.out.println("****AGREGANDO EMPLEADO*****");
        System.out.println("Ingrese identificacion: ");
        this.setId(read.next());
        System.out.println("Ingrese nombre del empleado: ");
        this.setNombre(read.next());
        System.out.println("Ingrese el apellido del empleado: ");
        this.setApellido(read.next());
        System.out.println("Ingrese la edad del empleado: ");
        this.setEdad(read.nextInt());
        System.out.println("Ingrese el cargo del empleadò: ");
        this.setCargo(read.next());
        System.out.println("Ingrese el salario del empleado: ");
        this.setSalario(read.nextDouble());
    }
    public double bonoViajes(){
        double bonoViaje=0;
        if (this.cargo.equals("junior") && vuelo.getTipoVuelo().equals("nacional")){
             bonoViaje = this.salario*0.20;
        }else if (this.cargo.equals("junior") && vuelo.getTipoVuelo().equals("internacional")){
             bonoViaje = this.salario*0.40;
        }else if (this.cargo.equals("senior") && vuelo.getTipoVuelo().equals("nacional")){
            bonoViaje = this.salario*0.30;
        }else if (this.cargo.equals("senior") && vuelo.getTipoVuelo().equals("internacional")){
            bonoViaje = this.salario*0.50;
        }else{
            System.out.println("Error de digitacion de cargo o tipo de vuelo");
        }
        return bonoViaje;
    }

    public double calcularCostosTotales(){
        double costos=vuelo.getValorVuelo()+alimentacion.getValorComidas()+alojamiento.getValorAlojamiento()
                +transporte.getCostoTrasporte();
        return costos;
    }


}
