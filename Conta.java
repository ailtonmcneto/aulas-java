import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public abstract class Conta {
    protected double saldo;
    protected String titular;
    protected String numeroConta;
    
    public Conta(double saldo, String titular, String numeroConta) {
        this.saldo = saldo;
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    public abstract void sacar(double valor);

    public abstract void depositar(double valor);

    public static  String datahora(){
        LocalDateTime datahora = LocalDateTime.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            return datahora.format(formatador);
    }

}