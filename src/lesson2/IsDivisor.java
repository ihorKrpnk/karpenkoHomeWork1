package lesson2;

public class IsDivisor {

    public static void main(String[] args) {
        int a = 3;
        int b = 9;

        if ((b % a) == 0) {
            System.out.println("A is a divisor of B");
        } else {
            System.out.println("A isn't a divisor of B");
        }
    }
}
