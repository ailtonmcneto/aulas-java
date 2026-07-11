package ex1;

public class Carro {

    private  String marca, modelo, cor, placa;
    private int ano, velocidade;

    public Carro (String marca, String modelo, String cor, String placa, int ano, int velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public Carro(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public Carro() {
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidade (int velocidade) {
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void ligar() {
        System.out.println("ligando");
    }
    public void acelerar () {
        System.out.println("acelerando");
    }
    public void desligar () {
        System.out.println("desligando");
    }
    public void frear () {
        System.out.println("freando");
    }
}
