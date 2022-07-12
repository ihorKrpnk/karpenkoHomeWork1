package lesson9_Task5;

public class BallTester {
    public static void main(String[] args) {

        Ball footballBall = Ball.FOOTBALL;
        System.out.println(footballBall);
        System.out.println(footballBall.getPrice());
        Ball basketballBall = Ball.BASKETBALL;
        System.out.println(basketballBall);
        System.out.println(basketballBall.getSize());
        Ball handballBall = Ball.HANDBALL;
        System.out.println(handballBall);
        System.out.println(handballBall.getMaterial());
        Ball volleyballBall = Ball.VOLLEYBALL;
        System.out.println(volleyballBall);
        System.out.println(volleyballBall.getSports());
        Ball tennisBall = Ball.TENNIS;
        System.out.println(tennisBall);
        System.out.println(tennisBall.getSize());
    }
}