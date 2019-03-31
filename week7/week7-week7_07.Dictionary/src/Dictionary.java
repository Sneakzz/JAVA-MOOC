
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kenny
 */
public class Dictionary {
    
    private HashMap<String, String> translations;
    
    public Dictionary() {
        this.translations = new HashMap<String, String>();
    }
    
    public String translate(String word) {
        if (this.translations.containsKey(word)) {
            return this.translations.get(word);
        }
        
        return null;
    }
    
    public void add(String word, String translation) {
        word = stringCleaner(word);
        translation = stringCleaner(translation);
        
        this.translations.put(word, translation);
    }
    
    public int amountOfWords() {
        return this.translations.size();
    }
    
    public ArrayList<String> translationList() {
        ArrayList<String> translationList = new ArrayList();
        
        for (String key : this.translations.keySet()) {
            translationList.add(key + " = " + this.translations.get(key));
        }
        
        return translationList;
    }
    
    public static String stringCleaner(String string) {
        if (string == null) {
            return "";
        }
        
        string = string.toLowerCase();
        return string.trim();
    }
}
