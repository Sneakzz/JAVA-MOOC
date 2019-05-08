/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.*;

/**
 *
 * @author Kenny
 */
public class AverageSensor implements Sensor{
    
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor additional) {
        this.sensors.add(additional);
    }
    
    public List<Integer> readings() {
        return this.readings;
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : this.sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor sensor : this.sensors) {
            if (!sensor.isOn()) {
                sensor.on();
            }
        }
    }

    @Override
    public void off() {
        for (Sensor sensor : this.sensors) {
            if (sensor.isOn()) {
                sensor.off();
            }
        }
    }

    @Override
    public int measure() {
        if (!this.isOn() || this.sensors.isEmpty()) {
            throw new IllegalStateException("The sensor is either off or no sensors have been added!");
        }
        
        int total = 0;
        for (Sensor sensor : this.sensors) {
            total += sensor.measure();
        }
        
        int measurement = total / this.sensors.size();
        this.readings.add(measurement);
        
        return measurement;
    }
}
