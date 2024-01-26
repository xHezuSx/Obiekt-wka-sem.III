package algorithm;

public class Projekt {
    static <T> boolean compareThree(T first, T second, T third){
        return first.equals(second) && second.equals(third);
    }

    public static void main(String[] args) {
        Student student1 = new Student("A", 2.4f);
        Student student2 = new Student("B", 2.4f);
        Student student3 = new Student("B", 3.56f);

        System.out.println(compareThree(student1,student1,student1));
    }
}
