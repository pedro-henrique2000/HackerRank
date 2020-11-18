import java.util.Scanner;

public class Array2D {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }


        int sum = 0;
        int maior = Integer.MIN_VALUE;
        for(int j = 0; j < 4; j++) {
            for(int i = 0 ; i < 4; i++) {
                sum = somar(arr, i, j);
                maior = Math.max(sum, maior);
            }
        }
        System.out.println(maior);

        scanner.close();
    }

    private static int somar(int[][] arr, int i, int j) {
        return  arr[j][i] + arr[j][i + 1] +
                arr[j][i + 2] + arr[j + 1][i + 1] +arr[j + 2][i] +
                arr[j + 2][i + 1] +
                arr[j + 2][i + 2];
    }
}

