package lesson4;

public class SalesSalary {


    public static void main(String[] args) {

        double rate = 4.8;
        int hours = 170;
        int experience = 7;
        int sale = 25;
        int amountSale = 20000;
        double salary = calculateSalary(hours, rate);
        double experienceRate = experienceRate(experience);
        double salaryExp = salary * experienceRate;
        double bonusSales = bonusSales(sale);
        double bonusAmountSales = bonusAmountSales(amountSale);
        double totalSalary = salaryExp + bonusSales + bonusAmountSales;

        System.out.println("Расчет:\nОтработано " + hours + " часов");
        System.out.println("Стаж = " + experience + " лет");
        System.out.println("Коэффициент на базовые часы в зависимости от стажа работы: " + experienceRate);
        System.out.println("Количество продаж: " + sale + " продаж");
        System.out.println("Бонус (- штраф) в зависимости от количества продаж: " + bonusSales + " грн.");
        System.out.println("Сумма продаж: " + amountSale + " грн.");
        System.out.println("Бонус в зависимости от суммы продаж: " + bonusAmountSales + " грн.");
        System.out.println("Итого зарплата составляет: " + totalSalary + " грн.");
    }

    public static double calculateSalary(int hours, double rate) {
        double baseSalary = (hours * rate);

        if (hours <= 159) {
            return baseSalary;
        }

        int overtimeHours = hours - 160;
        double overtimeSalary = overtimeHours * 1.5;
        return baseSalary + overtimeSalary;
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
            return 100;
        }
        return 0;
    }
}

