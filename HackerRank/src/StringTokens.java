import java.util.Arrays;
import java.util.Scanner;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        if (s.trim().length()==0 || s.trim().length()>400000){
            System.out.println(0);
            return;
        }
        String[] words = s.split("[\\s,?'!_.@]+");
        System.out.println(words.length);
        Arrays.asList(words).forEach(System.out::println);
        scan.close();
    }

}
