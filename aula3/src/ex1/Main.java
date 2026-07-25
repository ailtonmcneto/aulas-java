package ex1;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Carro> carros = new ArrayList<>();

        System.out.print("Quantos quer cadastrar? ");
        int qtde = sc.nextInt();

        for (int i= 0; i< qtde; i++){
            Carro c = new Carro();
            c.setId(i + 1);
            System.out.print("Marca: ");
            c.setMarca(sc.next());
            System.out.print("Modelo: ");
            c.setModelo(sc.next());
            System.out.print("Velocidade: ");
            c.setVelocidade(sc.nextInt());
            System.out.print("Cor: ");
            c.setCor(sc.next());
            carros.add(c);
        }
        System.out.println(carros);
        sc.close();
    }
}