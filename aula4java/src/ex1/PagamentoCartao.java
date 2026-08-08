package ex1;

public class PagamentoCartao extends Pagamento {
    protected String numeroCartao;
    protected int parcelas;

    @Override
    public double calcularTaxa() {
        return 0;
    }

    @Override
    public void processarPagamento() {

    }

    @Override
    public void emitirComprovante() {
        super.emitirComprovante();
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }


}
