package ex3;

public class ContaPoupanca extends Conta implements Rendimentavel{
    @Override
    public void calcularRendimento() {

    }

    @Override
    public void aplicarRendimento() {

    }

    protected double taxaRendimento;
    protected int diaRendimento;

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
}
