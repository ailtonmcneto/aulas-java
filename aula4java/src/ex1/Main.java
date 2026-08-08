package ex1;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o método do pagamento: ");
        do {
            System.out.println("1- Cartão 2- Pix 3-Boleto ");
            int x = sc.nextInt();
            PagamentoCartao c = new PagamentoCartao();


            switch (x){
                case 1: System.out.println("Digite o número de parcelas: ");
                        c.setParcelas(sc.nextInt());
                case 2:
                    System.out.println("");
            }
        }

    }
}

