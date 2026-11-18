
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class ContaCorrente extends Conta {
    LocalDateTime dataHora = LocalDateTime.now();
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    public ContaCorrente(double saldo, String titular, String numeroConta) {
        super(saldo, titular, numeroConta);
    }

    @Override
    public void sacar(double valor) {
         if (valor <= 0){
            System.out.println("valor inválido. digite um valor maior que 0");
        }
        else{
        this.saldo -= valor;
        System.out.println(
            "Saque de " + valor + " realizado com sucesso. Saldo atual: " 
            + this.saldo + "\n realizado no dia e hora: " + datahora());}
        
    }

    @Override 
    public void depositar(double valor) {
        if (valor <= 0){
            System.out.println("valor inválido. digite um valor maior que 0");
        }
        else{
          this.saldo += valor;  
          System.out.println(
            "Depósito de " + valor + " realizado com sucesso. Saldo atual: " 
            + this.saldo + " \nrealizado no dia e hora: " + datahora());
        }
    }
}