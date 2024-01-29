package utilities;

public class Person implements Comparable<Person>{
    String name;
    int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(age, o.age);
    }
}
