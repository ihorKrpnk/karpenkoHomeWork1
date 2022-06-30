package lesson6_JuiceMarket;

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
