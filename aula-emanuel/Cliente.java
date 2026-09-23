import java.time.LocalDate;

public class Cliente {
    
    private String nome;
    private int idade;
    private LocalDate dataNascimento;
    private Conta conta;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setDataNascimento(String dataNascimento) {
            String[] data = dataNascimento.split("/");
            int dia = Integer.parseInt(data[0]);    
            int mes = Integer.parseInt(data[1]);
            int ano = Integer.parseInt(data[2]);    
            this.dataNascimento = LocalDate.of(ano, mes, dia);
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Conta getConta() {
        return conta;
    }
}