package lesson9_Task1;

public class StringAfter {
    public static void main(String[] args) {

        String str = "Get a modern feel with a smudge-resistant only for $2.50, you can finish now";
        System.out.println(afterFellInUpperCase(str));
    }

    public static String afterFellInUpperCase(String inputString) {
        String[] splitted = inputString.split("\\s+");
        for (int i = 0; i < splitted.length; i++) {
            if (splitted[i].equals("feel")) {
                return splitted[i + 1].toUpperCase();
            }
        }
        return inputString;
    }
}