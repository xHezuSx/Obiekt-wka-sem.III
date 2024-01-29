package aviation;

import java.util.ArrayList;
import java.util.Arrays;

public class TestPilot {
    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList<>(Arrays.asList(1.0,5.0,3.,6.,.4,7.,3.));
        Pilot pilot = new Pilot("a", lista);
        System.out.println(pilot);
        Pilot clonePilot = pilot.clone();
        clonePilot.addHours(0.0);
        System.out.println(pilot);
        System.out.println(clonePilot);
    }
}
