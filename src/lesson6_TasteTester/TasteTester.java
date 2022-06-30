package lesson6_TasteTester;

public class TasteTester {
    public static void main(String[] args) {
        BirthdayCake birthdayCake = new BirthdayCake();
        System.out.println("Order #001: \nBirthday Cake; \ntaste - " + birthdayCake.getTaste() +
                "; \nnumber of candles - " + birthdayCake.getCandles() +
                "; \nprice - " + birthdayCake.getPrice() + " $.");
        WeddingCake weddingCake = new WeddingCake();
        System.out.println("Order #002: \nWedding Cake; \ntaste - " + weddingCake.getTaste() +
                "; \nnumber of tiers - " + weddingCake.getTiers() +
                "; \nprice - " + weddingCake.getPrice() + " $.");
    }
}

