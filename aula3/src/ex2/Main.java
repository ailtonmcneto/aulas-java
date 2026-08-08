package ex2;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Client> clients = new ArrayList<>();

        System.out.println("Quantos quer cadastrar? ");
        int qtde = sc.nextInt();

        for(int i= 0; i < qtde; i++){
            Client c = new Client();
            c.setId(i + 1);
            System.out.println("Endereço: ");
            c.setEndereco(sc.next());
            System.out.println("Nome: ");
            c.setNome(sc.next());
            System.out.print("Telefone: ");
            c.setTelefone(sc.next());
            System.out.print("RG: ");
            c.setRg(sc.next());
            System.out.print("Email: ");
            c.setEmail(sc.next());
            System.out.print("CPF: ");
            c.setCpf(sc.next());
            clients.add(c);
        }
        System.out.println(clients);

        System.out.print("digite o índice que deseja atualizar: ");
        int indiceAtualizar = sc.nextInt();

        if (indiceAtualizar >=0 && indiceAtualizar < clients.size()){
            Client c = clients.get(indiceAtualizar);

            System.out.println("novo nome: ");
            c.setNome(sc.next());
            System.out.println("Novo Endereço: ");
            c.setEndereco(sc.next());
            System.out.print("Novo Telefone: ");
            c.setTelefone(sc.next());
            System.out.print("Novo RG: ");
            c.setRg(sc.next());
            System.out.print("Novo Email: ");
            c.setEmail(sc.next());
            System.out.print("Novo CPF: ");
            c.setCpf(sc.next());
            System.out.println("Cliente atualizado com sucesso.");
        } else {
            System.out.println("índice inválido.");
        }

        System.out.println(clients);
        System.out.print("Digite o índice do cliente que deseja remover: ");
        int indiceRemover = sc.nextInt() - 1;

        if (indiceRemover >=0 && indiceRemover < clients.size()){
            clients.remove(indiceRemover);

            for (int i = 0; i < clients.size(); i++){
                clients.get(i).setId(i + 1);
            }

            System.out.println("Cliente removido com sucesso.");
        } else {
            System.out.println("índice inválido");
        }
        System.out.println(clients);


    }
}
