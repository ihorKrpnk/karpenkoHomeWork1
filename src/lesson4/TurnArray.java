package lesson4;

import java.util.Arrays;

public class TurnArray {

    public static void main(String[] args) {

        int[] arrayNumbers = {1, 89, 79, 454, 654635, 6878, 54, 45, 57, 6, 7, 99};
        reverseArray(arrayNumbers);
    }
    public static void reverseArray(int[] arrayNumbers) {
        for (int i = 0; i < arrayNumbers.length / 2; i++) {
            int temp = arrayNumbers[i];
            arrayNumbers[i] = arrayNumbers[arrayNumbers.length - i - 1];
            arrayNumbers[arrayNumbers.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arrayNumbers));
    }
}