import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
    private List<Cliente> clientes = new ArrayList<>();
    private List<Conta> contas = new ArrayList<>();
    private Scanner input;

    // Recebe o mesmo Scanner do Main: vários Scanners em System.in disputam a entrada
    public Banco(Scanner input) {
        this.input = input;
    }

    public void cadastrarCliente() {
        Cliente cliente = new Cliente();

        System.out.println("Entre com o nome do cliente:");
        cliente.setNome(input.nextLine());

        System.out.println("Entre com a idade do cliente:");
        cliente.setIdade(input.nextInt());
        input.nextLine();

        this.clientes.add(cliente);
    }

    public boolean cadastrarConta(){
        if (this.clientes.isEmpty()) {
            System.out.println("Cadastre um cliente antes de criar uma conta!");
            return false;
        }

        listar();
        System.out.println("Entre com a posição do cliente titular:");
        int posicao = input.nextInt();
        input.nextLine();

        if (posicao < 0 || posicao >= this.clientes.size()) {
            System.out.println("Não existe cliente cadastrado nessa posição!");
            return false;
        }

        Cliente cliente = this.clientes.get(posicao);
        if (cliente.getConta() != null) {
            System.out.println("Esse cliente já possui uma conta!");
            return false;
        }

        Conta conta = new Conta();
        System.out.println("Entre com o número da conta:");
        conta.setNumero(input.nextInt());
        input.nextLine();

        conta.setTitular(cliente);
        cliente.setConta(conta);
        this.contas.add(conta);
        return true;
    }

    public void remove(Cliente cliente) {
        this.clientes.remove(cliente);
    }

    public void update(Cliente cliente, Cliente novoCliente) {
        int index = this.clientes.indexOf(cliente);
        if (index != -1) {
            this.clientes.set(index, novoCliente);
        }
    }

    public void listar() {
        System.out.println("Clientes cadastrados: ");
        for (Cliente cliente : this.clientes) {
            System.out.println(this.clientes.indexOf(cliente) +"  "+ cliente.getNome() );
            //System.out.println(cliente);
        }
    }

    public Cliente verCliente(int posicao){
        return this.clientes.get(posicao);
    }

    public void  listarConta(){
        for (Conta conta : this.contas) {
            System.out.println(this.contas.indexOf(conta) +" "+ conta.getNumero() +" - "+ conta.getTitular().getNome() );
            //System.out.println(conta);
        }
    }

    public Conta getConta(int posicao){
        return this.contas.get(posicao);
    }

    public boolean semContas() {
        return this.contas.isEmpty();
    }

}
