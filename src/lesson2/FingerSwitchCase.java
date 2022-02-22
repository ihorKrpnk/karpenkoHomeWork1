package lesson2;

public class FingerSwitchCase {

    public static void main(String[] args) {
        int fingerType = 4;

        switch (fingerType) {
            case 1 -> System.out.println("Thumb");
            case 2 -> System.out.println("Forefinger");
            case 3 -> System.out.println("Middle finger");
            case 4 -> System.out.println("Ring finger");
            case 5 -> System.out.println("Little finger");
            default -> System.out.println("Not a valid finger");
        }
    }
}
