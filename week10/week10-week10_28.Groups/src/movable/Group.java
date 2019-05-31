/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kenny
 */
public class Group implements Movable{

    private List<Movable> Movables;
    
    public Group() {
        this.Movables = new ArrayList<Movable>();
    }
    
    public void addToGroup(Movable movable) {
        this.Movables.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        if (!this.Movables.isEmpty()) {
            for (Movable movable : this.Movables) {
                movable.move(dx, dy);
            }
        }
    }
    
    public String toString() {
        String information = "";
        if (!this.Movables.isEmpty()) {
            for (Movable movable : this.Movables) {
                information += movable + "\n";
            }
        }
        return information;
    }
    
}
