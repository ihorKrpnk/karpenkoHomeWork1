package lesson2;

public class SquareCircle {

    public static void main(String[] args) {
        double sSquare = 3;
        double sCircle = 9;
        double diamCircle = Math.sqrt(sCircle / Math.PI) * 2;
        double outDiamSquare = Math.sqrt(sSquare) * Math.sqrt(2);
        double innerDiamSquare = Math.sqrt(sSquare);

        if (innerDiamSquare <= diamCircle) {
            System.out.println("Square fits in the circle");
        } else {
            System.out.println("Square doesn't fit in the circle");
        }

        if (outDiamSquare >= diamCircle) {
            System.out.println("Circle fits in the square");
        } else {
            System.out.println("Circle doesn't fit in the square");
        }
    }
}
