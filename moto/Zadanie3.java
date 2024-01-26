package moto;

public class Zadanie3 {

    public static <T extends Comparable<T>> T maxValue(T[] tab){
        if (tab == null || tab.length == 0) { return null; }
        T max = tab[0];
        for(int i=0; i<tab.length; i++) { if(tab[i].compareTo(max)>0) { max = tab[i]; }}
        return max;
    }

    public static void main(String[] args) {
        Vehicle[] tab = {
                new Vehicle("A", 29),
                new Vehicle("B", 50),
                new Vehicle("C", 170),
                new Vehicle("D", 99),
        };
        Vehicle max = maxValue(tab);
        System.out.println(max);
    }
}
