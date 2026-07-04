package main;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        String r;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Digite uma opção entre 1 e 10: ");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Opção 1 escolhida");
                    break;
                case 2:
                    System.out.println("Opção 2 escolhida");
                    break;
                case 3:
                    System.out.println("Opção 3 escolhida");
                    break;
                case 4:
                    System.out.println("Opção 4 escolhida");
                    break;
                case 5:
                    System.out.println("Opção 5 escolhida");
                    break;
                case 6:
                    System.out.println("Opção 6 escolhida");
                    break;
                case 7:
                    System.out.println("Opção 7 escolhida");
                    break;
                case 8:
                    System.out.println("Opção 8 escolhida");
                    break;
                case 9:
                    System.out.println("Opção 9 escolhida");
                    break;
                case 10:
                    System.out.println("Opção 10 escolhida");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            System.out.println("Para ver novamente, digite 'S'");
            r = sc.next();
        } while (r.equalsIgnoreCase("s"));
        sc.close();
    }
}
