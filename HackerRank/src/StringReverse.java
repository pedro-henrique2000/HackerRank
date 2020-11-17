import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        String reverse = "";

        for(int i = A.length() - 1; 0 <= i; i--) {
            reverse += A.charAt(i);
        }

        System.out.println(A.equalsIgnoreCase(reverse) ? "Yes" : "No");

    }




}
