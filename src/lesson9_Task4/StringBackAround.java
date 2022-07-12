package lesson9_Task4;

public class StringBackAround {
    public static void main(String[] args) {
        String str1 = "cat";
        String str2 = "Hello";
        String str3 = "a";
        System.out.println(backAround(str1));
        System.out.println(backAround(str2));
        System.out.println(backAround(str3));
    }

    public static String backAround(String str) {
        char lastChar = str.charAt(str.length() - 1);
        return String.join(str, String.valueOf(lastChar), String.valueOf(lastChar));
    }
}
