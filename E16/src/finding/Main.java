package finding;

import java.util.HashMap;
import java.util.Map;

public class Main {

    static <K,V> V findValueByKey(HashMap<K,V> mapa, K key){
        if (key == null)    {return null;}
        try {
            return mapa.get(key);
        }
        catch (Exception e){
            return null;
        }
    }

    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "a");
        mapa.put(2, "b");
        mapa.put(333, "c");
        mapa.put(4, "d");

        String val = findValueByKey(mapa, 3);
        System.out.println(val);
    }
}
