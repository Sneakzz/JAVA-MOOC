
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int age;
        
        System.out.print("How old are you? ");
        age = Integer.parseInt(reader.nextLine());
        
        if(age >= 18) {
            System.out.println("You have reached the age of majority!");
        } else {
            System.out.println("You have not reached the age of majority yet!");
        }

        // Type your program here 
    }
}
