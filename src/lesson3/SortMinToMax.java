package lesson3;

import java.util.Arrays;

public class SortMinToMax {

    public static void main(String[] args) {
        int[] myNumbers = new int[]{85, 1, 2, 5, 38, 4568, 122589, 89};
        insertionSort(myNumbers);
        System.out.println(Arrays.toString(myNumbers));
    }
    public static void insertionSort(int[] myNumbers) {
        for (int i = 1; i < myNumbers.length; i++) {
            int current = myNumbers[i];
            int j = i;
            while (j > 0 && myNumbers[j - 1] > current) {
                myNumbers[j] = myNumbers[j - 1];
                j--;
            }
            myNumbers[j] = current;
        }
    }
}




