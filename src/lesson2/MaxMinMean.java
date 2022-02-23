package lesson2;

public class MaxMinMean {

    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int z = -1;
        int maxNumxy = Math.max(x, y);
        int minNumxy = Math.min(x, y);

        System.out.println("Max number is: " + Math.max(z, maxNumxy));
        System.out.println("Min number is: " + Math.min(z, minNumxy));

        if (x > y && x > z && y > z) {
            System.out.println("Mean number is: " + y);
        } else if (x > y && x > z && z > y) {
            System.out.println("Mean number is: " + z);
        } else if (y > x && y > z && x > z) {
            System.out.println("Mean number is: " + x);
        } else if (y > x && y > z && z > x) {
            System.out.println("Mean number is: " + z);
        } else if (z > x && z > y && x > y) {
            System.out.println("Mean number is: " + x);
        } else if (z > x && z > y && y > x) {
            System.out.println("Mean number is: " + y);
        }
    }
}


