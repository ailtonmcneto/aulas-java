package ex3;
import javax.lang.model.util.AbstractElementVisitor6;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Carro> carros = new ArrayList<>();
        ArrayList<Aviao> avioes = new ArrayList<>();
        ArrayList<Bicicleta> bicicletas = new ArrayList<>();

        System.out.print("Quantos carros quer cadastrar? ");
        int quantidadeCarros = sc.nextInt();

        for (int i = 0; i < quantidadeCarros; i++) {
            Carro c = new Carro();
            System.out.println("\nCarro " + (i + 1));
            System.out.print("Marca: ");
            c.setMarca(sc.next());
            System.out.print("Modelo: ");
            c.setModelo(sc.next());
            System.out.print("Cor: ");
            c.setCor(sc.next());
            System.out.print("Velocidade: ");
            c.setVelocidade(sc.nextInt());
            System.out.print("Placa: ");
            c.setPlaca(sc.next());
            System.out.println("Portas: ");
            c.setPortas(sc.nextInt());
            carros.add(c);
        }

        System.out.print("Quantos Aviões quer cadastrar? ");
        int quantidadeAvioes = sc.nextInt();

        for (int i = 0; i < quantidadeAvioes; i++) {
            Aviao a = new Aviao();
            System.out.println("\nAviao " + (i + 1));
            System.out.print("Marca: ");
            a.setMarca(sc.next());
            System.out.print("Modelo: ");
            a.setModelo(sc.next());
            System.out.print("Cor: ");
            a.setCor(sc.next());
            System.out.print("Velocidade: ");
            a.setVelocidade(sc.nextInt());
            avioes.add(a);
        }

        System.out.print("Quantas Bicicletas quer cadastrar? ");
        int quantidadeBicicleta = sc.nextInt();

        for (int i = 0; i < quantidadeBicicleta; i++) {
            Bicicleta b = new Bicicleta();
            System.out.println("\nBicicleta " + (i + 1));
            System.out.print("Marca: ");
            b.setMarca(sc.next());
            System.out.print("Modelo: ");
            b.setModelo(sc.next());
            System.out.print("Cor: ");
            b.setCor(sc.next());
            System.out.print("Velocidade: ");
            b.setVelocidade(sc.nextInt());
            bicicletas.add(b);
        }



    }
}
