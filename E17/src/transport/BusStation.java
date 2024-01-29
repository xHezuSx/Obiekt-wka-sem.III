package transport;

import java.util.ArrayList;
import java.util.Objects;

public class BusStation {
    private String name;
    private String city;
    private ArrayList<String> buses = new ArrayList<>();

    public BusStation(String name, String city, ArrayList<String> buses) {
        this.name = name;
        this.city = city;
        this.buses.addAll(buses);
    }

    void addBus(String bus){
        buses.add(bus);
    }
    void removeBus(String bus){
        buses.remove(bus);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getBuses() {
        return buses;
    }

    public void setBuses(ArrayList<String> buses) {
        this.buses.addAll(buses);
    }

    @Override
    public String toString() {
        return "BusStation{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", buses=" + buses +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusStation that = (BusStation) o;
        return Objects.equals(name, that.name) && Objects.equals(city, that.city) && Objects.equals(buses, that.buses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city, buses);
    }
}
