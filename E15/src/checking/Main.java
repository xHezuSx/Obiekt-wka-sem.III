package checking;

import java.util.ArrayList;

public class Main {

    static <T> boolean isEqualOrNull(T a, T b){
        try {
            if (a == null && b == null) { return true; }
            else return a.equals(b);
        }
        catch (Exception e){
            return false;
        }
    }

    public static void main(String[] args) {

        boolean z = isEqualOrNull(null, null);
        System.out.println(z);
    }
}
