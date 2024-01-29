package aviation;

import java.util.Arrays;

public class Pilot implements Cloneable{
    String name;
    double[] flightHours = new double[5];

    public Pilot(String name, double[] flightHours) {
        this.name = name;
        this.flightHours = flightHours;
    }

    @Override
    public Pilot clone() {
        try {
            Pilot clone = (Pilot) super.clone();
            clone.flightHours = flightHours.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                ", flightHours=" + Arrays.toString(flightHours) +
                '}';
    }
}
