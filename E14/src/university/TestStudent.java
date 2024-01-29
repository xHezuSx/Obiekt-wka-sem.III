package university;

import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {
        Student[] students = {
                new Student("A", 3.3, 2),
                new Student("B", 5.0, 1),
                new Student("C", 2.5, 2),
                new Student("D", 3.3, 3),
        };
        System.out.println("przed sortowaniem: ");
        for (var el: students){
            System.out.println(el);
        }
        Arrays.sort(students);
        System.out.println("\npo sortowaniu: ");
        for (var el: students){
            System.out.println(el);
        }
    }
}
