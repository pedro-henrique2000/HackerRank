import java.util.HashMap;
import java.util.Map;

public class Anagrams {

    public static void main(String[] args) {

        boolean ret = isAnagram("anagramm", "marganaa");
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }


    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        a = a.toLowerCase();
        b = b.toLowerCase();

        int[] frequency = new int[26];

        for(int i = 0; i < a.length(); i++) {
            char letter = a.charAt(i);
            int index = letter- 'a';
            frequency[index]++;
        }

        for(int i = 0; i < b.length(); i++) {
            char letter = b.charAt(i);
            int index = letter- 'a';
            frequency[index]++;
        }

        for(int i = 0; i < 26; i++) {
            if(frequency[i] != 0 && frequency[i] % 2 != 0)
                return false;
        }


        return true;
    }
}
