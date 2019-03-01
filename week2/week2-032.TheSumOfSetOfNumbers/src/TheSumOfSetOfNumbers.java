
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int reps = 1;
        int sum = 0;
        int input;
        
        System.out.print("Until what? ");
        input = Integer.parseInt(reader.nextLine());
        
        while(reps <= input) {
            sum += reps;
            reps++;
        }
        
        System.out.println("Sum is " + sum);
    }
}
