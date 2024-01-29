package music;

import java.util.ArrayList;
import java.util.Objects;

public class VinyStore extends MusicStore{
    int numbersOfVinyls;
    public VinyStore(String name, String city, ArrayList<String> albums, int numbersOfVinyls) {
        super(name, city, albums);
        this.numbersOfVinyls = numbersOfVinyls;
    }

    public int getNumbersOfVinyls() {
        return numbersOfVinyls;
    }

    public void setNumbersOfVinyls(int numbersOfVinyls) {
        this.numbersOfVinyls = numbersOfVinyls;
    }

    @Override
    public String toString() {
        return super.toString()+" numbersOfVinyls: "+getNumbersOfVinyls();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        VinyStore vinyStore = (VinyStore) o;
        return numbersOfVinyls == vinyStore.numbersOfVinyls;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numbersOfVinyls);
    }
}
