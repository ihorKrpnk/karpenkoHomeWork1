package lesson2;

public class HypothecHusbandWife {

    public static void main(String[] args) {
        int ageHusb = 34;
        int ageWife = 36;

        if (ageWife <= 35) {
            if (ageHusb <= 35) {
                System.out.println("Mortgage approved!");
            } else {
                System.out.println("Mortgage denied!");
            }
        } else {
            System.out.println("Mortgage denied!");
        }
    }
}



