package org.example.controladores;

public class Alojamiento {

    private String tipoAlojamiento;
    private double valorAlojamiento;
    private int nochesAlojamiento;
    private String fechaInicio;
    private String fechaFinal;

    public Alojamiento() {
    }

    public String getTipoAlojamiento() {
        return tipoAlojamiento;
    }

    public void setTipoAlojamiento(String tipoAlojamiento) {
        this.tipoAlojamiento = tipoAlojamiento;
    }

    public double isValorAlojamiento() {
        return valorAlojamiento;
    }

    public void setValorAlojamiento(double valorAlojamiento) {
        if (valorAlojamiento <= 0) {
            System.out.println("Ingrese un valor valido");
        }else {
            this.valorAlojamiento = valorAlojamiento;
        }
    }

    public int getNochesAlojamiento() {
        return nochesAlojamiento;
    }

    public void setNochesAlojamiento(int nochesAlojamiento) {
        this.nochesAlojamiento = nochesAlojamiento;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
}
