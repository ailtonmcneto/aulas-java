import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gerenciador {
    private Scanner sc;
    String nome, descricao;
    private List <Tarefa> tarefas = new ArrayList<>();

    public Gerenciador(Scanner sc) {
        this.sc = sc;
    }

    public void inserirTarefa() {

            System.out.println("digite o nome da tarefa: ");
            nome = (sc.nextLine());
            System.out.println("digite o descrição da tarefa: ");
            descricao = (sc.nextLine());
            if (nome.isBlank() || descricao.isBlank()) {
                System.out.println("nome e descrição não podem ser vazios!");
                return;
            }
            for (Tarefa tarefa : tarefas) {
                if (tarefa.getDescricao().equals(descricao) && tarefa.getNome().equals(nome)) {
                    System.out.println("essa tarefa já existe!");
                    return;
                }
            }
            tarefas.add(new Tarefa(nome, descricao));
            System.out.println("tarefa adicionada com sucesso!");
    }

    public boolean listarTarefa() {
        if (tarefas.isEmpty()){
            System.out.println("Nenhuma tarefa cadastrada!");
            return false;
        }
        else{
        System.out.println("tarefas:");
        for(int i  = 0; i < tarefas.size(); i++) {
            System.out.printf("%d - %s - %s\n", i + 1,tarefas.get(i).getNome(), tarefas.get(i).getDescricao());
        }return true;}
    }

    public void alterarTarefa() {
        if (listarTarefa()){
            try{
                System.out.println("insira o numero da tarefa: ");
                int numero = sc.nextInt() - 1;
                Tarefa tarefa = tarefas.get(numero);
                System.out.println("o que deseja alterar? ");
                System.out.println("1 - nome");
                System.out.println("2 - descrição");
                System.out.println("3 - ambos");
                int x = sc.nextInt();
                sc.nextLine();
                switch (x) {
                    case 1:
                        System.out.println("digite o nome da tarefa: ");
                        nome = (sc.nextLine());
                        if (nome.isBlank()) {
                            System.out.println("nome não pode ser vazio!");
                            return;
                        }
                        else {
                            tarefa.setNome(nome);
                            System.out.println("tarefa alterada com sucesso!");
                        }
                        break;
                    case 2:
                        System.out.println("digite o descrição da tarefa: ");
                        descricao = (sc.nextLine());
                        if (descricao.isBlank()) {
                        System.out.println(" descrição não pode ser vazia!");
                        return;
                    }
                    else {
                        tarefa.setDescricao(descricao);
                        System.out.println("tarefa alterada com sucesso!");
                    }break;

                    case 3:
                        System.out.println("digite o nome da tarefa: ");
                        nome = sc.nextLine();
                        System.out.println("digite a descrição da tarefa: ");
                        descricao = sc.nextLine();
                        if (nome.isBlank() || descricao.isBlank()) {
                            System.out.println("nome e descrição não podem ser vazios!");
                            return;
                        }
                        else {
                            tarefa.setNome(nome);
                            tarefa.setDescricao(descricao);
                            System.out.println("tarefa alterada com sucesso!");
                        }break;
                    default:
                        System.out.println("digite uma opção válida!");
                }
            }
            catch(Exception e){
                System.out.println("erro ao alterar a tarefa!");
                sc.nextLine();
            }

        }
    }

    public void removerTarefa() {
        if(listarTarefa()) {
            try {
                System.out.println("insira o numero da tarefa: ");
                int numero = sc.nextInt() - 1;
                tarefas.remove(numero);
                System.out.println("tarefa removida com sucesso!");
            } catch (Exception e) {
                System.out.println("erro ao remover a tarefa!");
            }sc.nextLine();
        }
    }
}
