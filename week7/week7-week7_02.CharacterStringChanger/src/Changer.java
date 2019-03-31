
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kenny
 */
public class Changer {
    
    private List<Change> changes;
    
    public Changer() {
        this.changes = new ArrayList<Change>();
    }
    
    public void addChange(Change change) {
        this.changes.add(change);
    }
    
    public String change(String characterString) {
        for (Change Change : changes) {
            characterString = Change.change(characterString);
        }
        return characterString;
    }
}
