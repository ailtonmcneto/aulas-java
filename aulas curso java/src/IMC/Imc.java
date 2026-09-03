package IMC;

import java.util.Scanner;

public class Imc {

    // Variaveis
    double peso;
    double altura;
    double imc;
    Scanner sc = new Scanner(System.in);

    // Le um numero aceitando virgula ou ponto como separador decimal
    private double lerNumero() {
        String entrada = sc.next();       // le o texto digitado (ex: "1,80" ou "1.80")
        entrada = entrada.replace(",", "."); // padroniza para ponto
        return Double.parseDouble(entrada);  // parseDouble sempre usa ponto
    }

    // Metodo para pedir o peso do usuario
    public void pedirPeso() {
        System.out.print("Digite o seu peso (kg): ");
        peso = lerNumero();
    }

    // Metodo para pedir a altura do usuario
    public void pedirAltura() {
        System.out.print("Digite a sua altura (m): ");
        altura = lerNumero();
    }

    // Metodo para calcular o imc
    public void calcularImc() {
        imc = peso / (altura * altura);
        System.out.printf("O seu IMC e: %.2f%n", imc);
    }

    // Metodo para dizer a situacao do usuario
    public void mostrarSituacao() {
        if (imc < 18.5) {
            System.out.println("Situacao: Abaixo do normal");
        } else if (imc < 25) {
            System.out.println("Situacao: Normal");
        } else if (imc < 30) {
            System.out.println("Situacao: Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Situacao: Obesidade 1");
        } else if (imc < 40) {
            System.out.println("Situacao: Obesidade 2");
        } else {
            System.out.println("Situacao: Obesidade 3");
        }
    }
}
