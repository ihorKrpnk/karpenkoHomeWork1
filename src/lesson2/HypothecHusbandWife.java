package lesson2;

public class HypothecHusbandWife {

    public static void main(String[] args) {
        int ageHusb = 34;
        int ageWife = 37;

        if (ageWife <= 35) {
            if (ageHusb <= 35) {
                System.out.println("Mortgage approved!");
            }
        } else System.out.println("Mortgage denied!");
    }
}

