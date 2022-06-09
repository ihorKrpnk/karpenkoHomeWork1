package lesson4;

public class PhoneBill {
    private final static double TAX = 1.07;

    public static void main(String[] args) {

        double gigabyte = 8.6;
        double minutesUkr = 600;
        double sms = 60;
        double minutesZoneOne = 4;
        double minutesZoneTwo = 5;
        double totalPhoneBill = totalPhoneBillMethod(gigabyte, minutesUkr, sms, minutesZoneOne, minutesZoneTwo);

        System.out.println(totalPhoneBill + " грн. всього з ПДВ (7 %)");
    }

    public static double totalPhoneBillMethod(double gigaBytes, double minutesUkr, double sms, double minutesZoneOne, double minutesZoneTwo) {
        double trafficSpent = trafficSpent(gigaBytes);
        double callSpentUkr = callSpentUkr(minutesUkr);
        double smsSpent = smsSpent(sms);
        double callZoneOneSpent = callZoneOneSpent(minutesZoneOne);
        double callZoneTwoSpent = callZoneTwoSpent(minutesZoneTwo);
        return (trafficSpent + callSpentUkr + smsSpent + callZoneOneSpent + callZoneTwoSpent) * TAX;
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

    public static double callSpentUkr(double minutesUkr) {
        double priceMinutes = 0.5;
        double priceMinutesOver = 0.75;
        double minutesLimit = 500;

        if (minutesUkr <= minutesLimit) {
            return minutesUkr * priceMinutes;
        }
        return (minutesLimit * priceMinutes) + ((minutesUkr - minutesLimit) * priceMinutesOver);
    }

    public static double smsSpent(double sms) {
        double priceSms = 1;
        double priceSmsOver = 1.5;

        if (sms > 50) {
            return (50 * priceSms) + ((sms - 50) * priceSmsOver);
        }
        return sms * priceSms;
    }

    public static double callZoneOneSpent(double minutesZoneOne) {
        double priceMinutes = 1.5;
        return minutesZoneOne * priceMinutes;
    }

    public static double callZoneTwoSpent(double minutesZoneTwo) {
        double priceMinutes = 2;
        return minutesZoneTwo * priceMinutes;
    }
}