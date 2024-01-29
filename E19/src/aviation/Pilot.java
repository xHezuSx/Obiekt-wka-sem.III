package aviation;

import java.util.ArrayList;

public class Pilot implements Cloneable{
    private String name;
    private ArrayList<Double> flightHours = new ArrayList<>();

    public Pilot(String name, ArrayList<Double> flightHours) {
        this.name = name;
        this.flightHours.addAll(flightHours);
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                ", flightHours=" + flightHours +
                '}';
    }

    void addHours(double item){
        this.flightHours.add(item);
    }

    @Override
    public Pilot clone() {
        try {
            Pilot clone = (Pilot) super.clone();
            clone.flightHours = new ArrayList<>(this.flightHours);
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
