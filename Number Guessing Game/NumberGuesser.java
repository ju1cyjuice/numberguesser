import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int input = -1;
        System.out.println("Guess the number from 1-100 in 5 tries: ");
        for (int i = 0; i < 5; i++) {
            input = scanner.nextInt();
            if (num == input) {
                System.out.println("Congrats you got the correct number!");
                break;
            } else if (input < num) {
                if (i != 4) {
                    System.out.println("Number is higher! Choose another number: ");
                } else {
                    System.out.println("Number is higher!");
                }
            } else if (input > num) {
                if (i != 4) {
                    System.out.println("Number is lower! Choose another number: ");
                } else {
                    System.out.println("Number is lower!");
                }
            }

            if (i == 4) {
                System.out.println("You have ran out of tries! The number was " + num + ". Better luck next time.");
            }

        }

        scanner.close();
    }
}