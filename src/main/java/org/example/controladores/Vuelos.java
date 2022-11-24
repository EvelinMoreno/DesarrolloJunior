package org.example.controladores;

public class Vuelos {

    private String tipoVuelo;

    private String fechaDeSalida;

    private String fechaDeLlegada;
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
}
