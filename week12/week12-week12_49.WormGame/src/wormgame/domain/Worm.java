/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

import java.util.*;
import wormgame.Direction;

/**
 *
 * @author Kenny
 */
public class Worm {

    private int originalX;
    private int originalY;
    private Direction originalDirection;
    private List<Piece> wormParts;
    private boolean grow;

    public Worm(int originalX, int originalY, Direction OriginalDirection) {
        this.originalX = originalX;
        this.originalY = originalY;
        this.originalDirection = OriginalDirection;
        this.wormParts = new ArrayList<Piece>();
        this.wormParts.add(new Piece(this.originalX, this.originalY));
        this.grow = false;
    }

    public Direction getDirection() {
        return this.originalDirection;
    }

    public void setDirection(Direction dir) {
        this.originalDirection = dir;
    }

    public int getLength() {
        return this.wormParts.size();
    }

    public List<Piece> getPieces() {
        return this.wormParts;
    }

    public void move() {
        // get the x and y for the current head of the snake (at the back of the list)
        int newX = this.wormParts.get(this.wormParts.size() - 1).getX();
        int newY = this.wormParts.get(this.wormParts.size() - 1).getY();

        // check the current direction of the snake and adjust the x and y coordinates for
        // the new piece of the snake
        switch (this.originalDirection) {
            case UP:
                newY--;
                break;
            case DOWN:
                newY++;
                break;
            case LEFT:
                newX--;
                break;
            case RIGHT:
                newX++;
                break;
        }
        
        // if the length of the snake is higher then 2 and grow() was not called before the move()
        // the first piece of the snake (tail) needs to be removed 
        if (this.getLength() > 2 && !this.grow) {
            this.wormParts.remove(0);
        }
        
        // if grow() was called before the move() call we need to set the boolean back to false
        if (this.grow) {
            this.grow = false;
        }
        
        // at the end of it all we add the newly adjusted piece to the snake
        this.wormParts.add(new Piece(newX, newY));
    }

    public void grow() {
        this.grow = true;
    }

    public boolean runsInto(Piece piece) {
        for (Piece p : this.wormParts) {
            if (p.getX() == piece.getX() && p.getY() == piece.getY()) {
                return true;
            }
        }

        return false;
    }

    public boolean runsIntoItself() {
        for (Piece p : this.wormParts) {
            for (Piece c : this.wormParts) {
                if (p == c) {
                    continue;
                }

                if (p.getX() == c.getX() && p.getY() == c.getY()) {
                    return true;
                }
            }
        }
        return false;
    }

    public Piece wormHead() {
        return wormParts.get(getLength() - 1);
    }
}
