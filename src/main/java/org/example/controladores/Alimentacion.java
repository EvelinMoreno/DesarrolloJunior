package org.example.controladores;

public class Alimentacion {

    private int cantidadComidas;
    private double valorComidas;

    public Alimentacion() {
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
}
