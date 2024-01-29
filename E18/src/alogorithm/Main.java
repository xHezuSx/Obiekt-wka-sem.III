package alogorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    static <T> T atIndex(Iterator<T> iterator, int index){
        int i = 0;
        for (Iterator<T> it = iterator; it.hasNext(); ) {
            var item = it.next();
            if (i == index){
                return item;
            }
            i++;
        }
        return null;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1,23,0,4,23,43,45,346,45,64,56));
        Integer x = atIndex(lista.iterator(), 3);
        System.out.println(x);
    }
}
