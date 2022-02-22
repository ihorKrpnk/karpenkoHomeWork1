package lesson2;

public class Discount {

    public static void main(String[] args) {
        float purchaseAmount = 1100;
        float discount = purchaseAmount * 15 / 100;

        if (purchaseAmount > 1000)
            System.out.println("Purchase amount including discount is " + (purchaseAmount - discount) + " RUB.");
        else if (purchaseAmount == 0) System.out.println("No purchase amount!");
        else if (purchaseAmount < 0) System.out.println("Wrong number!");
        else System.out.println("Purchase amount is " + purchaseAmount + " RUB. No discount.");
    }
}
