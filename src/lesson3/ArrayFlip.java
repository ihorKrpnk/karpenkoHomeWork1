package lesson3;

public class ArrayFlip {

    public static void main(String[] args) {

        int arrayNumbers[] = new int[10];
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = (int) (Math.random() * 100);
            System.out.println("Element #" + i + " = " + arrayNumbers[i] + ";  ");
        }
        System.out.println("\nAfter flipping the array:");
        for (int i = arrayNumbers.length - 1, j = 0; i >= 0; i--, j++) {
            System.out.println("Element #" + i + " = " + arrayNumbers[i] + ";  ");
        }
    }
}
