package com;

class Cientifica extends Calculadora {

    public Cientifica(String marca, String color, String modelo) {
        super(marca, color, modelo);
    }

    @Override
    public double sumar(double a, double b) {
        return a + b;
    }

    @Override
    public double restar(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a * b;
    }

    @Override
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        return a / b;
    }

    public double sumar(double a, double b, double c) {
        return a + b + c;
    }

    public double restar(double a, double b, double c) {
        return a - b - c;
    }

    public double multiplicar(double a, double b, double c) {
        return a * b * c;
    }

    public double dividir(double a, double b, double c) {
        if (b == 0 || c == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        return a / b / c;
    }
}
