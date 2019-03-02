
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList
        ArrayList<String> words = new ArrayList<String>();
        String input;

        System.out.print("Type a word: ");
        input = reader.nextLine();

        while (!words.contains(input)) {
            words.add(input);
            System.out.print("Type a word: ");
            input = reader.nextLine();
        }
        
        System.out.println("You gave the word " + input + " twice");

    }
}
