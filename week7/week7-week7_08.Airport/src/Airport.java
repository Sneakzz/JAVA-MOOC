
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kenny
 */
public class Airport {
    
    private Scanner reader;
    private UI ui;
    private HashMap<String, Plane> planes;
    private ArrayList<Flight> flights;
    
    public Airport(Scanner reader) {
        this.reader = reader;
        this.ui = new UI(reader, this);
        this.planes = new HashMap<String, Plane>();
        this.flights = new ArrayList();
    }
    
    public void run() {
        this.ui.run();
    }
    
    public void addPlane(String id, int cap) {
        Plane plane = new Plane(id, cap);
        this.planes.put(id, plane);
    }
    
    public boolean checkPlane(String planeId) {
        return this.planes.containsKey(planeId);
    }
    
    public Plane getPlane(String id) {
        return this.planes.get(id);
    }
    
    public ArrayList<Plane> getPlanes() {
        ArrayList<Plane> listOfPlanes = new ArrayList(this.planes.values());
        return listOfPlanes;
        
    }
    
    public void addFlight(String id, String depCode, String destCode) {
        Flight flight = new Flight(this.planes.get(id), depCode, destCode);
        this.flights.add(flight);
    }

    public ArrayList<Flight> getFlights() {
        return this.flights;
    }

}
