package moto;

public class Vehicle implements Comparable<Vehicle>{
    String model;
    int speed;

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public int compareTo(Vehicle o) {
        return Integer.compare(speed, o.speed);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }
}
