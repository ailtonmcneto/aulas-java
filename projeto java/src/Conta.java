public class Conta {
    private int numero;
    private double saldo;
    private Cliente cliente;

    public boolean depositar( double valor){
        if (valor <= 0){
            return false;
        }
        else {
            this.saldo += valor;
            return true;
        }
    }

    public Conta(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public boolean sacar(double valor){
        if(this.saldo >= valor && valor >0){
            this.saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
