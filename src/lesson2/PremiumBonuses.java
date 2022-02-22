package lesson2;

public class PremiumBonuses {

    public static void main(String[] args) {
        int sales = 11;
        int base = 1000;
        int bonus = 250;

        if (sales > 10) System.out.println("Salary is " + (base + bonus) + " $.");
        else if (sales == 0) System.out.println("No sales - no sweets!");
        else if (sales < 0) System.out.println("Wrong number!");
        else System.out.println("Salary is " + base + " $.");
    }
}
