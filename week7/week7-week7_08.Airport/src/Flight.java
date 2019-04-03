/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kenny
 */
public class Flight {
    private Plane plane;
    private String departureCode;
    private String destinationCode;
    
    public Flight(Plane plane, String depCode, String destCode) {
        this.plane = plane;
        this.departureCode = depCode;
        this.destinationCode = destCode;
    }
    
    @Override
    public String toString() {
        return this.plane.toString() + " (" + this.departureCode + "-" + this.destinationCode + ")";
    }
}
