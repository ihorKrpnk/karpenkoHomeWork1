package lesson8_Task1;

import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        int num = 5;
        Scanner input = new Scanner(System.in);
        double[] arr2 = new double[(int) num];

        int i = 0;
        while (i < num) {
            System.out.print("Введи число: ");

            try {
                arr2[i] = Double.parseDouble(input.next());
                i++;
            } catch (NumberFormatException e) {
                System.out.println("шо ты вводишь?!");
            }
        }
        sum(arr2);
    }

    public static void sum(double[] arr) {
        double sum = 0;

        for (double i = 0; i < arr.length; i++) {
            sum += arr[(int) i];
        }
        System.out.println("сумма чисел: " + sum);
    }
}