package lesson6_TasteTester;

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
