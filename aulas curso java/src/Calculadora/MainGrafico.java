package Calculadora;

import javax.swing.JOptionPane;

public class MainGrafico {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int opcao;

        do {
            // menu simples usando input dialog
            String menu = "=== CALCULADORA ===\n"
                    + "1 - Somar\n"
                    + "2 - Subtrair\n"
                    + "3 - Multiplicar\n"
                    + "4 - Dividir\n"
                    + "0 - Sair\n\n"
                    + "Qual operacao deseja fazer?";

            String entradaOpcao = JOptionPane.showInputDialog(menu);

            // se o usuario fechar a janela ou cancelar, encerra
            if (entradaOpcao == null) {
                opcao = 0;
            } else {
                opcao = Integer.parseInt(entradaOpcao);
            }

            // se escolheu sair, nem pede os numeros
            if (opcao == 0) {
                JOptionPane.showMessageDialog(null, "Saindo...");
                break;
            }

            // pede os numeros com input dialog
            double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero:"));
            double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero:"));

            calc.setNumero1(numero1);
            calc.setNumero2(numero2);

            // switch case para cada operacao, mostrando o resultado no dialog
            switch (opcao) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Resultado: " + calc.somar());
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Resultado: " + calc.subtrair());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Resultado: " + calc.multiplicar());
                    break;
                case 4:
                    // verificacao antes de dividir: nenhum numero pode ser dividido por 0
                    if (calc.getNumero2() == 0) {
                        JOptionPane.showMessageDialog(null, "Erro: nao e possivel dividir por zero!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Resultado: " + calc.dividir());
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao invalida!");
                    break;
            }

        } while (opcao != 0);
    }
}
