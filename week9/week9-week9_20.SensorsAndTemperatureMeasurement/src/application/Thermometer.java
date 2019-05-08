/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Kenny
 */
public class Thermometer implements Sensor{
    
    private boolean on;
    
    public Thermometer() {
        this.on = false;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void on() {
        this.on = true;
    }

    @Override
    public void off() {
        this.on = false;
    }

    @Override
    public int measure() {
        if (this.isOn()) {
            int min = -30;
            int max = 30;
            Random r = new Random();
            return r.nextInt(max - min) + min;
        } else {
            throw new IllegalStateException("The thermometer is not on!");
        }
    }
    
}
