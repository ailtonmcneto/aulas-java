package ex3;

public class Aviao extends Veiculo {
    @Override
    public String toString() {
        return "Aviao{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }
}
