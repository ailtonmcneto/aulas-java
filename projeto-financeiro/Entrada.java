import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

// Lê dados do teclado com segurança (RN07).
// Tudo é lido com nextLine() e convertido depois. Assim o Scanner nunca fica com
// "lixo" no buffer, e uma entrada inválida só gera uma mensagem e uma nova pergunta.
public class Entrada {
    private Scanner sc;

    // STRICT faz datas impossíveis, como 31/02/2026, serem recusadas.
    private DateTimeFormatter formatoData =
            DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);

    public Entrada(Scanner sc) {
        this.sc = sc;
    }

    // RN01: não aceita texto vazio.
    public String lerTexto(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String texto = sc.nextLine().trim();
            if (!texto.isEmpty()) {
                return texto;
            }
            System.out.println("O texto não pode ficar vazio!");
        }
    }

    public int lerInteiro(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String texto = sc.nextLine().trim();
            try {
                return Integer.parseInt(texto);
            } catch (NumberFormatException e) {
                System.out.println("Digite um número inteiro válido!");
            }
        }
    }

    // RN01: o valor precisa ser maior que zero. Aceita vírgula ou ponto (ex.: 1500,50).
    public BigDecimal lerValor(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String texto = sc.nextLine().trim().replace(",", ".");
            try {
                BigDecimal valor = new BigDecimal(texto);
                if (valor.compareTo(BigDecimal.ZERO) > 0) {
                    return valor;
                }
                System.out.println("O valor deve ser maior que zero!");
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Use números, por exemplo 1500,50");
            }
        }
    }

    public LocalDate lerData(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String texto = sc.nextLine().trim();
            try {
                return LocalDate.parse(texto, formatoData);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida! Use o formato dd/mm/aaaa, por exemplo 05/11/2026");
            }
        }
    }

    public TipoLancamento lerTipo() {
        while (true) {
            System.out.println("Tipo:");
            System.out.println("1 - Receita");
            System.out.println("2 - Despesa");
            int opcao = lerInteiro("Opção: ");
            if (opcao == 1) {
                return TipoLancamento.RECEITA;
            }
            if (opcao == 2) {
                return TipoLancamento.DESPESA;
            }
            System.out.println("Opção inválida!");
        }
    }

    // Monta o menu a partir do enum: se uma categoria nova for criada,
    // ela aparece aqui sem precisar mexer neste método.
    public Categoria lerCategoria() {
        Categoria[] categorias = Categoria.values();
        while (true) {
            System.out.println("Categoria:");
            for (int i = 0; i < categorias.length; i++) {
                System.out.printf("%d - %s%n", i + 1, categorias[i]);
            }
            int opcao = lerInteiro("Opção: ");
            if (opcao >= 1 && opcao <= categorias.length) {
                return categorias[opcao - 1];
            }
            System.out.println("Opção inválida!");
        }
    }
}
