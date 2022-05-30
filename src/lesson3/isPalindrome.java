package lesson3;

public class isPalindrome {

    public static void main(String[] args) {

        if (isPalindr()) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("It's not a palindrome!");
        }
    }

    public static boolean isPalindr() {
        char[] arrayOfChars = "0totot1".toCharArray();
        int left = 0, right = arrayOfChars.length - 1;
        while (left < right) {
            if (arrayOfChars[left++] != arrayOfChars[right--])
                return false;
        }
        return true;
    }

}
