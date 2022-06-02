package lesson3;

public class ArrayFlip {

    public static void main(String[] args) {

        int arrayNumbers[] = new int[8];
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = (int) (Math.random() * 100);
            System.out.println("Element #" + i + " = " + arrayNumbers[i] + ";  ");
        }
        System.out.println("\nAfter flipping the array:");

        for (int i = 0; i < arrayNumbers.length / 2; i++) {
            int temp = arrayNumbers[i];
            arrayNumbers[i] = arrayNumbers[arrayNumbers.length - i - 1];
            arrayNumbers[arrayNumbers.length - i - 1] = temp;
            System.out.println("Element #" + i + " = " + arrayNumbers[i] + ";  ");
        }
    }
}