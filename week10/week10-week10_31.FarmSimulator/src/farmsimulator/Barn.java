/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;

/**
 *
 * @author Kenny
 */
public class Barn {
    
    private BulkTank tank;
    private MilkingRobot milkingRobot;
    
    public Barn(BulkTank tank) {
        this.tank = tank;
    }
    
    public BulkTank getBulkTank() {
        return this.tank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.milkingRobot = milkingRobot;
        this.milkingRobot.setBulkTank(this.tank);
    }
    
    public void takeCareOf(Cow cow) {
        try {
            this.milkingRobot.milk(cow);
        } catch (Exception e) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
    }
    
    public void takeCareOf(Collection<Cow> cows) {
        for(Cow cow : cows) {
            try {
                this.takeCareOf(cow);
            } catch (Exception e) {
                throw new IllegalStateException("The MilkingRobot hasn't been installed");
            }
        }
    }
    
    @Override
    public String toString() {
        return Math.ceil(this.tank.getVolume()) + "/" + Math.ceil(this.tank.getCapacity());
    }
}
