package lesson6_JuiceMarket;

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
