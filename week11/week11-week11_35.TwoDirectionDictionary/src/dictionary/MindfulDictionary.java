/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author Kenny
 */
public class MindfulDictionary {

    private Map<String, String> dictionary;
    private File file;
    private Scanner reader;
    private FileWriter writer;

    public MindfulDictionary() {
        this.dictionary = new HashMap<String, String>();
    }
    
    public MindfulDictionary(String file) {
        this.dictionary = new HashMap<String, String>();
        this.file = new File(file);
    }
    
    public boolean load() {
        try {
            this.reader = new Scanner(this.file);
            
            while (this.reader.hasNextLine()) {
                String line = this.reader.nextLine();
                String[] parts = line.split(":"); // splitting the line on the semicolon
                
                this.add(parts[0], parts[1]);
            }
            
            this.reader.close();
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }
    
    public boolean save() {
        List<String> written = new ArrayList<String>();
        try {
            this.writer = new FileWriter(this.file);
            for (Map.Entry<String,String> entry : this.dictionary.entrySet()) {
                if (!written.contains(entry.getKey())) {
                    this.writer.write(entry.getKey() + ":" + entry.getValue() + "\n");
                    written.add(entry.getValue());
                }
            }
            this.writer.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public void add(String word, String translation) {
        if (!this.dictionary.containsKey(word) && !this.dictionary.containsKey(translation)) {
            this.dictionary.put(word, translation);
            this.dictionary.put(translation, word);
        }
    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }

        return null;
    }
    
    public void remove(String word) {
        String translation;
        if (this.dictionary.containsKey(word)) {
            translation = this.dictionary.get(word);
            this.dictionary.remove(word);
            this.dictionary.remove(translation);
        }
    }
}
