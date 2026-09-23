import java.util.ArrayList;
import java.util.List;

public class Banco {

    private final List<Conta> contas = new ArrayList<>();

    public boolean adicionar(Conta conta) {
        if (conta == null) {
            return false;
        }
        if (buscarPorNumero(conta.getNumero()) != null) {
            return false;
        }
        return contas.add(conta);
    }

    public Conta buscarPorNumero(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    public boolean remover(int numero) {
        Conta conta = buscarPorNumero(numero);
        if (conta == null) {
            return false;
        }
        return contas.remove(conta);
    }

    @Override
    public String toString() {
        return "Banco{" +
                "contas=" + contas +
                '}';
    }

    public void listar() {
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
            return;
        }
        System.out.println("Contas cadastradas (" + quantidade() + "):");
        for (Conta conta : contas) {
            System.out.println(conta);

        }

    }

    public int quantidade() {
        return contas.size();
    }
}