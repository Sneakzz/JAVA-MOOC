/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kenny
 */
public class Bird {
    private String sName;
    private String sLatinName;
    private int iObserved;
    
    public Bird(String sName, String sLatinName) {
        this.sName = sName;
        this.sLatinName = sLatinName;
        this.iObserved = 0;
    }
    
    public String getBirdName() {
        return this.sName;
    }
    
    public void increaseObserved() {
        this.iObserved++;
    }
    
    public String toString() {
        return this.sName + " (" + this.sLatinName + "): " + this.iObserved + " observations";
    }
}
