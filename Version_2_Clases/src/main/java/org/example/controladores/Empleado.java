package org.example.controladores;

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

    public Empleado(String id, String nombre, String apellido, int edad, String cargo, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cargo = cargo;
        this.salario = salario;
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

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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

    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}

