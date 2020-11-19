import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);

        System.out.println(bigA.add(bigB));
        System.out.println(bigA.multiply(bigB));
    }
}
