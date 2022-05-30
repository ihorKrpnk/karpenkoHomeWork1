package lesson3;

public class ArrayMin {

    public static void main(String[] args) {
        double[] myNumbers = {85, 1, 2, 5, 38, 4568, 122589.2, 89};
        double min = myNumbers[0];
        for (int i = 1; i < myNumbers.length; i++) {
            if (myNumbers[i] < min) min = myNumbers[i];
        }
        System.out.println("Minimum number: " + min);
    }
}
