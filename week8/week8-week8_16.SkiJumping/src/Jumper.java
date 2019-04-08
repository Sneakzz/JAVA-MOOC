
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kenny
 */
public class Jumper implements Comparable<Jumper>{
    
    private String name;
    private int totalPoints;
    private List<Jump> jumps;
    
    public Jumper(String name) {
        this.name = name;
        this.totalPoints = 0;
        this.jumps = new ArrayList<Jump>();
    }
    
    public void addJump() {
        this.jumps.add(new Jump());
        calculateTotalPoints();
    }
    
    public Jump getJump(int whichOne) {
        return this.jumps.get(whichOne - 1);
    }
    
    public List<Jump> getJumps() {
        return this.jumps;
    }
    
    public String getJumpLengths() {
        String jumpLengths = "";
        for (Jump jump : this.jumps) {
            jumpLengths += jump.getLengthPoints() + " m, ";
        }
        return jumpLengths;
    }
    
    public String getName() {
        return this.name;
    }
    
    private void calculateTotalPoints() {
        this.totalPoints = 0;
        if(!this.jumps.isEmpty()) {
            for (Jump jump : this.jumps) {
                this.totalPoints += jump.getLengthPoints() + jump.getVotePoints();
            }
        }
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.totalPoints + " points)";
    }

    @Override
    public int compareTo(Jumper o) {
        return this.totalPoints - o.totalPoints;
    }
}
