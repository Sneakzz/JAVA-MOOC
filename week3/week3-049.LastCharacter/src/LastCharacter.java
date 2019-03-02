import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input;
        
        System.out.print("Type your name: ");
        input = reader.nextLine();
        
        char letter = lastCharacter(input);
        
        System.out.println("Last character: " + letter);
    }
    
    public static char lastCharacter(String text) {
        return text.charAt(text.length() - 1);
    }
}
