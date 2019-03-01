
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        int count = 0;
        int oddCount = 0;
        int evenCount = 0;
        double avg;

        while (true) {
            System.out.println("Type numbers: ");
            number = Integer.parseInt(reader.nextLine());

            if (number == -1) {
                avg = (double) sum / count;
                System.out.println("Thank you and see you later!");
                break;
            } else {
                if(number % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
                sum += number;
                count++;
            }
        }
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
