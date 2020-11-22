import sun.misc.Perf;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    PerformOperation isOdd() {
        return (int a) -> a % 2 != 0;
    }

    PerformOperation isPrime() {
        return (int a) -> {
            boolean isPrime = true;
            if (a < 2)
                return false;

            for (int i = 2; i < a / 2; i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            return isPrime;
        };
    }

    PerformOperation isPalindrome() {
        return (int a) -> {
            String numberToString = String.valueOf(a);
            for (int i = 0; i < numberToString.length() / 2; i++) {
                if (numberToString.charAt(i) != numberToString.charAt(numberToString.length() - 1 - i))
                    return false;
            }
            return true;
        };
    }
}

public class JavaLambda {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}