package ex3;

public class Carro extends Veiculo{
    private String placa;
    private int portas;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public void abrirportamalas() {
        System.out.println("Porta-malas aberto");
    }

    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + placa + '\'' +
                ", portas=" + portas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }

    @Override
    public void ligar() {
        System.out.println("carro ligado");
    }

    @Override
    public void desligar() {
        System.out.println("carro desligado");
    }

    @Override
    public void acelerar() {
        System.out.println("acelerando...");
    }

    @Override
    public void frear() {

    }
}
