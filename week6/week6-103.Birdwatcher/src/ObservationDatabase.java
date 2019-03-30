
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
public class ObservationDatabase {

    private Scanner scanner;
    private ArrayList<Bird> oBirds;

    public ObservationDatabase(Scanner scanner) {
        this.scanner = scanner;
        this.oBirds = new ArrayList<Bird>();
    }

    public void start() {
        System.out.print("? ");
        String sCommand = this.scanner.nextLine();
        while (true) {
            if (sCommand.equals("Add")) {
                addBird();
                break;
            } else if (sCommand.equals("Observation")) {
                addObservation();
                break;
            } else if (sCommand.equals("Statistics")) {
                printStatistics();
                break;
            } else if (sCommand.equals("Show")) {
                printBird();
                break;
            } else if (sCommand.equals("Quit")) {
                break;
            } else {
                System.out.print("? ");
                sCommand = this.scanner.nextLine();
            }
        }
    }

    public void addBird() {
        System.out.print("Name: ");
        String sBirdName = this.scanner.nextLine();

        while (true) {
            if (sBirdName.isEmpty()) {
                System.out.print("Name: ");
                sBirdName = this.scanner.nextLine();
            } else {
                break;
            }
        }

        System.out.print("Latin Name: ");
        String sBirdLatinName = this.scanner.nextLine();
        while (true) {
            if (sBirdLatinName.isEmpty()) {
                System.out.print("Latin Name: ");
                sBirdLatinName = this.scanner.nextLine();
            } else {
                break;
            }
        }

        this.oBirds.add(new Bird(sBirdName, sBirdLatinName));
        start();
    }

    public void addObservation() {
        String sResult = "";
        System.out.print("What was observed:? ");
        String sObserved = this.scanner.nextLine();

        while (true) {
            if (sObserved.isEmpty()) {
                System.out.print("What was observed:? ");
                sObserved = this.scanner.nextLine();
            } else {
                break;
            }
        }

        for (Bird bird : this.oBirds) {
            if (bird.getBirdName().equals(sObserved)) {
                bird.increaseObserved();
                sResult = "";
                break;
            } else {
                sResult = "Is not a bird!";
            }
        }

        if (!sResult.isEmpty()) {
            System.out.println(sResult);
        }

        start();
    }

    public void printStatistics() {
        for (Bird bird : this.oBirds) {
            System.out.println(bird.toString());
        }

        start();
    }

    public void printBird() {
        String sResult = "";
        System.out.print("What? ");
        String sRequest = this.scanner.nextLine();

        while (true) {
            if (sRequest.isEmpty()) {
                System.out.print("What? ");
                sRequest = this.scanner.nextLine();
            } else {
                break;
            }
        }
        
        for (Bird bird : this.oBirds) {
            if (bird.getBirdName().equals(sRequest)) {
                sResult = bird.toString();
                break;
            } else {
                sResult = "Is not a bird!";
            }
        }
        
        System.out.println(sResult);
        start();
    }
}
