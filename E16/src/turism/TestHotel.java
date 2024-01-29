package turism;

public class TestHotel {
    public static void main(String[] args) {
        Hotel h1 = new Hotel("A", 40.4);
        Hotel h2 = h1.clone();
        System.out.println(h1);
        System.out.println(h2);
        h2.name = "B";
        h2.capacity = 20.5;
        System.out.println(h1);
        System.out.println(h2);

    }
}
