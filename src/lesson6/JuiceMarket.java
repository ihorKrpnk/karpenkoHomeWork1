package lesson6;

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

class Fruit {
    private int calories;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void makeJuice() {
        System.out.println("Сік готовий!");
    }
}

class Apple extends Fruit {
    public Apple() {
        setCalories(52);
    }

    public void removeSeeds() {
        System.out.println("Ви обрали яблучний сік! ..видалення кісточок...");
    }

    public void makeJuice() {
        System.out.println("Сік яблучний готовий!");
    }
}

class Banana extends Fruit {
    public Banana() {
        setCalories(89);
    }

    public void peel() {
        System.out.println("\nВи обрали банановий сік!...зараз відбувається очищення банана...");
    }

    public void makeJuice() {
        System.out.println("Сік банановий готовий!");
    }
}

class Orange extends Fruit {
    public Orange() {
        setCalories(47);
    }

    public void cut() {
        System.out.println("\nВи обрали апельсиновий сік!...зараз відбувається поділ навпіл та віджим апельсинів...");
    }

    public void makeJuice() {
        System.out.println("Сік апельсиновий готовий!");
    }
}

class Lemon extends Fruit {
    public Lemon() {
        setCalories(29);
    }

    public void prepare() {
        System.out.println("\nВи обрали лимонний сік!...зараз відбувається розподіл навпіл і видалення кісточок лимона...");
    }

    public void makeJuice() {
        System.out.println("Сік лимонний готовий!");
    }
}