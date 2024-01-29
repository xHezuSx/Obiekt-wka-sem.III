package restaurant;

import java.util.Comparator;

public class Chef implements Comparable<Chef> {
    int id;
    String name;
    double skillLevel;

    public Chef(int id, String name, double skillLevel) {
        this.id = id;
        this.name = name;
        this.skillLevel = skillLevel;
    }


    @Override
    public String toString() {
        return "Chef{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", skillLevel=" + skillLevel +
                '}';
    }

    @Override
    public int compareTo(Chef o) {
        if (Double.compare(skillLevel, o.skillLevel) == 0){
            return name.compareTo(o.name);
        }
        return Double.compare(o.skillLevel, skillLevel);
    }
}
