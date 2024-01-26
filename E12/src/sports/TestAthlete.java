package sports;

import java.util.Arrays;

public class TestAthlete {
    public static void main(String[] args) {
        Athlete[] athletes = {
           new Athlete("A", "1", new double[] {2.0, 45.0, 723.0 , 2367.3}),
           new Athlete("B", "3", new double[] {3, 3.0, 4 , 32.3}),
           new Athlete("C", "3", new double[] {2.0, 45.0, 723.0 , 2367.3}),
           new Athlete("D", "4", new double[] {42.4, 3213.5, 723.0 , 2367.3}),
        } ;

        for(var el: athletes){
            System.out.println(el);
        }

        Arrays.sort(athletes, new RecordComparator().thenComparing(new NationalityNameComparator()));
        System.out.println("po posortowaniu:");

        for(var el: athletes){
            System.out.println(el);
        }
    }
}
