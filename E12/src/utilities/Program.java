package utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

    public static <E> void appendFromEnd(List<? extends E> tab1, List<? super E> tab2){
        for (int i = tab1.size()-1; i>=0; i--){
            tab2.add(tab1.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(4,5,6));
        appendFromEnd(arrayList1, arrayList2);
        System.out.println("lista 2:");
        for(var el: arrayList2){
            System.out.println(el);
        }
    }
}
