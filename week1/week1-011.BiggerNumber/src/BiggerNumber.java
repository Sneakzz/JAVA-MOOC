
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int first;
        int second;
        int result;
        
        System.out.print("Type a number: ");
        first = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        second = Integer.parseInt(reader.nextLine());
        
        result = Math.max(first, second);
        System.out.println("The bigger number of the two numbers given was: " + result);
    }
}
