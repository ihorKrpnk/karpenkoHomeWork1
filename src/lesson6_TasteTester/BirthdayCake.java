package lesson6_TasteTester;

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
