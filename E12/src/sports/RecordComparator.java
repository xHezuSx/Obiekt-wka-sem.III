package sports;

import java.util.Arrays;
import java.util.Comparator;

public class RecordComparator implements Comparator<Athlete> {
    @Override
    public int compare(Athlete o1, Athlete o2) {
        double record1 = Arrays.stream(o1.records).max().orElse(0);
        double record2 = Arrays.stream(o2.records).max().orElse(0);
        return  Double.compare(record1, record2);
    }
}
