
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess
        // if the letter has already been guessed, nothing happens
        if (!this.guessedLetters.contains(letter)) {
            // if the word does not contains the guessed letter, number of faults increase
            if (!this.word.contains(letter)) {
                this.numberOfFaults++;
            }

            // the letter is added among the already guessed letters
            this.guessedLetters += letter;
        }

    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word
        // create the hidden word by interating through this.word letter by letter
        int i = 0;
        String output = "";

        while (i < this.word.length()) {
            String letter = String.valueOf(this.word.charAt(i));
            // if the letter in turn is within the guessed words, put it in to the hidden word
            if (this.guessedLetters.contains(letter)) {
                output += letter;
                i++;
            } else {
                // if the letter is not among guessed, replace it with _ in the hidden word 
                output += "_";
                i++;
            }
        }
        // return the hidden word at the end
        return output;
    }
}
