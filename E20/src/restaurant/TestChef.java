package restaurant;

import java.util.*;

public class TestChef {
    public static void main(String[] args) {
        List<Chef> chefs = new ArrayList<>(Arrays.asList(
                new Chef(1, "a", 3.55),
                new Chef(2, "b", .7),
                new Chef(3, "c", 4.25),
                new Chef(4, "d", .7),
                new Chef(5, "e", 2.5)
        ));

        for (var el: chefs){
            System.out.println(el);
        }
        System.out.println("sortwanie... \n");
        Collections.sort(chefs);
        for (var el: chefs){
            System.out.println(el);
        }


    }

}
