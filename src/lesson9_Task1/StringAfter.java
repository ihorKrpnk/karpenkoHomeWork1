package lesson9_Task1;

public class StringAfter {
    public static void main(String[] args) {

        String str = "Get a modern feel with a smudge-resistant only for $2.50, you can finish now";
        System.out.println(afterFellInUpperCase(str));
    }

    public static String afterFellInUpperCase(String inputString) {
        inputString = inputString.substring(18, 22);
        String inputStringUp = inputString.toUpperCase();
        return inputStringUp;
    }
}

