package com.company;

public class Main {

    public static void main(String[] args) {

        double fahrenheitTemperature = 77;
        double celsiusTemperature = 5 / 9 * (fahrenheitTemperature - 32);
        double fahrenheitToCelsiumTemperature = 9 / 5 * (celsiusTemperature + 32);
        double kelvinTemperature = celsiusTemperature + 273.16;
        double inchesInMeter = 39.37;
        double kmsInMile = 1.609;
        double poundsInKg = 2.2046;
        double speedMilesInKm = 0.6214;
        float total_test = 10;
        float marked_test = 7;
        float percentage = ((marked_test / total_test) * 100);
        boolean ageFamily = isAge(29, 40);
        boolean familyIncome = isFamilyIncome(40000);
        boolean isFirstSortAvailable = true;
        boolean isSecondSortAvailable = true;

        System.out.println("1. Convert Fahrenheit to Celsius. For fahrenheit temperature " + fahrenheitTemperature +
                " celsius temperature is: " + celsiusTemperature);
        System.out.println("2. Convert Celsius to Fahrenheit. For " + celsiusTemperature + " celsius temperature fahrenheit temperature is: " +
                fahrenheitToCelsiumTemperature + " fahrenheit");
        System.out.println("3. Convert Celsius to Kelvin. For " + celsiusTemperature + " celsius temperature Kelvin temperature is: " +
                kelvinTemperature + " kelvin");
        System.out.println("4.1 Convert meters to inches. In 1 meter inches are: " + inchesInMeter + " inches");
        System.out.println("4.2 Convert inches to meters. In 1 inch meters are: " + 1 / inchesInMeter + " meters");
        System.out.println("5.1 Convert miles to kilometres. In 1 mile kilometres are: " + kmsInMile + " kilometres");
        System.out.println("5.2 Convert kilometres to miles. In 1 kilometre miles are: " + 1 / kmsInMile + " miles");
        System.out.println("6.1 Convert kilograms to pounds. In 1 kilogram pounds are: " + poundsInKg + " pounds");
        System.out.println("6.2 Convert pounds to kilograms. In 1 pound kilograms are: " + 1 / poundsInKg + " kilograms");
        System.out.println("7.1 Convert speed km/hr to mi/hr. In 1 km/hr speed: " + speedMilesInKm + " mi/hr");
        System.out.println("7.2 Convert speed mi/hr to km/hr. In 1 mi/hr speed: " + 1 / speedMilesInKm + " km/hr");
        System.out.println("8. Total test = " + total_test + "; marked test = " + marked_test + " Results: " + percentage + " %");
        System.out.println("9. " + ageFamily);
        System.out.println("10. " + familyIncome);
        System.out.println("11. Availability of first-class apples: " + isFirstSortAvailable + ". Availability of second-class apples: " + isSecondSortAvailable + ".");
    }

    public static boolean isAge(int a, int b) {
        return ((a < 35) && (b < 35));
    }

    public static boolean isFamilyIncome(int a) {
        return ((a < 50000) && (a > 20000));
    }
}
