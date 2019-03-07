
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
public class Team {
    private String name;
    private int maxPlayers;
    private ArrayList<Player> team;
    
    public Team(String name) {
        this.name = name;
        this.team = new ArrayList<Player>();
        this.maxPlayers = 16;
    }
    
    public void addPlayer(Player player) {
        if (this.team.size() < this.maxPlayers) {
            this.team.add(player);
        }
    }
    
    public void printPlayers() {
        for (Player player : team) {
            System.out.println(player);
        }
    }
    
    public void setMaxSize(int maxSize) {
        this.maxPlayers = maxSize;
    }
    
    public int size() {
        return this.team.size();
    }
    
    public String getName() {
        return this.name;
    }
    
    public int goals() {
        int goals = 0;
        for (Player player : team) {
            goals += player.goals();
        }
        
        return goals;
    }
}
