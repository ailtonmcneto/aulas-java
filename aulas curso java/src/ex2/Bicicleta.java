package ex2;

public class Bicicleta extends Veiculo {

    private int marchas;
    private String tipoFreio;
    private boolean possuicesta;

    public int getMarchas() {
        return marchas;
    }

    public void setMarchas(int marcas) {
        this.marchas = marcas;
    }

    public String getTipoFreio() {
        return tipoFreio;
    }

    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }

    public boolean isPossuicesta() {
        return possuicesta;
    }

    public void setPossuicesta(boolean possuicesta) {
        this.possuicesta = possuicesta;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }

    @Override
    public void ligar() {

    }

    @Override
    public void acelerar() {

    }

    @Override
    public void frear() {

    }

    @Override
    public void desligar() {

    }
}
