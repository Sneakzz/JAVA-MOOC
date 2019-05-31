/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author Kenny
 */
public class Player {
    
    private int x;
    private int y;
    private int movesLeft;
    private Character icon;
    
    public Player(int movesLeft) {
        this.x = 0;
        this.y = 0;
        this.movesLeft = movesLeft;
        this.icon = '@';
    }
    
    public void moveUp() {
        if (this.y > 0) {
            this.y--;
        }
    }
    
    public void moveLeft() {
        if (this.x > 0) {
            this.x--;
        }
    }
    
    public void moveDown(int height) {
        if (this.y < height - 1) {
            this.y++;
        }
    }
    
    public void moveRight(int length) {
        if (this.x < length - 1) {
            this.x++;
        }
    }
    
    public int getMovesLeft() {
        return this.movesLeft;
    }
    
    public void decreaseMoves() {
        this.movesLeft--;
    }
    
    public Character getIcon() {
        return this.icon;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    @Override
    public String toString() {
        return this.icon + " " + this.x + " " + this.y;
    }
}
