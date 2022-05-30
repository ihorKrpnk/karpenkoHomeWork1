package lesson3;

public class SinX {

    public static void main(String[] args) {

        for (int angle = 0; angle <= 360; angle = angle + 10) {
            double x = angle * Math.PI / 180;
            double y = Math.sin(x);
            System.out.println("x = " + angle + ",  sin(x) = " + y);
        }
    }
}

