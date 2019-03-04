import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    private Random random;
    private String letters;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.random = new Random();
        this.letters = "abcdefghijklmnopqrstuvwxyz";
    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        String result = "";
        while (i < this.length) {
            result += this.letters.charAt(this.random.nextInt(26));
            
            i++;
        }
        return result;
    }
}
