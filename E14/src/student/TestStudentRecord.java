package student;

public class TestStudentRecord {
    public static void main(String[] args) {
        StudentRecord s1 = new StudentRecord("A", "1", 3.4);
        StudentRecord s2 = new StudentRecord("B","2", 3.9);
        s1.printDetails();
        s2.printDetails();
        System.out.println("student pierwszy: "+s1.isHonorStudent());
        System.out.println("student drugi: "+s2.isHonorStudent());
    }
}
