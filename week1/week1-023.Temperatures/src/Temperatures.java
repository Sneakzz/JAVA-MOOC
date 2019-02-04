
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double number;
//        int amount = 0;
//        int limit = 3;
        
        while(true) {
            System.out.print("Type a number: ");
            number = Double.parseDouble(reader.nextLine());
            
            if(number > -30 && number < 40){
                Graph.addNumber(number);
                System.out.println("Number added.");
//                amount++;
            } else {
                System.out.println("Enter a valid number between -30 and 40.");
            }
        }

        // Graph is used as follows:
//        Graph.addNumber(7);
//        double value = 13.5;
//        Graph.addNumber(value);
//        value = 3;
//        Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}
