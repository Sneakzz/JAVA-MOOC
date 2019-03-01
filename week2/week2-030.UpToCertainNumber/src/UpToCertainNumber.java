
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = 1;
        int input;
        
        System.out.print("Up to what number? ");
        input = Integer.parseInt(reader.nextLine());
        
        while(number <= input) {
            System.out.println(number);
            number++;
        }
        
    }
}
