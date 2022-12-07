package org.example.controladores;

import java.util.Scanner;

public class Viaje {

    private String idEmpleado;
    private String tipoViaje;
    private String fechaDeSalida;
    private String fechaDeLlegada;
    private double valorVuelo;
    private String destino;
    private String origen;
    private double costoAlimentacion;
    private double costoTransporte;
    private double costoAlojamiento;

    public Viaje() {
    }

    public Viaje(String idEmpleado, String tipoViaje, String fechaDeSalida, String fechaDeLlegada, double valorVuelo, String destino, String origen, double costoAlimentacion, double costoTransporte, double costoAlojamiento) {
        this.idEmpleado = idEmpleado;
        this.tipoViaje = tipoViaje;
        this.fechaDeSalida = fechaDeSalida;
        this.fechaDeLlegada = fechaDeLlegada;
        this.valorVuelo = valorVuelo;
        this.destino = destino;
        this.origen = origen;
        this.costoAlimentacion = costoAlimentacion;
        this.costoTransporte = costoTransporte;
        this.costoAlojamiento = costoAlojamiento;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    public String getFechaDeSalida() {
        return fechaDeSalida;
    }

    public void setFechaDeSalida(String fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
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
        this.valorVuelo = valorVuelo;
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

    public double getCostoAlimentacion() {
        return costoAlimentacion;
    }

    public void setCostoAlimentacion(double costoAlimentacion) {
        this.costoAlimentacion = costoAlimentacion;
    }

    public double getCostoTransporte() {
        return costoTransporte;
    }

    public void setCostoTransporte(double costoTransporte) {
        this.costoTransporte = costoTransporte;
    }

    public double getCostoAlojamiento() {
        return costoAlojamiento;
    }

    public void setCostoAlojamiento(double costoAlojamiento) {
        this.costoAlojamiento = costoAlojamiento;
    }

    public void agregarViaje(){
        Scanner read= new Scanner(System.in);

        System.out.println("*****DATOS DEL VUELO*****");
        System.out.println("Ingrese el tipo de vuelo: ");
        this.setTipoViaje(read.next());
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
        System.out.println("Ingrese el valor del alimentacion: ");
        this.setCostoAlimentacion(read.nextDouble());
        System.out.println("Ingrese el valor del alojamiento: ");
        this.setCostoAlojamiento(read.nextDouble());
        System.out.println("Ingrese el valor del transporte: ");
        this.setCostoTransporte(read.nextDouble());
    }

    @Override
    public String toString() {
        return "Viaje{" +
                "idEmpleado='" + idEmpleado + '\'' +
                ", tipoViaje='" + tipoViaje + '\'' +
                ", fechaDeSalida='" + fechaDeSalida + '\'' +
                ", fechaDeLlegada='" + fechaDeLlegada + '\'' +
                ", valorVuelo=" + valorVuelo +
                ", destino='" + destino + '\'' +
                ", origen='" + origen + '\'' +
                ", costoAlimentacion=" + costoAlimentacion +
                ", costoTransporte=" + costoTransporte +
                ", costoAlojamiento=" + costoAlojamiento +
                '}';
    }
}
