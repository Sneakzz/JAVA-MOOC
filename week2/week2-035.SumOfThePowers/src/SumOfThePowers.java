
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int power;
        int result = 0;
        int start = 0;
        
        System.out.print("Type a number: ");
        power = Integer.parseInt(reader.nextLine());
        while(start <= power) {
            result += (int)Math.pow(2, start);
            start++;
        }
        
        System.out.println("The result is " + result);
    }
}
