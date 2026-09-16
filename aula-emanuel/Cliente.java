import java.time.LocalDate;

public class Cliente {
    
    private String nome;
    private int idade;
    private LocalDate dataNascimento;

    public void setIdade(int idade) {
        try {
            if (idade <= 0) {
                throw new IllegalArgumentException("Idade não pode ser negativa.");
            }
            this.idade = idade;   
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}