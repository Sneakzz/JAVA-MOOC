
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
public class Container {
    
    private ArrayList<Suitcase> suitcases;
    private int weightLimit;
    
    public Container(int weightLimit) {
        this.weightLimit = weightLimit;
        this.suitcases = new ArrayList();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if ((suitcase.totalWeight() + totalWeight()) <= this.weightLimit) {
            this.suitcases.add(suitcase);
        }
    }
    
    public void printThings() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printThings();
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        
        for (Suitcase suitcase : this.suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        
        return totalWeight;
    }
    
    public String toString() {
        switch (this.suitcases.size()) {
            case 0:
                return "empty (0 kg)";
            case 1:
                return this.suitcases.size() + " suitcase (" + totalWeight() + " kg)";
            default:
                return this.suitcases.size() + " suitcases (" + totalWeight() + " kg)";
        }
    }
}
