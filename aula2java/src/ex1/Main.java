package ex1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Carro c = new Carro("Fiat","Uno","Cinza","ABC123", 2005, 100);
        Carro c2 = new Carro("honda","preto");
        Carro c3 = new Carro();

        System.out.print("Digite o ano do veículo: ");
        c.setAno(sc.nextInt());
        System.out.println("Ano: " + c.getAno());

        System.out.print("Digite a velocidade: ");
        c.setVelocidade(sc.nextInt());
        System.out.println("Velocidade: " + c.getVelocidade());

        System.out.print("Digite o modelo do veículo:");
        c.setModelo(sc.next());
        System.out.println("Modelo: " + c.getModelo());

        System.out.print("Digite o cor do veículo:");
        c.setCor(sc.next());
        System.out.println("Cor: " + c.getCor());

        System.out.print("Digite a marca do veículo:");
        c.setMarca(sc.next());
        System.out.println("Marca: " + c.getMarca());

        System.out.print("Digite a placa do veículo:");
        c.setPlaca(sc.next());
        System.out.println("Placa: " + c.getPlaca());


        c.ligar();
        c.acelerar();
        c.frear();
        c.desligar();
         sc.close();

    }
}