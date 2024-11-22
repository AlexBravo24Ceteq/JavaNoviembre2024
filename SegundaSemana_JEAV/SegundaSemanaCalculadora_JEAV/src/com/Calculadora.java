package com;

abstract class Calculadora {
    private String marca;
    private String color;
    private String modelo;

    // Constructor
    public Calculadora(String marca, String color, String modelo) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Calculadora{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public abstract double sumar(double a, double b);
    public abstract double restar(double a, double b);
    public abstract double multiplicar(double a, double b);
    public abstract double dividir(double a, double b);
}
