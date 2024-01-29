package healthcare;

import java.util.Objects;

public class Clinic extends Hospital{
    double rating;
    public Clinic(String name, double capacity, double rating) {
        super(name, capacity);
        if (rating < 0.0 || rating > 5.0)   {this.rating = 3.0;}
        else this.rating = rating;
    }

    public void setRating(double rating) {
        if (rating < 0.0 || rating > 5.0 )   {this.rating = 3.0;}
    }

    public double getRating() {
        return this.rating;
    }

    @Override
    public String toString() {
        if (getName()==null || getName().isEmpty()){
            return "[Clinic]: Capacity: ["+getCapacity()+"].\n" +
                    "Rating: ["+getRating()+"].";
        }
        return "[Clinic]: Name: ["+getName()+"]. Capacity: ["+getCapacity()+"].\n" +
                "Rating: ["+getRating()+"].";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Clinic clinic = (Clinic) o;
        return Double.compare(rating, clinic.rating) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rating);
    }
}
