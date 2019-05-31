/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Kenny
 */
public class Vampire {
    
    private int x;
    private int y;
    private Random r;
    private Character icon;
    private boolean canMove;
    
    public Vampire(boolean canMove, int length, int height) {
        this.r = new Random();
        this.icon = 'v';
        this.canMove = canMove;
        this.generateStartPosition(length, height);
    }
    
    private void generateStartPosition(int length, int height) {
        this.x = 1 + this.r.nextInt(length - 1);
        this.y = 1 + this.r.nextInt(height - 1);
    }
    
    public List<Integer> generateMoveCoords() {
        List<Integer>coords = new ArrayList<Integer>();
        int move = this.r.nextInt(4);
        
        switch (move) {
            case 0: // UP
                coords.add(this.x);
                coords.add(this.y - 1);
                break;
            case 1: // LEFT
                coords.add(this.x - 1);
                coords.add(this.y);
                break;
            case 2: // DOWN
                coords.add(this.x);
                coords.add(this.y + 1);
                break;
            case 3: // RIGHT
                coords.add(this.x + 1);
                coords.add(this.y);
                break;
        }
        
        return coords;
    }
    
    public Character getIcon() {
        return this.icon;
    }
    
    public boolean canMove() {
        return this.canMove;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.x;
        hash = 47 * hash + this.y;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vampire other = (Vampire) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return this.icon + " " + this.x + " " + this.y;
    }
}
