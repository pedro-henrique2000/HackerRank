import java.math.BigDecimal;
import java.util.Comparator;

public class BigDecimalComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        BigDecimal a = new BigDecimal(o1);
        BigDecimal b = new BigDecimal(o2);
        return b.compareTo(a);
    }
}
