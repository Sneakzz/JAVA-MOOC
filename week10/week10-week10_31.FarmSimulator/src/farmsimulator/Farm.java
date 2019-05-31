/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kenny
 */
public class Farm implements Alive{
    
    private String owner;
    private Barn barn;
    private List<Cow> cows;
    
    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }
    
    public void installMilkingRobot(MilkingRobot robot) {
        this.barn.installMilkingRobot(robot);
    }

    @Override
    public void liveHour() {
        if (!this.cows.isEmpty()) {
            for (Cow cow : this.cows) {
                cow.liveHour();
            }
        }
    }
    
    public void addCow(Cow cow) {
        this.cows.add(cow);
    }
    
    public void manageCows() {
        if (!this.cows.isEmpty()) {
            this.barn.takeCareOf(this.cows);
        }
    }
    
    public String getOwner() {
        return this.owner;
    }
    
    @Override
    public String toString() {
        String output = "";
        output += "Farm owner: " + this.owner + "\n";
        output += "Barn bulk tank: " + this.barn + "\n";
        if (this.cows.isEmpty()) {
            output += "No cows.";
        } else {
            output += "Animals:\n";
            for (Cow cow : this.cows) {
                output += "        " + cow + "\n";
            }
        }
        return output;
    }
}
