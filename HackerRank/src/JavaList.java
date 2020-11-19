import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int num;

        for(int i = 0; i < n; i++) {
            num = sc.nextInt();
            list.add(num);
        }

        int q = sc.nextInt();
        String query;
        int index;

        for(int i = 0; i < q; i++) {
            query = sc.next();
            switch(query.toLowerCase()) {
                case "insert":
                    index = sc.nextInt();
                    num = sc.nextInt();
                    list.add(index, num);
                    break;
                case "delete":
                    index = sc.nextInt();
                    list.remove(index);
                    break;
            }
        }

        list.forEach(number -> System.out.print(number + " "));

    }
}
