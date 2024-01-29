package university;

import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "a", 3.0),
                new Student(2, "a", 4.0),
                new Student(3, "a", 2.0),
                new Student(4, "a", 3.0),
        };

        for (var el: students){
            System.out.println(el);
        }
        Arrays.sort(students, new AverageGradeComparator().thenComparing(new IdComparator()));

        System.out.println("po sortowaniu:");
        for (var el: students){
            System.out.println(el);
        }
    }
}
