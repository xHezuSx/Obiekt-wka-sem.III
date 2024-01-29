package university;

public record Student(String name, double avgGrade, int yearOfStudy) implements Comparable<Student>{

    @Override
    public int compareTo(Student o) {
        if (Double.compare(avgGrade, o.avgGrade) == 0){
            return Integer.compare(yearOfStudy, o.yearOfStudy);
        }
        return Double.compare(o.avgGrade, avgGrade);
    }
}
