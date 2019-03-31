
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
public class Suitcase {
    
    private ArrayList<Thing> things;
    private int weightLimit;
    
    public Suitcase(int weightLimit) {
        this.things = new ArrayList();
        this.weightLimit = weightLimit;
    }
    
    public void addThing(Thing thing) {
        // get current weight
        int totalWeight = totalWeight();
        
        // check if weight doesn't go over limit
        if ((totalWeight + thing.getWeight()) <= this.weightLimit) {
            this.things.add(thing);
        }
    }
    
    public void printThings() {
        for (Thing thing : this.things) {
            System.out.println(thing.toString());
        }
    }
    
    public Thing heaviestThing() {
        Thing heaviest;
        
        if (this.things.isEmpty()) {
            return null;
        }
        
        heaviest = this.things.get(0);
        for (Thing thing : this.things) {
            if (heaviest == null || heaviest.getWeight() < thing.getWeight()) {
                heaviest = thing;
            }
        } 
        
        return heaviest;
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        
        for (Thing item : this.things) {
            totalWeight += item.getWeight();
        }
        
        return totalWeight;
    }
    
    public String toString() {
        switch (this.things.size()) {
            case 0:
                return "empty (0 kg)";
            case 1:
                return this.things.size() + " thing (" + totalWeight() + " kg)";
            default:
                return this.things.size() + " things (" + totalWeight() + " kg)";
        }
    }
}
