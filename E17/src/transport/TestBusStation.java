package transport;

import java.util.ArrayList;
import java.util.Arrays;

public class TestBusStation {
    public static void main(String[] args) {
        ArrayList<String> busy = new ArrayList<>(Arrays.asList("a","b", "c"));
        BusStation busStation = new BusStation("A", "1", busy);
        InterCityBusStation interCityBusStation = new InterCityBusStation("B", "2", busy, 4);

        System.out.println(busy);
        System.out.println(busStation);
        busStation.addBus("d");
        busStation.addBus("e");
        busStation.removeBus("a");
        System.out.println(busStation);

        interCityBusStation.addBus("XXX");
        System.out.println(interCityBusStation);
    }
}
