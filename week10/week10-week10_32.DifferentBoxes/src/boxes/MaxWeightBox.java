/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kenny
 */
public class MaxWeightBox extends Box{
    
    private int maxWeight;
    private List<Thing> things;
    
    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        if (thing.getWeight() <= this.capacityLeft()) {
            this.things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return this.things.contains(thing);
    }
    
    private int capacityLeft() {
        int total = 0;
        if (!this.things.isEmpty()) {
            for (Thing thing : this.things) {
                total += thing.getWeight();
            }
        }
        
        return this.maxWeight - total;
    }
    
}
