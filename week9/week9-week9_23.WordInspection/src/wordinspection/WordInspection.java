/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kenny
 */
public class WordInspection {

    private List<String> words;
    private Scanner reader;

    public WordInspection(File file) throws FileNotFoundException {
        this.words = new ArrayList<String>();
        this.reader = new Scanner(file, "UTF-8");
        loadWords();
    }

    private void loadWords() {
        while (this.reader.hasNext()) {
            this.words.add(this.reader.next());
        }
    }

    public int wordCount() {
        return this.words.size();
    }

    public List<String> wordsContainingZ() {
        List<String> wordsContainingZ = new ArrayList<String>();
        for (String word : this.words) {
            if (word.contains("z")) {
                wordsContainingZ.add(word);
            }
        }

        return wordsContainingZ;
    }

    public List<String> wordsEndingInL() {
        List<String> wordsEndingInL = new ArrayList<String>();
        for (String word : this.words) {
            if (word.endsWith("l")) {
                wordsEndingInL.add(word);
            }
        }

        return wordsEndingInL;
    }

    public List<String> palindromes() {
        List<String> palindromes = new ArrayList<String>();
        for (String word : this.words) {
            String wordReversed = reverseWord(word);
            if (word.equals(wordReversed)) {
                palindromes.add(word);
            }
        }

        return palindromes;
    }

    private String reverseWord(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return reversed;
    }

    public List<String> wordsWhichContainAllVowels() {
        List<String> allVowels = new ArrayList<String>();

        for (String word : this.words) {
            if (word.contains("a") && word.contains("e") && word.contains("i")
                    && word.contains("o") && word.contains("u") && word.contains("y")
                    && word.contains("ä") && word.contains("ö")) {
                allVowels.add(word);
            }
        }

        return allVowels;
    }
}
