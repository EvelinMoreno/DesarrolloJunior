package org.example.controladores;

public class Transporte {

    private String tipoTransporte;
    private double costoTrasporte;
    private String fechaInicioTrasporte;
    private String fechaFinDeTrasporte;
    public Transporte() {
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public double getCostoTrasporte() {
        return costoTrasporte;
    }

    public void setCostoTrasporte(double costoTrasporte) {

        if (costoTrasporte < 0) {
            System.out.println("Ingrese un valor de transporte valido");
        }else {
            this.costoTrasporte = costoTrasporte;
        }
    }

    public String getFechaInicioTrasporte() {
        return fechaInicioTrasporte;
    }

    public void setFechaInicioTrasporte(String fechaInicioTrasporte) {
        this.fechaInicioTrasporte = fechaInicioTrasporte;
    }

    public String getFechaFinDeTrasporte() {
        return fechaFinDeTrasporte;
    }

    public void setFechaFinDeTrasporte(String fechaFinDeTrasporte) {
        this.fechaFinDeTrasporte = fechaFinDeTrasporte;
    }
}
