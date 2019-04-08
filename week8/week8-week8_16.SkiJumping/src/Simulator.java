
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
public class Simulator {

    private List<Jumper> jumpers;
    private int round;

    public Simulator() {
        this.jumpers = new ArrayList<Jumper>();
        this.round = 1;
    }
    
    public void jump() {
        for (Jumper jumper : getJumpOrder()) {
            jumper.addJump();
        }
    }

    public void addJumper(String name) {
        this.jumpers.add(new Jumper(name));
    }

    public List<Jumper> getJumpers() {
        return this.jumpers;
    }
    
    public List<Jumper> getJumpOrder() {
        List<Jumper> sorted = new ArrayList<Jumper>(this.jumpers);
        Collections.sort(sorted);
        return sorted;
    }
    
    public int getRound() {
        return this.round;
    }
    
    public void increaseRound() {
        this.round++;
    }
}
