package org.example.controladores;

public class Alojamiento {

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

    public double isValorAlojamiento() {
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
}
