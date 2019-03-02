import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input;
        
        System.out.print("Type your name: ");
        input = reader.nextLine();
        
        char firstLetter = firstCharacter(input);
        
        System.out.println("First character: " + firstLetter);
    }
    
    public static char firstCharacter(String text) {
        return text.charAt(0);
    }
}
