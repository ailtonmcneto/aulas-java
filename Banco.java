
public class Banco {
    public void transferir(Conta origem, Conta destino, double valor){
        if (origem.saldo >= valor){
            origem.sacar(valor);
            destino.depositar(valor);
            System.out.println(
                "Transferência de " + valor + " realizada com sucesso. Saldo atual da conta de origem: " 
                + origem.saldo + "\nSaldo atual da conta de destino: " + destino.saldo
                + "\nrealizado no dia e hora: " + Conta.datahora());
        }
        else{
            System.out.println("transferência falhou.");
        }

    };


}