import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int input;
        int start = 1;
        int factorial = 1;
        
        System.out.print("Type a number: ");
        input = Integer.parseInt(reader.nextLine());
        
        while(start <= input) {
            factorial *= start;
            start++;
        }
        
        System.out.println("Factorial is " + factorial);
    }
}
