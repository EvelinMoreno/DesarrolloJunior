package org.example.controladores;

import org.example.interfaces.Metodos;

import java.util.Scanner;

public class Alojamiento {

    private String idEmpleado;
    private String tipoAlojamiento;
    private double valorAlojamiento;
    private int nochesAlojamiento;
    private String fechaInicioAlojamiento;
    private String fechaFinalAlojamiento;

    public Alojamiento() {
    }

    public String getTipoAlojamiento() {

        return tipoAlojamiento;
    }

    public void setTipoAlojamiento(String tipoAlojamiento) {
        this.tipoAlojamiento = tipoAlojamiento;
    }

    public double getValorAlojamiento() {
        return valorAlojamiento;
    }

    public void setValorAlojamiento(double valorAlojamiento) {
        if (valorAlojamiento < 0) {
            System.out.println("Ingrese un valor de alojamiento valido");
        }else {
            this.valorAlojamiento = valorAlojamiento;
        }
    }

    public int getNochesAlojamiento() {
        return nochesAlojamiento;
    }

    public void setNochesAlojamiento(int nochesAlojamiento) {
        if (nochesAlojamiento<0){
            System.out.println("Ingrese un numero de noches valido");
        } else{
            this.nochesAlojamiento = nochesAlojamiento;
        }
    }

    public String getFechaInicioAlojamiento() {
        return fechaInicioAlojamiento;
    }

    public void setFechaInicioAlojamiento(String fechaInicioAlojamiento) {
        this.fechaInicioAlojamiento = fechaInicioAlojamiento;
    }

    public String getFechaFinal() {
        return fechaFinalAlojamiento;
    }

    public void setFechaFinalAlojamiento(String fechaFinalAlojamiento) {
        this.fechaFinalAlojamiento = fechaFinalAlojamiento;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getFechaFinalAlojamiento() {
        return fechaFinalAlojamiento;
    }

    public void agregarAlojamiento(){
        Scanner read=new Scanner (System.in);
        System.out.println("*****DATOS DE ALOJAMINTO*****");
        System.out.println("Ingrese el tipo de alojamiento: ");
        this.setTipoAlojamiento(read.next());
        System.out.println("Ingrese fecha de inicio de alojamiento: ");
        this.setFechaInicioAlojamiento(read.next());
        System.out.println("Ingrese fecha de salida de alojamiento: ");
        this.setFechaFinalAlojamiento(read.next());
        System.out.println("Ingrese numero de noches de alojamiento:");
        this.setNochesAlojamiento(read.nextInt());
        System.out.println("Ingrese el valor del alojamiento: ");
        this.setValorAlojamiento(read.nextDouble());


    }
}
