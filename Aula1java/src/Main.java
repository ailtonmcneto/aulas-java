//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu endereço: ");
        String endereco = teclado.nextLine();

        System.out.print("digite seu nome: ");
        String nome = teclado.next();

        System.out.print("Digite seu RG: ");
        String rg = teclado.next();

        System.out.print("Digite seu CPF: ");
        String cpf = teclado.next();

        System.out.print("Digite seu Telefone: ");
        String tel = teclado.next();

        System.out.print("Digite Seu email: ");
        String email = teclado.next();

        System.out.printf("Nome: %s , RG: %s, CPF: %s, Endereço: %s, Telefone: %s, Email: %s",nome,rg,cpf,endereco,tel,email);

        teclado.close();
    }
}