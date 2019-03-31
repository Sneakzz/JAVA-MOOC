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
    
    private Reader reader;
    private int amountOfCalculations;
    
    public Calculator() {
        this.reader = new Reader();
    }
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = this.reader.readString();
            
            if (command.equals("end")) {
                break;
            }
            
            if (command.equals("sum")) {
                sum();
                addCalculation();
            } else if (command.equals("difference")) {
                difference();
                addCalculation();
            } else if (command.equals("product")) {
                product();
                addCalculation();
            }
        }
        
        statistics();
    }
    
    private void sum() {
        int[] values = askForValues();
        
        System.out.println("sum of the values " + (values[0] + values[1]) + "\n");
    }
    
    private void difference() {
        int[] values = askForValues();
        
        System.out.println("difference of the values " + (values[0] - values[1]) + "\n");
    }
    
    private void product() {
        int[] values = askForValues();
        
        System.out.println("product of the values " + (values[0] * values[1]) + "\n");
    }
    
    private void statistics() {
        System.out.println("Calculations done " + this.amountOfCalculations);
    }
    
    private int[] askForValues() {
        int[] values = new int[2];
        
        System.out.print("value1: ");
        values[0] = reader.readInteger();
        System.out.print("value2: ");
        values[1] = reader.readInteger();
        
        return values;
    }
    
    private void addCalculation() {
        this.amountOfCalculations++;
    }
}
