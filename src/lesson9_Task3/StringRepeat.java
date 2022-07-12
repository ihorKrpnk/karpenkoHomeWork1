package lesson9_Task3;

public class StringRepeat {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Chocolate";
        String str3 = "abc";
        System.out.println(repeatRepeatRepeat(str1));
        System.out.println(repeatRepeatRepeat(str2));
        System.out.println(repeatRepeatRepeat(str3));
    }

    public static String repeatRepeatRepeat(String inputString) {
        if (inputString.length() <= 3) {
            return inputString;
        }
        inputString = inputString.substring(0, 3);
        return String.join(inputString, inputString, inputString);
    }
}
