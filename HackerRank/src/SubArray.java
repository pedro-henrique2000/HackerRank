import java.util.Scanner;

public class SubArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int number, sum;
        int counter = 0;

        for(int i = 0; i < n; i++) {
            number = sc.nextInt();
            array[i] = number;
            if(number < 0)
                counter++;
        }

        for(int i = 0; i < n; i++) {
            for(int k = array.length - 1; k > i; k--) {
                sum = array[i];
                for(int j = k; j > i; j--) {
                    sum += array[j];
                }
                if(sum < 0)
                    counter++;
            }
        }

        System.out.println(counter);
    }

}
