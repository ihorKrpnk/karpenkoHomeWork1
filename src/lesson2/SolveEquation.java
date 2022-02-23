package lesson2;

public class SolveEquation {

    public static void main(String[] args) {
        int a = 3;
        int b = -6;

        if ((a == 0) || (b == 0)) {
            System.out.println("Equation has no root OR an infinite number of roots");
        } else {
            System.out.println("X = " + -b / a);
        }
    }
}
