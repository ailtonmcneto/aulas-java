import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Guarda os lançamentos em memória e concentra a lógica do sistema.
// Não lê nem imprime nada: quem conversa com o usuário é a Main.
public class ControleFinanceiro {
    private List<Lancamento> lancamentos = new ArrayList<>();
    private int proximoId = 1;

    // RF01 / RN02: cada lançamento recebe um id novo, que nunca é reaproveitado,
    // mesmo depois de uma exclusão.
    public Lancamento adicionar(String descricao, BigDecimal valor, LocalDate data,
                                TipoLancamento tipo, Categoria categoria) {
        Lancamento lancamento = new Lancamento(proximoId, descricao, valor, data, tipo, categoria);
        lancamentos.add(lancamento);
        proximoId++;
        return lancamento;
    }

    // RF02
    public List<Lancamento> listarTodos() {
        return lancamentos;
    }

    // RF03: devolve null quando o id não existe.
    public Lancamento buscarPorId(int id) {
        for (Lancamento lancamento : lancamentos) {
            if (lancamento.getId() == id) {
                return lancamento;
            }
        }
        return null;
    }

    // RF05: devolve false quando o id não existe (RN03).
    public boolean excluir(int id) {
        Lancamento lancamento = buscarPorId(id);
        if (lancamento == null) {
            return false;
        }
        lancamentos.remove(lancamento);
        return true;
    }

    // RF06
    public List<Lancamento> filtrarPorTipo(TipoLancamento tipo) {
        List<Lancamento> resultado = new ArrayList<>();
        for (Lancamento lancamento : lancamentos) {
            if (lancamento.getTipo() == tipo) {
                resultado.add(lancamento);
            }
        }
        return resultado;
    }

    // RF07: inclui as duas datas da ponta.
    public List<Lancamento> buscarPorPeriodo(LocalDate inicio, LocalDate fim) {
        List<Lancamento> resultado = new ArrayList<>();
        for (Lancamento lancamento : lancamentos) {
            LocalDate data = lancamento.getData();
            if (!data.isBefore(inicio) && !data.isAfter(fim)) {
                resultado.add(lancamento);
            }
        }
        return resultado;
    }

    // RF08
    public BigDecimal totalPorTipo(TipoLancamento tipo) {
        BigDecimal total = BigDecimal.ZERO;
        for (Lancamento lancamento : lancamentos) {
            if (lancamento.getTipo() == tipo) {
                total = total.add(lancamento.getValor());
            }
        }
        return total;
    }

    // RN04: saldo = receitas - despesas
    public BigDecimal calcularSaldo() {
        return totalPorTipo(TipoLancamento.RECEITA).subtract(totalPorTipo(TipoLancamento.DESPESA));
    }
}
