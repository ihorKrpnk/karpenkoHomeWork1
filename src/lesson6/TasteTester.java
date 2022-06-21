package lesson6;

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

class Cake {

    private String taste;
    private double price;

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}

class BirthdayCake extends Cake {

    private int candles;

    public BirthdayCake() {
        setCandles(15);
        setTaste("Cherry, Chocolate");
        setPrice(25.99);
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}

class WeddingCake extends Cake {
    private int tiers;

    public WeddingCake() {
        setTiers(5);
        setPrice(99.99);
        setTaste("Coffee, coconut, nuts, fruits, cottage cheese");
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}