import java.util.Arrays;
import java.util.Scanner;

public class BigDecimalExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        BigDecimalComparator comparator = new BigDecimalComparator();

        Arrays.sort(s, 0, n, comparator);

        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}

