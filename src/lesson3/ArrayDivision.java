package lesson3;

public class ArrayDivision {

    public static void main(String[] args) {

        int[] arrayNumbers = {5, 6, 22, 9, 10, 4, 8};
        int amount = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] % 2 == 0 && arrayNumbers[i] % 3 != 0)
                amount++;
        }
        System.out.println("Number of array elements that are divisible by 2 but not divisible by 3 is: " + amount);
    }
}
