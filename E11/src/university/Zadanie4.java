package university;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Zadanie4 {

    public static <T> int countElements(Iterator<T> items, T element){
        int counter = 0;
        for (Iterator<T> it = items; it.hasNext(); ) {
            var item = it.next();
            if (item.equals(element)){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(
                new Student("A", 12.0),
                new Student("B", 3.0),
                new Student("B", 3.0),
                new Student("C", 75.0),
                new Student("D", 34.0)));

        Student s1 = new Student("B", 3.0);
        int howMany = countElements(students.iterator(), s1);
        System.out.println(howMany);
    }
}
