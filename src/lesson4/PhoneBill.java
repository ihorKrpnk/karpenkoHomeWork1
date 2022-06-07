package lesson4;

public class PhoneBill {
    private final static double TAX = 1.07;

    public static void main(String[] args) {

        double gigabyte = 8.6;
        double minutesUkr = 600;
        double sms = 60;
        double minutesZoneOne = 4;
        double minutesZoneTwo = 5;
        double trafficSpent = trafficSpent(gigabyte);
        double callSpentUkr = callSpentUkr(minutesUkr);
        double smsSpent = smsSpent(sms);
        double zoneOneSpent = callZoneOneSpent(minutesZoneOne);
        double zoneTwoSpent = callZoneTwoSpent(minutesZoneTwo);
        double price = trafficSpent + callSpentUkr + smsSpent + zoneOneSpent + zoneTwoSpent;

        System.out.println(trafficSpent + " грн. - інтернет");
        System.out.println(callSpentUkr + " грн. - дзвінки по Україні");
        System.out.println(smsSpent + " грн. - sms по Україні");
        System.out.println(zoneOneSpent + " грн. - дзвінки за кордон (Зона №1)");
        System.out.println(zoneTwoSpent + " грн. - дзвінки за кордон (Зона №2)");
        System.out.println("----------------------------------------");
        System.out.println(addTax(price) + " грн. всього з ПДВ (7 %)");
    }

    public static double trafficSpent(double gigaBytes) {
        double totalGigaBytes = 8;
        double basePlan = 180;
        double price500Mb = 50;
        double megaBytes = 0.5;

        if (gigaBytes <= totalGigaBytes) {
            return basePlan;
        }

        double gigaBytesOver = gigaBytes - totalGigaBytes;
        double count = Math.round(gigaBytesOver / megaBytes);

        if (gigaBytesOver % megaBytes != 0) {
            count++;
        }
        double overPrice = count * price500Mb;
        return basePlan + overPrice;
    }

    public static double callSpentUkr(double minutes) {
        double priceMinutes = 0.5;
        double priceMinutesOver = 0.75;
        double minutesLimit = 500;

        if (minutes <= minutesLimit) {
            return minutes * priceMinutes;
        }
        return (minutesLimit * priceMinutes) + ((minutes - minutesLimit) * priceMinutesOver);
    }

    public static double smsSpent(double sms) {
        double priceSms = 1;
        double priceSmsOver = 1.5;

        if (sms > 50) {
            return (50 * priceSms) + ((sms - 50) * priceSmsOver);
        }
        return sms * priceSms;
    }

    public static double callZoneOneSpent(double minutes) {
        double priceMinutes = 1.5;
        double amount = minutes * priceMinutes;
        return amount;
    }

    public static double callZoneTwoSpent(double minutes) {
        double priceMinutes = 2;
        double amount = minutes * priceMinutes;
        return amount;
    }

    public static double addTax(double price) {
        return price * TAX;
    }
}