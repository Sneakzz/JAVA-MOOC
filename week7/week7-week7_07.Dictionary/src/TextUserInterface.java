
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kenny
 */
public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        boolean running = true;

        showStatements();
        while (running) {
            String command = Dictionary.stringCleaner(askForCommand());

            if (command.equals("quit")) {
                running = quit();
            } else if (command.equals("add")) {
                add();
            } else if (command.equals("translate")) {
                translate();
            } else {
                System.out.println("Unknown statement");
                System.out.println();
            }

        }
    }

    private boolean quit() {
        System.out.println("Cheers!");
        System.out.println();
        return false;
    }

    private void add() {
        String[] pair = askForPair();
        this.dictionary.add(pair[0], pair[1]);
    }

    private String[] askForPair() {
        String[] pair = new String[2];

        System.out.print("In Finnish: ");
        pair[0] = this.reader.nextLine();
        System.out.print("Translation: ");
        pair[1] = this.reader.nextLine();
        System.out.println();

        return pair;
    }

    private void translate() {
        String word = askForWord();
        String translation = this.dictionary.translate(word);
        System.out.println("Translation: " + translation);
        System.out.println();
    }

    private String askForWord() {
        System.out.print("Give a word: ");
        String word = this.reader.nextLine();
        
        return word;
    }

    private String askForCommand() {
        System.out.print("Statement: ");
        String command = this.reader.nextLine();

        return command;
    }

    private void showStatements() {
        System.out.println("Statement:");
        System.out.println("add - adds a word pair to the dictionary");
        System.out.println("translate - asks a word and prints its translation");
        System.out.println("quit - quits the text user interface");
        System.out.println();
    }
}
