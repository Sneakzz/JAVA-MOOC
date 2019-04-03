/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kenny
 */
public class Plane {
    private String id;
    private int cap;
    
    public Plane(String id, int cap) {
        this.id = id;
        this.cap = cap;
    }
    
    @Override
    public String toString() {
        return this.id + " (" + this.cap + " ppl)"; 
    }
}
