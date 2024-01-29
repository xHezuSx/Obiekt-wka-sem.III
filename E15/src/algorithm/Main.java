package algorithm;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {

    static <E> void clearIfContains(Collection<E> collection, E element){
        if (collection == null) {return;}
        for (var item: collection){
            if (element.equals(item)){
                collection.clear();
                return;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> collection = new ArrayList<>(Arrays.asList(1,23,4,5,523,4,2,6,23,423));
        System.out.println(collection);
        clearIfContains(collection, 1);
        System.out.println(collection);

    }
}
