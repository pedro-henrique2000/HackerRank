import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>(n);
        int d, number;

        for (int i = 0; i < n; i++) {
            d = sc.nextInt();
            arrayList.add(new ArrayList<>());
            for (int j = 0; j < d; j++) {
                number = sc.nextInt();
                arrayList.get(i).add(number);
            }
        }

        n = sc.nextInt();
        int linha, coluna;

        for (int i = 0; i < n; i++) {
            linha = sc.nextInt() - 1;
            coluna = sc.nextInt() - 1;
            try {
                System.out.println(arrayList.get(linha).get(coluna));
                ;
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
