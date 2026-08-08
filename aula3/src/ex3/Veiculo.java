package ex3;
//abstrato pois não vou
public abstract class Veiculo {
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

    public abstract void ligar();
    public abstract void desligar ();
    public abstract void acelerar ();
    public abstract void frear ();


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
