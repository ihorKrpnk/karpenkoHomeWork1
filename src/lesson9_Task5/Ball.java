package lesson9_Task5;

public enum Ball {
    FOOTBALL(70, "football", 3500, "thermopolyurethane"),
    BASKETBALL(78, "basketball", 4800, "synthetic leather"),
    VOLLEYBALL(65, "volleyball", 1800, "synthetic leather"),
    HANDBALL(52, "handball", 1500, "polyurethane"),
    TENNIS(7, "tennis", 700, "natural rubber");
    private final double size;
    private final String sports;
    private final double price;
    private final String material;

    Ball(double size, String sports, double price, String material) {
        this.size = size;
        this.sports = sports;
        this.price = price;
        this.material = material;
    }

    public double getSize() {
        return size;
    }

    public String getSports() {
        return sports;
    }

    public double getPrice() {
        return price;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "size=" + size +
                ", sports='" + sports + '\'' +
                ", price=" + price +
                ", material='" + material + '\'' +
                '}';
    }
}