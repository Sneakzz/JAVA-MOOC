/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Kenny
 */
public class PersonalDuplicateRemover implements DuplicateRemover{
    
    private Set<String> charStrings;
    private int dupeAmount;
    
    public PersonalDuplicateRemover() {
        this.charStrings = new HashSet<String>();
        this.dupeAmount = 0;
    }

    @Override
    public void add(String characterString) {
        if (this.charStrings.contains(characterString)) {
            this.dupeAmount++;
        } else {
            this.charStrings.add(characterString);
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.dupeAmount;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.charStrings;
    }

    @Override
    public void empty() {
        this.charStrings.clear();
        this.dupeAmount = 0;
    }
    
}
