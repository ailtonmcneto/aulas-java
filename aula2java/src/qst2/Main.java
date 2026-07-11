package qst2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();

        System.out.print("Digite o nome do produto: ");
        p.setNome(sc.nextLine());

        System.out.print("Digite a quantidade do produto: ");
        p.setQuantidade(sc.nextDouble());

        System.out.println("Digite o preço unitário do produto: ");
        p.setPreco(sc.nextDouble());

        double desconto = 0;
        double total;

        if (p.getValorfinal() > 500){
           desconto = p.getValorfinal() * 0.15;
           total = p.getValorfinal() - desconto;
        }
        else {
            total = p.getValorfinal();
        }

        System.out.println("Valor a ser pago: " + total );

        System.out.println("Digite o valor do pagamento: ");
        p.setPago(sc.nextDouble());

        double troco ;
        double faltante ;

            if (p.getPago() > total) {
                troco = p.getPago() - total;
                System.out.println("Produto pago, aqui está o seu troco: " + troco);
            } else if (p.getPago() < total) {
                faltante = total - p.getPago();
                System.out.println("Ainda resta pagar " + faltante);
            } else {
                System.out.println("Produto pago, até logo.");
            }
        p.restante();

    }
}
