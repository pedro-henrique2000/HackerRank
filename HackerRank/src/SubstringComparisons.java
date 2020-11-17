
public class SubstringComparisons {

    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcometojava", 3));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, 0 + k);
        String largest = s.substring(0, 0 + k);

        String substring = "";

        for(int i = 1; i + k <= s.length(); i++) {
            substring = s.substring(i, i + k);

            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }

        return smallest + "\n" + largest;
    }
}
