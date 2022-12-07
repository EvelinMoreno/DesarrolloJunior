package org.example.controladores;

import org.example.interfaces.Metodos;

import java.util.Scanner;

public class Alimentacion{

    private String idEmpleado;
    private String fechaDeComida;
    private int cantidadComidas;
    private double valorComidas;




    public Alimentacion() {
    }

    public String getFechaDeComida() {
        return fechaDeComida;
    }

    public void setFechaDeComida(String fechaDeComida) {
        this.fechaDeComida = fechaDeComida;
    }

    public int getCantidadComidas() {
        return cantidadComidas;
    }

    public void setCantidadComidas(int cantidadComidas) {
        if (cantidadComidas < 0) {
            System.out.println("ingrese un numero valido de comidas");
        }else {
            this.cantidadComidas = cantidadComidas;
        }

    }

    public double getValorComidas() {
        return valorComidas;
    }

    public void setValorComidas(double valorComidas) {
        if (valorComidas <=0) {
            System.out.println("ingrese un valor de comidas valido");
        }else {
            this.valorComidas = valorComidas;
        }
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void agregarComidas(){
        Scanner read= new Scanner(System.in);
        System.out.println("*****DATOS DE ALIMENTACION*****");
        System.out.println("Ingrese la fecha de comida: ");
        this.setFechaDeComida(read.next());
        System.out.println("Ingrese la cantidad de comidas: ");
        this.setCantidadComidas(read.nextInt());
        System.out.println("Ingrese el valor de las comidas: ");
        this.setValorComidas(read.nextDouble());

    }
}
