package algorithm;
import java.awt.image.CropImageFilter;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    static <K, V> String mapToString(TreeMap<K, V> treeMap){
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<K,V> entry: treeMap.entrySet()){
            K key = entry.getKey();
            V value = entry.getValue();
            sb.append(key+":"+value+", ");
        }
        if (!sb.isEmpty()){
            sb.delete(sb.length()-2, sb.length());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        TreeMap<Integer, Person> treeMap = new TreeMap<>();
        treeMap.put(1, new Person("a"));
        treeMap.put(2, new Person("b"));
        treeMap.put(3, new Person("c"));
        treeMap.put(4, new Person("d"));
        treeMap.put(5, new Person("e"));

        System.out.println(mapToString(treeMap));
    }
}
