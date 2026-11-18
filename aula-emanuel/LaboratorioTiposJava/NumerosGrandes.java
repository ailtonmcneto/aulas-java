import java.math.BigInteger;

public class NumerosGrandes {

    public static void main(String[] args) {

    int n1 = Integer.MAX_VALUE;

    long n2 = Long.MAX_VALUE;

    BigInteger n3 = new BigInteger(

    "999999999999999999999999999999");

    System.out.println(n1 + 1);

    System.out.println(n2 + 1);

    System.out.println(n3.add(BigInteger.ONE));

    System.out.println(n3.multiply(

    BigInteger.valueOf(1000)));
    }
}