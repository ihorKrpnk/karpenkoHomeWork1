package lesson6_JuiceMarket;

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