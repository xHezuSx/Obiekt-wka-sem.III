package turism;

public class Hotel implements Cloneable{
    String name;
    double capacity;

    public Hotel(String name, double capacity) {
        if (name == null) { this.name = ""; }
        else { this.name = name; }
        if (capacity<0) { this.capacity = 50.0; }
        else    { this.capacity = capacity; }
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }


    @Override
    public Hotel clone() {
        try {
            Hotel clone = (Hotel) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
