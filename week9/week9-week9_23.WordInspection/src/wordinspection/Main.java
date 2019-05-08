package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/shortList.txt");
        // all words are in file src/wordList.txt
        
        // testing WordInspection class
        WordInspection inspection = new WordInspection(file);
        System.out.println("wordcount: " + inspection.wordCount());
        
        System.out.println("words containing 'z': ");
        for (String word : inspection.wordsContainingZ()) {
            System.out.println("   " + word);
        }
        
        System.out.println("words ending with 'l': ");
        for (String word : inspection.wordsEndingInL()) {
            System.out.println("   " + word);
        }
        
        System.out.println("Palindromes: ");
        for (String word : inspection.palindromes()) {
            System.out.println("   " + word);
        }
        
        System.out.println("all vowels: ");
        for (String word : inspection.wordsWhichContainAllVowels()) {
            System.out.println("   " + word);
        }
    }
}
