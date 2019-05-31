/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author Kenny
 */
public class Cow implements Milkable, Alive{

    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"
    };
    private String name;
    private double udderCap;
    private double amount;
    private Random rand = new Random();

    public Cow() {
        this.name = Cow.NAMES[this.rand.nextInt(Cow.NAMES.length)];
        this.udderCap = 15 + this.rand.nextInt(26);
        this.amount = 0.0;
    }

    public Cow(String name) {
        this.name = name;
        this.udderCap = 15 + this.rand.nextInt(26);
        this.amount = 0.0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getCapacity() {
        return this.udderCap;
    }
    
    public double getAmount() {
        return this.amount;
    }
    
    @Override
    public double milk() {
        double milk = this.amount;
        this.amount = 0.0;
        return milk;
    }

    @Override
    public void liveHour() {
        double temp = 0.7 + (2.0 - 0.7) * this.rand.nextDouble();
        if (temp + this.amount > this.udderCap) {
            this.amount = this.udderCap;
        } else {
            this.amount += temp;
        }
    }
    
    @Override
    public String toString() {
        return this.name + " " + Math.ceil(this.getAmount()) + "/" + Math.ceil(this.getCapacity());
    }
}
