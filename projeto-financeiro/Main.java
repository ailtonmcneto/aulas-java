import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static ControleFinanceiro controle = new ControleFinanceiro();
    private static Entrada entrada;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        entrada = new Entrada(sc);
        int opcao;

        // RF09: depois de cada operação o menu volta, até o usuário escolher 0.
        do {
            System.out.println();
            System.out.println("==============================");
            System.out.println(" CONTROLE FINANCEIRO PESSOAL");
            System.out.println("==============================");
            System.out.println("1 - Cadastrar lançamento");
            System.out.println("2 - Listar todos");
            System.out.println("3 - Consultar por id");
            System.out.println("4 - Alterar lançamento");
            System.out.println("5 - Excluir lançamento");
            System.out.println("6 - Filtrar por tipo");
            System.out.println("7 - Consultar por período");
            System.out.println("8 - Resumo financeiro");
            System.out.println("0 - Sair");
            opcao = entrada.lerInteiro("Opção: ");
            System.out.println();

            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    listarTodos();
                    break;
                case 3:
                    consultarPorId();
                    break;
                case 4:
                    alterar();
                    break;
                case 5:
                    excluir();
                    break;
                case 6:
                    filtrarPorTipo();
                    break;
                case 7:
                    consultarPorPeriodo();
                    break;
                case 8:
                    exibirResumo();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
            }
        } while (opcao != 0);

        sc.close();
    }

    // RF01
    private static void cadastrar() {
        System.out.println("--- Cadastrar lançamento ---");
        String descricao = entrada.lerTexto("Descrição: ");
        BigDecimal valor = entrada.lerValor("Valor: R$ ");
        LocalDate data = entrada.lerData("Data (dd/mm/aaaa): ");
        TipoLancamento tipo = entrada.lerTipo();
        Categoria categoria = entrada.lerCategoria();

        Lancamento novo = controle.adicionar(descricao, valor, data, tipo, categoria);
        System.out.println("Lançamento cadastrado com sucesso! Id: " + novo.getId());
    }

    // RF02
    private static void listarTodos() {
        System.out.println("--- Todos os lançamentos ---");
        imprimirLista(controle.listarTodos(), "Nenhum lançamento cadastrado.");
    }

    // RF03
    private static void consultarPorId() {
        int id = entrada.lerInteiro("Id do lançamento: ");
        Lancamento lancamento = controle.buscarPorId(id);
        if (lancamento == null) {
            System.out.println("Nenhum lançamento encontrado com o id " + id + ".");
            return;
        }
        imprimirCabecalho();
        System.out.println(lancamento);
    }

    // RF04
    private static void alterar() {
        int id = entrada.lerInteiro("Id do lançamento a alterar: ");
        Lancamento lancamento = controle.buscarPorId(id);
        if (lancamento == null) {
            System.out.println("Nenhum lançamento encontrado com o id " + id + "."); // RN03
            return;
        }

        imprimirCabecalho();
        System.out.println(lancamento);
        System.out.println();
        System.out.println("O que deseja alterar?");
        System.out.println("1 - Descrição");
        System.out.println("2 - Valor");
        System.out.println("3 - Data");
        System.out.println("4 - Tipo");
        System.out.println("5 - Categoria");
        System.out.println("0 - Cancelar");
        int campo = entrada.lerInteiro("Opção: ");

        switch (campo) {
            case 1:
                lancamento.setDescricao(entrada.lerTexto("Nova descrição: "));
                break;
            case 2:
                lancamento.setValor(entrada.lerValor("Novo valor: R$ "));
                break;
            case 3:
                lancamento.setData(entrada.lerData("Nova data (dd/mm/aaaa): "));
                break;
            case 4:
                lancamento.setTipo(entrada.lerTipo());
                break;
            case 5:
                lancamento.setCategoria(entrada.lerCategoria());
                break;
            case 0:
                System.out.println("Alteração cancelada.");
                return;
            default:
                System.out.println("Opção inválida! Nada foi alterado.");
                return;
        }
        System.out.println("Lançamento alterado com sucesso!");
    }

    // RF05
    private static void excluir() {
        int id = entrada.lerInteiro("Id do lançamento a excluir: ");
        if (controle.excluir(id)) {
            System.out.println("Lançamento excluído com sucesso!");
        } else {
            System.out.println("Nenhum lançamento encontrado com o id " + id + "."); // RN03
        }
    }

    // RF06
    private static void filtrarPorTipo() {
        TipoLancamento tipo = entrada.lerTipo();
        System.out.println("--- Lançamentos do tipo " + tipo + " ---");
        imprimirLista(controle.filtrarPorTipo(tipo), "Nenhum lançamento do tipo " + tipo + ".");
    }

    // RF07
    private static void consultarPorPeriodo() {
        LocalDate inicio = entrada.lerData("Data inicial (dd/mm/aaaa): ");
        LocalDate fim = entrada.lerData("Data final (dd/mm/aaaa): ");
        if (inicio.isAfter(fim)) {
            System.out.println("A data inicial não pode ser posterior à data final!"); // RN06
            return;
        }
        System.out.println("--- Lançamentos no período ---");
        imprimirLista(controle.buscarPorPeriodo(inicio, fim), "Nenhum lançamento nesse período.");
    }

    // RF08
    private static void exibirResumo() {
        System.out.println("--- Resumo financeiro ---");
        System.out.printf("Total de receitas: R$ %10.2f%n", controle.totalPorTipo(TipoLancamento.RECEITA));
        System.out.printf("Total de despesas: R$ %10.2f%n", controle.totalPorTipo(TipoLancamento.DESPESA));
        System.out.printf("Saldo:             R$ %10.2f%n", controle.calcularSaldo());
    }

    // RN05: lista vazia mostra uma mensagem em vez de não mostrar nada.
    private static void imprimirLista(List<Lancamento> lista, String mensagemVazia) {
        if (lista.isEmpty()) {
            System.out.println(mensagemVazia);
            return;
        }
        imprimirCabecalho();
        for (Lancamento lancamento : lista) {
            System.out.println(lancamento);
        }
    }

    private static void imprimirCabecalho() {
        System.out.printf("%-4s %-11s %-8s %-12s %13s   %s%n",
                "ID", "DATA", "TIPO", "CATEGORIA", "VALOR", "DESCRIÇÃO");
    }
}
