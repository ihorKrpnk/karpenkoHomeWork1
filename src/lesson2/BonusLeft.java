package lesson2;

public class BonusLeft {

    public static void main(String[] args) {
        int sale = 18;
        int saleBonus = 11;
        int resultLeft = saleBonus - sale;

        if (sale >= saleBonus) System.out.println("You get a BONUS!");
        else if (sale < 0) System.out.println("Wrong number!");
        else System.out.println("You have " + resultLeft + " sales left to receive the bonus!");
    }
}
