package student;

public record StudentRecord(String name, String id, double gpa) {
    public StudentRecord {
        if (gpa<0.0 || gpa>4.0){
            throw new IllegalArgumentException();
        }
    }

    boolean isHonorStudent() {
        return gpa>=3.5;
    }
    void printDetails(){
        System.out.println("student: ["+name+"]. ID: ["+id+"]. Średnia: ["+gpa+"].");
    }
}
