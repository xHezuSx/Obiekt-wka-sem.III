package arrayAlg;

import java.util.Comparator;

public class Main {
    static <T extends Comparable<T>> int findMaxIndex(T[] tab){
        if (tab==null || tab.length == 0){
            throw new IllegalArgumentException();
        }
        T min = tab[0];
        int index = 0;
        for (int i = 1; i < tab.length; i++) {
            if (tab[i].compareTo(min)<0){
                min = tab[i];
                index = i;
            }
        }
        return index;
    }

}
