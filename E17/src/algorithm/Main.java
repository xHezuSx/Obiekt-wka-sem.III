package algorithm;

import java.util.HashMap;
import java.util.Map;

public class Main {

    static <K,V> String mapToString(HashMap<K,V> map){
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<K,V> entry: map.entrySet()){
            sb.append(entry.getKey()+":"+entry.getValue()+", ");
        }
        if(!sb.isEmpty()){
            sb.deleteCharAt(sb.length()-1);
            sb.deleteCharAt(sb.length()-1);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        HashMap<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("a"));
        map.put(2, new Person("b"));
        map.put(3, new Person("c"));
        map.put(4, new Person("d"));
        System.out.println(mapToString(map));
    }
}
