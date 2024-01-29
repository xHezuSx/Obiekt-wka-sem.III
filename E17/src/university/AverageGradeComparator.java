package university;

import java.util.Comparator;

public class AverageGradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.averageGrade(), o1.averageGrade());
    }
}
