package calculator.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kenny
 */
public class Calculator {
    
    private int value;
    
    public Calculator() {
        this.value = 0;
    }
    
    public int add(int number) {
        this.value += number;
        return this.value;
    }
    
    public int subtract(int number) {
        this.value -= number;
        return this.value;
    }
    
    public void reset() {
        this.value = 0;
    }
    
    public int getValue() {
        return this.value;
    }
}
