import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // ---------- PARTE 1: operacoes em uma conta ----------
        System.out.println("===== OPERACOES NA CONTA =====");

        Cliente maria = new Cliente("Maria", LocalDate.of(2008, 6, 23));
        Conta conta = new Conta(1001, maria);

        System.out.printf("Cliente: %s | Idade: %d | Conta: %d | Saldo inicial: %.2f%n%n",
                maria.getNome(), maria.getIdade(), conta.getNumero(), conta.getSaldo());

        testarDeposito(conta, 1000);
        testarSaque(conta, 250);
        testarDeposito(conta, -100);
        testarDeposito(conta, 0);
        testarSaque(conta, -100);
        testarSaque(conta, 99999);
        testarSaque(conta, 750);

        // ---------- PARTE 2: banco ----------
        System.out.println();
        System.out.println("===== BANCO =====");

        Banco banco = new Banco();

        System.out.println("-- listar com banco vazio --");
        banco.listar();

        Cliente joao = new Cliente("Joao", LocalDate.of(1995, 2, 10));
        Cliente ana = new Cliente("Ana", LocalDate.of(2001, 11, 4));

        Conta contaJoao = new Conta(1002, joao);
        Conta contaAna = new Conta(1003, ana);

        System.out.println();
        System.out.println("-- adicionar --");
        System.out.println("adicionar(1001) -> " + banco.adicionar(conta));
        System.out.println("adicionar(1002) -> " + banco.adicionar(contaJoao));
        System.out.println("adicionar(1003) -> " + banco.adicionar(contaAna));
        System.out.println("adicionar(1002 de novo) -> " + banco.adicionar(new Conta(1002, joao)));
        System.out.println("adicionar(null) -> " + banco.adicionar(null));
        System.out.println("quantidade -> " + banco.quantidade());

        System.out.println();
        System.out.println("-- listar --");
        banco.listar();

        System.out.println();
        System.out.println("-- buscar --");
        System.out.println("buscarPorNumero(1002) -> " + banco.buscarPorNumero(1002));
        System.out.println("buscarPorNumero(9999) -> " + banco.buscarPorNumero(9999));

        System.out.println();
        System.out.println("-- depositar na conta encontrada --");
        Conta encontrada = banco.buscarPorNumero(1002);
        encontrada.depositar(500);
        System.out.printf("saldo da 1002 apos deposito: %.2f%n", banco.buscarPorNumero(1002).getSaldo());

        System.out.println();
        System.out.println("-- remover --");
        System.out.println("remover(1003) -> " + banco.remover(1003));
        System.out.println("remover(1003) de novo -> " + banco.remover(1003));
        System.out.println("remover(9999) -> " + banco.remover(9999));
        System.out.println("quantidade -> " + banco.quantidade());

        System.out.println();
        System.out.println("-- listar final --");
        banco.listar();
    }

    private static void testarDeposito(Conta conta, double valor) {
        boolean aceito = conta.depositar(valor);
        System.out.printf("depositar(%.2f) -> %s | saldo: %.2f%n",
                valor, aceito ? "aceito" : "recusado", conta.getSaldo());
    }

    private static void testarSaque(Conta conta, double valor) {
        boolean aceito = conta.sacar(valor);
        System.out.printf("sacar(%.2f) -> %s | saldo: %.2f%n",
                valor, aceito ? "aceito" : "recusado", conta.getSaldo());
    }
}