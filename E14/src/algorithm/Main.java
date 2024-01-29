package algorithm;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    static <E> boolean contains(ArrayList<E> lista, E item){
        for (var el: lista){
            if (el.equals(item)){
                return true;
            }
        }
        return false;
    }
    static <K, V> int countUniqueKeys(HashMap<K, V> mapa){
        int counter = 0;
        ArrayList<K> lista = new ArrayList<>();
        for (K key: mapa.keySet()){
            if(!contains(lista, key)){
                counter++;
                lista.add(key);
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        HashMap<Person, Integer> mapa = new HashMap<>();
        mapa.put(new Person("A"), 1);
        mapa.put(new Person("A"), 2);
        mapa.put(new Person("C"), 3);
        mapa.put(new Person("D"), 4);

        int x = countUniqueKeys(mapa);
        System.out.println(x);
    }
}
