public class Main {
    public static void main(String[] args) {
        Contapoupanca contapoupanca = new Contapoupanca(
            1000, "tavares da silva" , "6742");
        ContaCorrente contaCorrete = new ContaCorrente(
                1000, 
                "João Silva",
                "12345");
        
        Banco banco = new Banco();
        contaCorrete.depositar(1000);
        contapoupanca.sacar(10);
        contapoupanca.depositar(1000);
        banco.transferir(contapoupanca, contaCorrete, 500);
    }
}
 