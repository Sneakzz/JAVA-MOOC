/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author Kenny
 */
public class ProductContainerRecorder extends ProductContainer{
    
    private ContainerHistory containerHistory;
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        this.containerHistory = new ContainerHistory();
        super.addToTheContainer(initialVolume);
        this.containerHistory.add(initialVolume);
    }
    
    @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        this.containerHistory.add(super.getVolume());
    }
    
    @Override
    public double takeFromTheContainer(double amount) {
        double returnAmount = super.takeFromTheContainer(amount);
        this.containerHistory.add(super.getVolume());
        return returnAmount;
    }
    
    public String history() {
        return this.containerHistory.toString();
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history());
        System.out.println("Greatest product amount: " + this.containerHistory.maxValue());
        System.out.println("Smallest product amount: " + this.containerHistory.minValue());
        System.out.println("Average: " + this.containerHistory.average());
        System.out.println("Greatest change: " + this.containerHistory.greatestFluctuation());
        System.out.println("Variance: " + this.containerHistory.variance());
    }
    
}
