package lesson2;

public class GreatestValue {

    public static void main(String[] args) {
        int a = 56;
        int b = 18;
        int result = greatestValue(a, b);
        System.out.println("The number " + result + " has the greatest value");
    }

    public static int greatestValue(int n1, int n2) {
        int max;
        if (n1 > n2) max = n1;
        else max = n2;
        return max;
    }
}
