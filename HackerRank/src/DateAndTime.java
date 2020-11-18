import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
public class DateAndTime {
    public static void main(String[] args) {
        LocalDate local = LocalDate.of(2000, 9, 25);
        System.out.println(local.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.US).toUpperCase());
    }
}