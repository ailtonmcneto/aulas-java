public class Conta {

    private int numero;
    private double saldo;
    private Cliente titular;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void deposito(double valor) {
        this.saldo = saldo + valor;
    }
    public void saque(double valor) {
        this.saldo = saldo - valor;
    }

    public Cliente getTitular() {
        return titular;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public String detalhesConta() {
        return "Número da conta: " + this.numero + "\n" +
               "Titular: " + this.titular.getNome() + "\n" +
               "Saldo: R$ " + this.saldo;
    }

}
