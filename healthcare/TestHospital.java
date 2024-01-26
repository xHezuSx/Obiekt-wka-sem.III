package healthcare;

public class TestHospital {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("A", 13.5);
        Hospital h2 = new Hospital("B", 200);
        Hospital h3 = new Hospital("C", -30.5);
        Hospital h4 = new Hospital("", 15);
        Hospital h5 = new Hospital(null, 50);

        Clinic c1 = new Clinic("D", 120.5, 4.5);
        Clinic c2 = new Clinic("E", 230.5, 2);
        Clinic c3 = new Clinic("F", 170.5, -3);
        Clinic c4 = new Clinic(null, 1320.5, 6);
        Clinic c5 = new Clinic("", 14.5, 5);

        System.out.println(h1.equals(h2));
        System.out.println(h2.equals(h1));
        System.out.println(h1.equals(c1));
        System.out.println(h1.equals(h1));
        System.out.println(c1.equals(h1));
    }
}
