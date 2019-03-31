/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kenny
 */
public class Change {
    
    private char fromCharacter;
    private char toCharacter;
    
    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this .toCharacter = toCharacter;
    }
    
    public String change(String characterString) {
        // can be done through the built in method for Strings
        return characterString.replace(this.fromCharacter, this.toCharacter);
        
        // can be done by looping over every character yourself and building a new String
//        String changedString = "";
//        
//        for (int i = 0; i < characterString.length(); i++) {
//            char character = characterString.charAt(i);
//            
//            if (character == this.fromCharacter) {
//                changedString += this.toCharacter;
//            } else {
//                changedString += character;
//            }
//        }
//        return changedString;
    }
}
