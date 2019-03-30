/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kenny
 */
public class StringUtils {
    
    public static boolean included(String word, String searched) {
        if (word == null || searched == null) {
            return false;
        } else {
            if(word.toLowerCase().trim().contains(searched.toLowerCase().trim())) {
                return true;
            }
        }
        return false;
    }
}
