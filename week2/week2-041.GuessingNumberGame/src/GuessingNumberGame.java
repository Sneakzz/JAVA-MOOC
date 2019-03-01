
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int input;
        int guesses = 0;

        // program your solution here. Do not touch the above lines!
        System.out.print("Guess a number: ");
        input = Integer.parseInt(reader.nextLine());

        while (input != numberDrawn) {
            guesses++;
            if (input < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + guesses);
                System.out.print("Guess a number: ");
                input = Integer.parseInt(reader.nextLine());
            } else if (input > numberDrawn) {
                System.out.println("the number is lesser, guesses made: " + guesses);
                System.out.print("Guess a number: ");
                input = Integer.parseInt(reader.nextLine());
            }
        }
        
        System.out.println("Congratulations, your guess is correct!");
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
