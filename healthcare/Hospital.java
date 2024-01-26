package healthcare;

import java.util.Objects;

public class Hospital {
    private String name;
    private double capacity;

    public Hospital(String name, double capacity) {
        this.name = Objects.requireNonNullElse(name, "");
        if (capacity > 0)   { this.capacity = capacity; }
        else this.capacity = 50;
    }

    public void setCapacity(double capacity) {
        if (capacity > 0)   { this.capacity = capacity; }
        else this.capacity = 50;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.name = Objects.requireNonNullElse(name, "");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if (name == null || name.isEmpty())
        {
            return "[Hospital]. Capacity: ["+capacity+"].";
        }
        return "[Hospital] Name: ["+name+"]. Capacity: ["+capacity+"].";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospital hospital = (Hospital) o;
        return Double.compare(capacity, hospital.capacity) == 0 && Objects.equals(name, hospital.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity);
    }
}
