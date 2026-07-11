package main;
import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        String r;
        Scanner sc = new Scanner(System.in);
        double saldo = 500;
        do {
            System.out.println("""
                    1 - Consultar saldo
                    2 - Depositar
                    3 - Sacar
                    0 - Encerrar""");
            int x = sc.nextInt();
            switch (x){
                case(1):
                    System.out.print("Saldo atual: " + saldo);
                    break;
                case(2):
                    System.out.print("Digite o valor para depositar: ");
                    double depo = sc.nextDouble();
                    saldo += depo;
                    System.out.print("Valor depositado.");
                    break;
                case(3):
                    System.out.print("Digite o valor para sacar: ");
                    double sacar = sc.nextDouble();
                    if (sacar > saldo){
                        System.out.print("Saldo insuficiente.");
                    }
                    else{
                        saldo -= sacar;
                        System.out.print("valor sacado: " + sacar);
                    }
                    break;
                case(0):
                    System.out.println("Encerrando o programa.");
                default:
                    System.out.print("Opção inválida.");
            }
            System.out.print("para ver novamente, Digite 'S'");
            r = sc.next();
        } while (r.equalsIgnoreCase("s"));
        sc.close();
    }
}
