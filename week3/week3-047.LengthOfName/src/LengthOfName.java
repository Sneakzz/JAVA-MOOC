
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input;
        
        System.out.print("Type your name: ");
        input = reader.nextLine();
        
        // call your method from here
        int chars = calculateCharacters(input);
        
        System.out.print("Number of characters: " + chars);
    }
    
    // do here the method
    // public static int calculateCharacters(String text)
    public static int calculateCharacters(String text) {
        return text.length();
    }
    
}
