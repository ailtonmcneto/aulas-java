package qst2;

public class Produto {

    private String nome;
    private double quantidade, preco, pago, valorfinal;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;

    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPago() {
        return pago;

    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public double getValorfinal() {
        return valorfinal;
    }

    public void calcular (){
        valorfinal = quantidade * preco;
       System.out.println("Valor a ser pago: " + valorfinal);
    }

    public void restante () {
        if (pago > valorfinal ){
            double troco = pago - valorfinal;
            System.out.println("Aqui está o seu troco: " + troco);
        }
        else if (pago < valorfinal){
            double faltante = valorfinal - pago;
            System.out.println("Ainda resta pagar " + faltante);
        }
        else {
            System.out.println("Produto pago, Até logo.");
        }
    }
}
