/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Kenny
 */
public class Main {
    
    public static void main(String[] args) {
        // testing the ConstantSensor class
//        ConstantSensor ten = new ConstantSensor(10);
//        ConstantSensor minusFive = new ConstantSensor(-5);
//        
//        System.out.println(ten.measure());
//        System.out.println(minusFive.measure());
//        
//        System.out.println(ten.isOn());
//        ten.off();
//        System.out.println(ten.isOn());

        // testing the AverageSensor class
        Sensor sensor1 = new Thermometer();
        Sensor sensor2 = new Thermometer();
        Sensor sensor3 = new Thermometer();
        
        AverageSensor avgSensor = new AverageSensor();
        avgSensor.addSensor(sensor1);
        avgSensor.addSensor(sensor2);
        avgSensor.addSensor(sensor3);
        
        avgSensor.on();
        System.out.println("The temperature for avgSensor is " + avgSensor.measure() + " degrees");
        System.out.println("The temperature for avgSensor is " + avgSensor.measure() + " degrees");
        System.out.println("The temperature for avgSensor is " + avgSensor.measure() + " degrees");
        
        System.out.println("readings: " + avgSensor.readings());
    }
}
