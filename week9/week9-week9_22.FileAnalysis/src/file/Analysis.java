/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kenny
 */
public class Analysis {
    
    private Scanner reader;
    private List<String> contents;
    
    public Analysis(File file) throws Exception {
        this.reader = new Scanner(file, "UTF-8");
        this.contents = new ArrayList<String>();
        loadContents();
    }
    
    private void loadContents() {
        while (this.reader.hasNextLine()) {
            this.contents.add(this.reader.nextLine());
        }
    }
    
    public int lines() {
        return this.contents.size();
    }
    
    public int characters() {
        int amount = 0;
        
        for (String line : this.contents) {
            amount += line.length();
            amount++;
        }
        
        return amount;
    }
}
