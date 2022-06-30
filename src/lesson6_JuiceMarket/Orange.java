package lesson6_JuiceMarket;

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
