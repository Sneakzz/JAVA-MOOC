
import java.io.File;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kenny
 */
public class Printer {

    private Scanner reader;
    private List<String> contents;

    public Printer(String fileName) throws Exception {
        this.reader = new Scanner(new File(fileName), "UTF-8");
        this.contents = new ArrayList<String>();
    }

    public void printLinesWhichContain(String word) {
        if (this.contents.isEmpty()) {
            loadContents();
        }

        if (word.isEmpty()) {
            for (String line : this.contents) {
                System.out.println(line);
            }
        } else {
            for (String line : this.contents) {
                if (line.contains(word)) {
                    System.out.println(line);
                }
            }
        }
    }

    private void loadContents() {
        while (this.reader.hasNextLine()) {
            this.contents.add(this.reader.nextLine());
        }

        this.reader.close();
    }
}
