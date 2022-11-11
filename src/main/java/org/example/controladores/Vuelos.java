package org.example.controladores;

public class Vuelos {

    private String tipoVuelo;
    private String fechaVuelo;
    private double valorVuelo;
    private String destino;
    private String origen;

    public Vuelos() {
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public String getFechaVuelo() {
        return fechaVuelo;
    }

    public void setFechaVuelo(String fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
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
}
