package lesson6_JuiceMarket;

public class JuiceMarket {

    public static void main(String[] args) {

        Apple apple = new Apple();
        apple.removeSeeds();
        apple.makeJuice();
        System.out.println("Кількість кілокалорій на 100 г: " + apple.getCalories());
        Banana banana = new Banana();
        banana.peel();
        banana.makeJuice();
        System.out.println("Кількість кілокалорій на 100 г: " + banana.getCalories());
        Orange orange = new Orange();
        orange.cut();
        orange.makeJuice();
        System.out.println("Кількість кілокалорій на 100 г: " + orange.getCalories());
        Lemon lemon = new Lemon();
        lemon.prepare();
        lemon.makeJuice();
        System.out.println("Кількість кілокалорій на 100 г: " + lemon.getCalories());
    }
}

