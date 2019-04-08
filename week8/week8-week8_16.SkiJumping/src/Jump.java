
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kenny
 */
public class Jump {
    
    private int length;
    private List<Integer> votePoints;
    private Random r;
    
    public Jump() {
        this.length = 0;
        this.votePoints = new ArrayList<Integer>();
        this.r = new Random();
        initiatePoints();
    }
    
    private void initiatePoints() {
        setLengthPoints();
        setVotePoints();
    }

    private void setLengthPoints() {
        int min = 60;
        int max = 120;
        
        int points = this.r.nextInt((max - min) + 1) + min;
        this.length = points;
    }
    
    private void setVotePoints() {
        int min = 10;
        int max = 20;
        for (int i = 0; i < 5; i++) {
            this.votePoints.add(this.r.nextInt((max - min) + 1) + min);
        }
    }
    
    public int getLengthPoints() {
        return this.length;
    }
    
    public List<Integer> getVotePointsList() {
        return this.votePoints;
    }
    
    public int getVotePoints() {
        List<Integer> validVotePoints = new ArrayList<Integer>(this.votePoints);
        
        validVotePoints.remove(Collections.min(validVotePoints));
        validVotePoints.remove(Collections.max(validVotePoints));
        
        int result = 0;
        for (int nr : validVotePoints) {
            result += nr;
        }
        
        return result;
    }
    
    
    
    
    
}
