package lesson9_Task2;

public class StringWithout {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "abc";
        String str3 = "0";
        System.out.println(withoutFirstAndLastChar(str1));
        System.out.println(withoutFirstAndLastChar(str2));
        System.out.println(withoutFirstAndLastChar(str3));
    }

    public static String withoutFirstAndLastChar(String inputString) {
        if (inputString.length() <= 1) {
            System.out.println("Введи строку более одного символа!");
            return inputString;
        }
        return inputString.substring(1, inputString.length() - 1);
    }
}
