import java.util.InputMismatchException;
import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Gerenciador tarefa = new Gerenciador(sc);
    int x;
    do {
        System.out.println("======================\n" +
                "CADASTRO DE TAREFAS\n" +
                "======================\n" +
                "1 - Inserir tarefa\n" +
                "2 - listar tarefas\n" +
                "3 - Alterar tarefa\n" +
                "4 - Excluir tarefa\n" +
                "0 - sair\n\n" +
                "opção: ");
        try {
            x = sc.nextInt();
        } catch (InputMismatchException e) {
            x = -1;
        }
        sc.nextLine();
            switch (x) {
                case 0:
                    System.out.println("saindo...");
                    break;
                case 1:
                    tarefa.inserirTarefa();
                    break;
                case 2:
                    tarefa.listarTarefa();
                    break;
                case 3:
                    tarefa.alterarTarefa();
                    break;
                case 4:
                    tarefa.removerTarefa();
                    break;
                default:
                    System.out.println("digite uma opção válida");
            }

    } while (x != 0);
    sc.close();
}