
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kenny
 */
public class VehicleRegister {
    
    private HashMap<RegistrationPlate, String> owners;
    
    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner) {
        if (this.owners.containsKey(plate)) {
            return false;
        }
        
        this.owners.put(plate, owner);
        return true;
    }
    
    public String get(RegistrationPlate plate) {
        return this.owners.get(plate);
    }
    
    public boolean delete(RegistrationPlate plate) {
        if (!this.owners.containsKey(plate)) {
            return false;
        }
        
        this.owners.remove(plate);
        return true;
    }
    
    public void printRegistrationPlates() {
        for (RegistrationPlate key : this.owners.keySet()) {
            System.out.println(key);
        }
    }
    
    public void printOwners() {
        String printedValues = "";
        
        for (String owner : this.owners.values()) {
            if (!printedValues.contains(owner)) {
                System.out.println(owner);
                printedValues += owner + " ";
            }
        }
        
    }
}
