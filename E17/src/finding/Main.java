package finding;

public class Main {

    static <T> T findFirstNonNull(T[] tab){
        for (var el: tab){
            if (el != null){
                return el;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Integer[] tab = {null,null,null,null};
        Integer x = findFirstNonNull(tab);
        System.out.println(x);
    }
}
