import java.math.BigDecimal;

public class Valores {

    public static void main(String[] args) {

    float preco1 = 19.90f;

    double preco2 = 19.90;

    BigDecimal preco3 = new BigDecimal("19.90");

    System.out.println(preco1);

    System.out.println(preco2);

    System.out.println(preco3);

    System.out.println(0.1 + 0.2);

    BigDecimal a = new BigDecimal("0.1");

    BigDecimal b = new BigDecimal("0.2");

    System.out.println(a.add(b));

    }
}