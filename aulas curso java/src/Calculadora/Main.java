package Calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        int opcao;

        do {
            // pede os numeros antes do menu
            System.out.print("Digite o primeiro numero: ");
            calc.setNumero1(scanner.nextDouble());

            System.out.print("Digite o segundo numero: ");
            calc.setNumero2(scanner.nextDouble());

            // menu simples
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Sair");
            System.out.print("Qual operacao deseja fazer? ");
            opcao = scanner.nextInt();

            // switch case para cada operacao
            switch (opcao) {
                case 1:
                    System.out.println("Resultado: " + calc.somar());
                    break;
                case 2:
                    System.out.println("Resultado: " + calc.subtrair());
                    break;
                case 3:
                    System.out.println("Resultado: " + calc.multiplicar());
                    break;
                case 4:
                    // verificacao antes de dividir: nenhum numero pode ser dividido por 0
                    if (calc.getNumero2() == 0) {
                        System.out.println("Erro: nao e possivel dividir por zero!");
                    } else {
                        System.out.println("Resultado: " + calc.dividir());
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }

            System.out.println();

        } while (opcao != 0);

        scanner.close();
    }
}
