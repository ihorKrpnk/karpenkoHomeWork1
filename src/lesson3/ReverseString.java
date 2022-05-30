package lesson3;

public class ReverseString {

    public static void main(String[] args) {
        String text = "oeoepweopwieporeipoweurpour12+6";
        char[] reverseArray = text.toCharArray();
        System.out.println("Array in reverse order: ");
        for (int i = reverseArray.length - 1; i >= 0; i--) {
            System.out.print(reverseArray[i]);
        }
    }

}
