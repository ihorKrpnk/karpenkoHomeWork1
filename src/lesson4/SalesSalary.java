package lesson4;

public class SalesSalary {

    public static void main(String[] args) {

        double rate = 5;
        int hours = 170;
        int experience = 7;
        int sale = 21;
        int amountSale = 20000;
        double totalSalary = totalSalaryMethod(rate, hours, experience, sale, amountSale);

        System.out.println("Итого зарплата составляет: " + totalSalary + " $");
    }

    public static double totalSalaryMethod(double rate, int hours, int experience, int sale, int amountSale) {
        double calculateSalary = calculateSalary(hours, rate);
        double experienceRate = experienceRate(experience);
        double bonusSales = bonusSales(sale) + bonusAmountSales(amountSale);
        return (calculateSalary * experienceRate) + bonusSales;
    }

    public static double calculateSalary(int hours, double rate) {

        if (hours > 160) {
            double baseSalary = 160 * rate;
            int overtimeHours = hours - 160;
            double overtimeSalary = overtimeHours * 1.5 * rate;
            return baseSalary + overtimeSalary;
        }
        return hours * rate;
    }

    private static double experienceRate(int experience) {

        if (experience > 6) {
            return 1.4;
        }
        if (experience > 4) {
            return 1.3;
        }
        if (experience > 2) {
            return 1.2;
        }
        return 1;
    }

    public static double bonusSales(int sale) {

        if (sale > 20) {
            return 250;
        }
        if (sale < 10) {
            return -150;
        }
        return 0;
    }

    public static double bonusAmountSales(double amountSale) {

        if (amountSale > 15000) {
            return 150;
        }
        return 0;
    }
}