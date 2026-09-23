import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gerenciador {
    Scanner ler = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    String nome, descricao;
    private List <Tarefa> tarefas = new ArrayList<>();

    public void inserirTarefa() {

        System.out.println("digite o nome da tarefa: ");
        nome = (ler.nextLine());
        System.out.println("digite o descrição da tarefa: ");
        descricao = (ler.nextLine());
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equals(descricao) && tarefa.getNome().equals(nome)) {
                System.out.println("essa tarefa já existe!");
                return;
            }
        }
        System.out.println("tarefa adicionada com sucesso!");
        tarefas.add(new Tarefa(nome, descricao));
    }

    public void listarTarefa() {
        System.out.println("tarefas:");
        for(int i  = 0; i < tarefas.size(); i++) {
            System.out.printf("%d - %s - %s\n", i + 1,tarefas.get(i).getNome(), tarefas.get(i).getDescricao());
        }
    }

    public void alterarTarefa() {

        listarTarefa();
        System.out.println("insira o numero da tarefa: ");
        int numero = sc.nextInt() - 1;
        Tarefa tarefa = tarefas.get(numero);
        System.out.println("o que deseja alterar? ");
        System.out.println("1 - nome");
        System.out.println("2 - descrição");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("digite o nome da tarefa: ");
                tarefa.setNome((ler.nextLine()));
                break;
            case 2:
                System.out.println("digite o descrição da tarefa: ");
                tarefa.setDescricao((ler.nextLine()));
                break;
            default:
                System.out.println("digite uma opção válida!");
        }
        System.out.println("tarefa alterada com sucesso!");
    }

    public void removerTarefa() {
        listarTarefa();
        System.out.println("insira o numero da tarefa: ");
        int numero = sc.nextInt() - 1;
        Tarefa tarefa = tarefas.get(numero);
        tarefas.remove(numero);
        System.out.println("tarefa removida com sucesso!");
    }
}
