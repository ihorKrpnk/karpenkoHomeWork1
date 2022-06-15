package lesson5;

public class SalaryCalculation {

    public static void main(String[] args) {
        SalesAgentSalary salesAgentSalary1 = new SalesAgentSalary(150, 5);
        SalesAgentSalary salesAgentSalary2 = new SalesAgentSalary(170, 5, 10, 25, 50000);
        System.out.println("Итого зарплата первого менеджера составляет: " + salesAgentSalary1.getTotalSalary() + " $");
        System.out.println("Итого зарплата второго менеджера составляет: " + salesAgentSalary2.getTotalSalary() + " $");
    }
}

class SalesAgentSalary {

    private double totalSalary;

    public SalesAgentSalary(int hours, double rate) {
        this(hours, rate, 0, 0, 0);
    }

    public SalesAgentSalary(int hours, double rate, int experience, int sale, double amountSale) {
        setTotalSalary(totalSalaryMethod(hours, rate, experience, sale, amountSale));
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    public static double totalSalaryMethod(int hours, double rate, int experience, int sale, double amountSale) {
        double experienceRate = experienceRate(experience);
        double calculateSalary = calculateSalary(hours, rate, experienceRate);
        double bonusSales = bonusSales(sale) + bonusAmountSales(amountSale);
        return calculateSalary + bonusSales;
    }

    public static double calculateSalary(int hours, double rate, double experienceRate) {

        if (hours > 160) {
            double baseSalary = 160 * rate * experienceRate;
            int overtimeHours = hours - 160;
            double overtimeSalary = overtimeHours * 1.5 * rate;
            return baseSalary + overtimeSalary;
        }

        return hours * rate * experienceRate;
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