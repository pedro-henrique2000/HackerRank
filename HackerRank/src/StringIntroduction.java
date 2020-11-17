import java.util.Scanner;

public class StringIntroduction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out.println(A.length() + B.length());
        System.out.println(A.charAt(0) > B.charAt(0) ? "Yes" : "No");

        String primeiraString = Character.toUpperCase(A.charAt(0)) + A.substring(1);
        String segundaString = Character.toUpperCase(B.charAt(0)) + B.substring(1);

        System.out.println(String.format("%s %s", primeiraString, segundaString));
    }

}
