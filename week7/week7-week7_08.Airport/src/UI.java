
import java.util.ArrayList;
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
public class UI {

    private Scanner reader;
    private Airport ap;

    public UI(Scanner reader, Airport ap) {
        this.reader = reader;
        this.ap = ap;
    }

    public void run() {
        displayAirportPanel();
        displayFlightService();
    }

    public void displayAirportPanel() {
        boolean running = true;
        String type = "airport-panel";

        displayHeader(type);

        while (running) {
            String operation = displayOperationChoice(type);
            
            if (operation.equalsIgnoreCase("x")) {
                System.out.println();
                running = false;
            } else if (operation.equalsIgnoreCase("1")) {
                displayAddPlane();
            } else if (operation.equalsIgnoreCase("2")) {
                displayAddFlight();
            }
        }
    }

    public void displayFlightService() {
        boolean running = true;
        String type = "flight-service";

        displayHeader(type);

        while (running) {
            String operation = displayOperationChoice(type);
            
            if (operation.equalsIgnoreCase("x")) {
                System.out.println();
                running = false;
            } else if (operation.equalsIgnoreCase("1")) {
                printPlanes();
            } else if (operation.equalsIgnoreCase("2")) {
                printFlights();
            } else if (operation.equalsIgnoreCase("3")) {
                printPlaneInfo();
            }
        }
    }

    public void displayHeader(String type) {
        if (type.equals("airport-panel")) {
            String airportPanel = "Airport panel\n"
                    + "--------------------\n";
            System.out.println(airportPanel);
        } else if (type.equals("flight-service")) {
            String fs = "Flight service\n"
                    + "------------\n";
            System.out.println(fs);
        }
    }

    public String displayOperationChoice(String type) {
        if (type.equals("airport-panel")) {
            String airportPanel = "Choose operation:\n"
                    + "[1] Add airplane\n"
                    + "[2] Add flight\n"
                    + "[x] Exit";
            System.out.println(airportPanel);
        } else if (type.equals("flight-service")) {
            String fs = "Choose operation:\n"
                    + "[1] Print planes\n"
                    + "[2] Print flights\n"
                    + "[3] Print plane info\n"
                    + "[x] Quit";
            System.out.println(fs);
        }
        
        System.out.print("> ");
        return this.reader.nextLine();
    }

    private void displayAddPlane() {
        String planeId = "";
        int planeCap = -1;
        
        while (planeId.isEmpty() || planeCap < 0) {
            System.out.print("Give plane ID: "); 
            planeId = this.reader.nextLine();
            System.out.print("Give plane capacity: ");
            
            try {
                planeCap = Integer.parseInt(this.reader.nextLine());
            } catch (NumberFormatException e) {
                planeCap = -1;
            }
        }
        
        this.ap.addPlane(planeId, planeCap);
    }

    private void displayAddFlight() {
        String planeId = "";
        String depCode = "";
        String destCode = "";
        
        while (planeId.isEmpty() || depCode.isEmpty() || destCode.isEmpty()) {
            System.out.print("Give plane ID: ");
            planeId = this.reader.nextLine();
            
            if (!this.ap.checkPlane(planeId)) {
                System.out.println("There is no plane with this ID, try again.");
                continue;
            }
                
            System.out.print("Give departure airport code: ");
            depCode = this.reader.nextLine();
            System.out.print("Give destination airport code: ");
            destCode = this.reader.nextLine();
        }
        
        this.ap.addFlight(planeId, depCode, destCode);
    }

    private void printPlanes() {
        ArrayList<Plane> planes = this.ap.getPlanes();
        
        for (Plane plane : planes) {
            System.out.println(plane);
        }
    }

    private void printFlights() {
        ArrayList<Flight> flights = new ArrayList(this.ap.getFlights());
        
        for (Flight flight : flights) {
            System.out.println(flight);
        }
        
        System.out.println();
    }

    private void printPlaneInfo() {
        String planeId = "";
        
        while (planeId.isEmpty()) {
            System.out.print("Give plane ID: ");
            planeId = this.reader.nextLine();
            if (!this.ap.checkPlane(planeId)) {
                System.out.println("There is no plane with this ID, try again.");
                planeId = "";
            }
        }
        
        System.out.println(this.ap.getPlane(planeId));
        System.out.println();
    }

}
