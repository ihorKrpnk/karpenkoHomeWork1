package lesson3;

import java.util.ArrayList;
import java.util.List;

public class SinX {

    public static void main(String[] args) {
        // List<Integer> angles = new ArrayList<>();
        // int angle = 0;

        // while (angle <= 360) {
        //     angles.add(angle);
        //     angle = angle + 10;
        // }
        // for (Integer angl : angles) {
        //     double x = angl * Math.PI / 180;
        //     double y = Math.sin(x);
        //     System.out.println("x: " + angl + ",  sin(x) = " + y);
        //  }
        // }
        for (int angle = 0; angle <= 360; angle = angle + 10) {
            double x = angle * Math.PI / 180;
            double y = Math.sin(x);
            System.out.println("x = " + angle + ",  sin(x) = " + y);
        }
    }
}

