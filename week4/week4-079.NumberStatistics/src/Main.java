
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4
        

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.
        // The tests does not work if you do not create the objects in the correct order
        
        Scanner reader = new Scanner(System.in);
        NumberStatistics sumOfAll = new NumberStatistics();
        NumberStatistics sumOfEven = new NumberStatistics();
        NumberStatistics sumOfOdd = new NumberStatistics();
        int number;

        System.out.println("Type numbers:");
        number = Integer.parseInt(reader.nextLine());
        while (number != -1) {
            sumOfAll.addNumber(number);
            if (number % 2 == 0) {
                sumOfEven.addNumber(number);
            } else {
                sumOfOdd.addNumber(number);
            }
            number = Integer.parseInt(reader.nextLine());
        }

        System.out.println("sum: " + sumOfAll.sum());
        System.out.println("sum of even: " + sumOfEven.sum());
        System.out.println("sum of odd: " + sumOfOdd.sum());
    }
}
