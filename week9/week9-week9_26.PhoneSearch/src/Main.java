
import java.io.InputStream;
import java.util.Scanner;
import phonesearch.UserInterface;

public class Main {

    public static void main(String[] args) {
        InputStream input = System.in;
        String testInput = "1\n" + "pekka\n" + "040-123456\n" + "2\n" + "jukka\n" + "2\n"
                + "pekka\n" + "1\n" + "pekka\n" + "09-222333\n" + "2\n" + "pekka\n" + "3\n"
                + "02-444123\n" + "3\n" + "09-222333\n" + "5\n" + "pekka\n" + "4\n" + "pekka\n"
                + "ida ekmanintie\n" + "helsinki\n" + "5\n" + "pekka\n" + "4\n" + "jukka\n"
                + "korsontie\n" + "vantaa\n" + "5\n" + "jukka\n" + "7\n" + "kk\n" + "7\n"
                + "vantaa\n" + "7\n" + "seppo\n" + "6\n" + "jukka\n" + "5\n" + "jukka\n" + "x";

        Scanner reader = new Scanner(input);
        
        UserInterface ui = new UserInterface(reader);
        ui.start();
    }
}
