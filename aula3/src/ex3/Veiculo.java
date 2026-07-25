package ex3;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected String cor;
    protected int velocidade;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void ligar() {
        System.out.println("veículo ligado.");
    }

    public void desligar () {
        System.out.println("veículo desligado.");
    }

    public void acelerar () {
        System.out.println("Acelerando em km/h");
    }

    public void frear () {
        System.out.println("freando");
    }

    @Override
    public String toString() {
        return "Veículo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }
}
