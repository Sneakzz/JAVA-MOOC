
import java.util.ArrayList;
import java.util.Scanner;

public class Words {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input;
        ArrayList<String> words = new ArrayList<String>();

        System.out.print("Type a word: ");
        input = reader.nextLine();

        while (!input.isEmpty()) {
            words.add(input);
            System.out.print("Type a word: ");
            input = reader.nextLine();
        }

        System.out.println("You typed the following words: ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}
