package org.example.controladores;

import java.util.Scanner;

public class Vuelo {

    private String idEmpleado;
    private String tipoVuelo;

    private String fechaDeSalida;

    private String fechaDeLlegada;
    private double valorVuelo;
    private String destino;
    private String origen;

    public Vuelo() {
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {

        this.tipoVuelo = tipoVuelo;
    }

    public String getFechaDeSalida() {
        return fechaDeSalida;
    }

    public void setFechaDeSalida(String fechaVuelo) {
        this.fechaDeSalida = fechaVuelo;
    }

    public String getFechaDeLlegada() {
        return fechaDeLlegada;
    }

    public void setFechaDeLlegada(String fechaDeLlegada) {
        this.fechaDeLlegada = fechaDeLlegada;
    }

    public double getValorVuelo() {
        return valorVuelo;
    }

    public void setValorVuelo(double valorVuelo) {
        if (valorVuelo < 0) {
            System.out.println("ingrese un valor de vuelo valido");
        }else {
            this.valorVuelo = valorVuelo;
        }
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void agregarVuelo(){
        Scanner read= new Scanner(System.in);
        System.out.println("*****DATOS DEL VUELO*****");
        System.out.println("Ingrese el tipo de vuelo: ");
        this.setTipoVuelo(read.next());
        System.out.println("Ingrese el origen del vuelo: ");
        this.setOrigen(read.next());
        System.out.println("Ingrese el destino del vuelo: ");
        this.setDestino(read.next());
        System.out.println("Ingrese la fecha de salida del vuelo: ");
        this.setFechaDeSalida(read.next());
        System.out.println("Ingrese la fecha de llegada del vuelo: ");
        this.setFechaDeLlegada(read.next());
        System.out.println("Ingrese el valor del vuelo: ");
        this.setValorVuelo(read.nextDouble());
    }
}
