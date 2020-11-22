import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaExceptionHandling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, result;

        try {
            x = sc.nextInt();
            y = sc.nextInt();
            result = x / y;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }

    }
}
