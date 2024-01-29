package transport;

public class TestBusRoute {
    public static void main(String[] args) {
        BusRoute b1 = new BusRoute("44444", "A", "B");
        BusRoute b2 = new BusRoute("5647", "C", "D");
        b1.printDetails();
        System.out.println(b1.isLongRoute());
        b2.printDetails();
        System.out.println(b2.isLongRoute());
    }
}
