
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input;
        int index = 0;
        
        System.out.print("Type your name: ");
        input = reader.nextLine();
        
        while (index < input.length()) {
            System.out.println((index + 1) + ". character: " + input.charAt(index));
            index++;
        }
    }
}
