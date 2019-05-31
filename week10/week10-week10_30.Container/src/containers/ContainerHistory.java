/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kenny
 */
public class ContainerHistory {
    
    private List<Double> history;
    
    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }
    
    public void add(double situation) {
        this.history.add(situation);
    }
    
    public void reset() {
        this.history.clear();
    }
    
    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        
        double max = Double.MIN_VALUE;
        for (Double value : this.history) {
            if (value > max) {
                max = value;
            }
        }
        
        return max;
    }
    
    public double minValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        
        double min = Double.MAX_VALUE;
        for (Double value : this.history) {
            if (value < min) {
                min = value;
            }
        }
        
        return min;
    }
    
    public double average() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        
        double total = 0.0;
        for (Double value : this.history) {
            total += value;
        }
        
        return total / this.history.size();
    }
    
    public double greatestFluctuation() {
        if (this.history.isEmpty() || this.history.size() == 1) {
            return 0.0;
        }
        
        double biggestFluctuation = Double.MIN_VALUE;
        for (int i = 0; i < this.history.size() - 1; i++) {
            double fluctuation = Math.abs(this.history.get(i) - this.history.get(i+1));
            if (fluctuation > biggestFluctuation) {
                biggestFluctuation = fluctuation;
            }
        }
        
        return biggestFluctuation;
    }
    
    public double variance() {
        if (this.history.isEmpty() || this.history.size() == 1) {
            return 0.0;
        }
        
        double average = this.average();
        double variance = 0.0;
        for (Double value : this.history) {
            variance += (value - average) * (value - average);
        }
        
        return variance / (this.history.size() - 1);
    }
    
    
    @Override
    public String toString() {
        return this.history.toString();
    }
}
