import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
       public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(11);
        Scanner scanner = new Scanner(System.in);
        int input = -1;
        System.out.println("Guess the number from 0-10: ");
        while (num != input) {
            input = scanner.nextInt();
            if (num == input) {
                System.out.println("Congrats you got the correct number!");
                break;
            } else if (input < num) {
                System.out.println("Number is higher! Choose another number: ");
                continue;
            } else if (input > num) {
                System.out.println("Number is lower! Choose another number: ");
                continue;
            }
        }

        scanner.close();
    }
}