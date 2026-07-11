package qst1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Client c = new Client();

        System.out.print("Digite o endereço do cliente: ");
        c.setEndereco(sc.nextLine());
        System.out.println("Endereço: " + c.getEndereco());

        System.out.print("Digite o nome do cliente: ");
        c.setNome(sc.next());
        System.out.println("Nome: " + c.getNome());

        System.out.print("Digite o CPF do cliente: ");
        c.setCpf(sc.next());
        System.out.println("Cpf: " + c.getCpf());


        System.out.print("Digite o email do cliente: ");
        c.setEmail(sc.next());
        System.out.println("Email: " + c.getEmail());

        System.out.print("Digite o RG do cliente: ");
        c.setRg(sc.next());
        System.out.println("Rg: " + c.getRg());

        System.out.print("Digite o Telefone do cliente: ");
        c.setTelefone(sc.next());
        System.out.println("Telefone: " + c.getTelefone());

        sc.close();

    }
}
