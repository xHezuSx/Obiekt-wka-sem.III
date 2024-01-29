package sports;

import java.util.Arrays;

public class FootvallPlayer implements Cloneable{
    private String name;
    int[] goals = new int[5];

    public FootvallPlayer(String name, int[] goals) {
        this.name = name;
        this.goals = goals;
    }

    @Override
    public FootvallPlayer clone() {
        try {
            FootvallPlayer clone = (FootvallPlayer) super.clone();
            clone.goals = goals.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "FootvallPlayer{" +
                "name='" + name + '\'' +
                ", goals=" + Arrays.toString(goals) +
                '}';
    }
}
