
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String word1, word2;
        
        System.out.print("Type the first word: ");
        word1 = reader.nextLine();
        System.out.print("Type the second word: ");
        word2 = reader.nextLine();
        
        if (word1.indexOf(word2) == -1) {
            System.out.println("The word '" + word2 + "' is not found in the word '" + word1 + "'.");
        } else {
            System.out.println("The word '" + word2 + "' is found in the word '" + word1 + "'.");
        }
    }
}
