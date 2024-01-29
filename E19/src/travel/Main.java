package travel;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TravelItem[] travelItems = {
                new TravelItem("A", 12.0, 1.5),
                new TravelItem("B", 5.2, 3.0),
                new TravelItem("C", 3.0, 2.1),
                new TravelItem("D", 1.04, 5.3),
        };

        for (var x: travelItems){
            System.out.println(x);
        }

        Arrays.sort(travelItems);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        for (var x: travelItems){
            System.out.println(x);
        }
    }
}
