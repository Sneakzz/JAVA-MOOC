/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kenny
 */
public class Counter {
    private int counter;
    private boolean check;
    
    public Counter(int startingValue, boolean check) {
        this.counter = startingValue;
        this.check = check;
    }
    
    public Counter(int startingValue) {
        this.counter = startingValue;
        this.check = false;
    }
    
    public Counter(boolean check) {
        this.counter = 0;
        this.check = check;
    }
    
    public Counter() {
        this.counter = 0;
        this.check = false;
    }
    
    public int value() {
        return this.counter;
    }
    
    public void increase() {
        this.counter += 1;
    }
    
    public void increase(int increaseAmount) {
        if (increaseAmount >= 0) {
            this.counter += increaseAmount;
        }
    }
    
    public void decrease() {
        if (this.check) {
            if(this.counter > 0) {
                this.counter -= 1;
            }
        } else {
            this.counter -= 1;
        }
    }
    
    public void decrease(int decreaseAmount) {
        boolean positive = decreaseAmount >= 0;
        
        if (this.check) {
            if (this.counter - decreaseAmount >= 0) {
                if (decreaseAmount >= 0) {
                    this.counter -= decreaseAmount;
                }
            } else {
                this.counter = 0;
            }
        } else {
            if (decreaseAmount >= 0) {
                this.counter -= decreaseAmount;
            }
        }
    }
}
