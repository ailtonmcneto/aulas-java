package main;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = teclado.nextLine();

        System.out.print("Digite o valor unitário: ");
        double valor = teclado.nextDouble();

        System.out.print("Digite a quantidade: ");
        double quant = teclado.nextDouble();

        double valortotal = valor * quant;
        if (valortotal > 500){
          valortotal *= 0.85;
          System.out.print("Desconto aplicado: " + valortotal);
        }
        else{
            System.out.print("Valor a ser pago: "+ valortotal);
        }
        System.out.print("Digite o valor do seu pagamento: ");
        double valorpag = teclado.nextDouble();
        if (valorpag < valortotal){
            double valorrestante = valortotal - valorpag;
            System.out.print("O valor pago é menor do que o valor total do produto. falta "+ valorrestante);
        }
        else if (valorpag > valortotal){
            double troco = valorpag - valortotal;
            System.out.print("O valor pago é maior do que o valor total do produto. Seu troco: "+ troco);
        }
    }
}
