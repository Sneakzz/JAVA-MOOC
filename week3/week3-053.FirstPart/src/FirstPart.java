
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input;
        int index;
        
        System.out.print("Type a word: ");
        input = reader.nextLine();
        System.out.print("Length of the first part: ");
        index = Integer.parseInt(reader.nextLine());
        
        System.out.println("Result: " + input.substring(0, index));
    }
}
