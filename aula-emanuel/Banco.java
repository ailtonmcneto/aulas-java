import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente> clientes = new ArrayList<>();

    public void add(Cliente cliente) {
        this.clientes.add(cliente);
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
            System.out.println(this.clientes.indexOf(cliente) +"  "+ cliente.getNome());
            //System.out.println(cliente);
        }
    }

}