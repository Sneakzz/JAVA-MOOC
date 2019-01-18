
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int first;
        int second;
        double division;

        // Implement your program here. Remember to ask the input from user.
        System.out.print("Type a number: ");
        first = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        second = Integer.parseInt(reader.nextLine());
        
        division = (double)first / second;
        System.out.println("Division: " + first + " / " + second + " = " + division);
    }
}
