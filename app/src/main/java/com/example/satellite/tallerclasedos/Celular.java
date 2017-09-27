package com.example.satellite.tallerclasedos;

/**
 * Created by SATELLITE on 26/09/2017.
 */

public class Celular {

    private String marca;
    private int capacidad;
    private String precio;
    private String color;
    private String SistemaOperativo;

    public Celular(String marca, int capacidad, String precio, String color, String sistemaOperativo) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.precio = precio;
        this.color = color;
        this.SistemaOperativo = sistemaOperativo;
    }

    public String getMarca() {
        return marca;
    }

    public String getSistemaOperativo() {
        return SistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        SistemaOperativo = sistemaOperativo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void guardar(){
        Datos.guardar(this);
    }
}
