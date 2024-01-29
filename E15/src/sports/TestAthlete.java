package sports;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestAthlete {
    public static void main(String[] args) {
        ArrayList<Athlete> athletes = new ArrayList<>(Arrays.asList(
                new Athlete("A", "1", 3),
                new Athlete("B", "2", 1),
                new Athlete("C", "3", 2),
                new Athlete("D", "4", 3)));
        System.out.println("przed posortowaniem:");
        for (var el: athletes){
            System.out.println(el);
        }
        Collections.sort(athletes);
        System.out.println("\npo posortowaniu:");
        for (var el: athletes){
            System.out.println(el);
        }
    }
}
