package Calculadora;

public class Calculadora {

    // variáveis privadas
    private double numero1;
    private double numero2;

    // getters e setters
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    // os 4 métodos das operações básicas
    public double somar() {
        return getNumero1() + getNumero2();
    }

    public double subtrair() {
        return getNumero1() - getNumero2();
    }

    public double multiplicar() {
        return getNumero1() * getNumero2();
    }

    public double dividir() {
        return getNumero1() / getNumero2();
    }
}
