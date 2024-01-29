package comparisons;

public class Main {

    static <T extends Comparable<T>> boolean isFirstLargest(T a, T b, T c){
        return a.compareTo(b) > 0 && a.compareTo(c) > 0;
    }

    public static void main(String[] args) {
        System.out.println(isFirstLargest("3", "2", "1"));
        System.out.println(isFirstLargest("1", "2", "3"));
    }
}
