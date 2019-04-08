
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kenny
 */
public class Box implements ToBeStored {
    
    private ArrayList<ToBeStored> things;
    private double maxWeight;
    
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<ToBeStored>();
    }
    
    public void add(ToBeStored thing) {
        if ((this.weight() + thing.weight()) <= this.maxWeight) {
            this.things.add(thing);
        }
    }

    @Override
    public double weight() {
        double weight = 0;
        
        // calculation of box weight
        for (ToBeStored thing : this.things) {
            weight += thing.weight();
        }
        
        return weight;
    }
    
    @Override
    public String toString() {
        return "Box: " + this.things.size() + " things, total weight " + this.weight() + " kg";
    }
}
