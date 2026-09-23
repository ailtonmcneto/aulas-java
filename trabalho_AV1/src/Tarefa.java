import java.util.Scanner;
public class Tarefa {
    Scanner ler = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    private String nome, descricao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void inserirTarefa(){
        System.out.println("digite o nome da tarefa: ");
        setNome(ler.nextLine());
        System.out.println("digite o descrição da tarefa: ");
        setDescricao(sc.nextLine());
    }
}

