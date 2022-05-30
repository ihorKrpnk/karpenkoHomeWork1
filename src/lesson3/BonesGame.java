package lesson3;

import java.util.Random;

public class BonesGame {

    private final static int POINTS = 20;
    private static int steps = 0;
    private static Random random;

    public static void main(String[] args) {

        random = new Random();

        int turn = 1;

        while (steps < POINTS) {
            int score = randomDiceValue();
            steps = steps + score;

            if (turn < 5 && steps == 20) {
                System.out.println("Ты выиграл!");
                break;
            }
            if (turn == 5 || steps >= 20) {
                System.out.println("Ты проиграл!");
                break;
            }
            System.out.print("Бросок №:" + turn + ", тебе выпало " + score + ", ты находишься на " + steps + " игровом поле! " + (POINTS - steps) + " мест осталось пройти!");
            turn++;
            System.out.print("\n");

        }
    }

    private static int randomDiceValue() {
        return random.nextInt(6) + 1;
    }
}
