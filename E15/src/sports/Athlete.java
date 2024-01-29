package sports;

public class Athlete implements Comparable<Athlete>{
    String name;
    String sport;
    int yearOfAchievement;

    public Athlete(String name, String sport, int yearOfAchievement) {
        this.name = name;
        this.sport = sport;
        this.yearOfAchievement = yearOfAchievement;
    }

    @Override
    public int compareTo(Athlete o) {
        return Integer.compare(yearOfAchievement, o.yearOfAchievement);
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", sport='" + sport + '\'' +
                ", yearOfAchievement=" + yearOfAchievement +
                '}';
    }
}
