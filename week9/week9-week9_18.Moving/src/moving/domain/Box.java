/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kenny
 */
public class Box implements Thing{
    
    private int maximumCapacity;
    private List<Thing> items;
    
    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.items = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing) {
        if (thing.getVolume() + this.getVolume() <= this.maximumCapacity) {
            this.items.add(thing);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getVolume() {
        int volume = 0;
        for (Thing item : this.items) {
            volume += item.getVolume();
        }
        
        return volume;
    }
    
    @Override
    public String toString() {
        return this.getVolume() + " dm^3";
    }
}
