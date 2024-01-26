package sports;

import java.util.Comparator;
import java.util.Objects;

public class NationalityNameComparator implements Comparator<Athlete> {
    @Override
    public int compare(Athlete o1, Athlete o2) {
        if(o1.nationality.compareTo(o2.nationality) == 0){
            return o1.name.compareTo(o2.name);
        }
        return o1.nationality.compareTo(o2.nationality);
    }
}
