package utilities;

public class Main {

    static <T extends Comparable<T>> int countLessThan0OrEqual(T[] tab, T obj){
        int counter = 0;
        for (int i=0; i< tab.length;i++){
            if (tab[i].compareTo(obj)<=0){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Person[] tab = {
                new Person("A", 0),
                new Person("B", 2),
                new Person("C", 4),
                new Person("D", 23),
                new Person("E", 60)
        };

        int x = countLessThan0OrEqual(tab, new Person("F", 23));
        System.out.println(x);
    }
}
