
import java.util.*;
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
    private Simulator simulator;

    public UI(Scanner reader, Simulator simulator) {
        this.reader = reader;
        this.simulator = simulator;
    }

    public void start() {
        System.out.println("Kumpula ski jumping week");
        System.out.println();

        askForParticipants();
        jumpingPhase();
    }

    private void askForParticipants() {
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        while (true) {
            System.out.print("  Participant name: ");
            String name = this.reader.nextLine();

            if (name.trim().isEmpty()) {
                break;
            }

            this.simulator.addJumper(name);
        }
    }

    private void jumpingPhase() {
        System.out.println("");
        System.out.println("The tournament begins!");
        System.out.println();

        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String command = this.reader.nextLine();

            if (command.equals("jump")) {
                printRound();
                List<Jumper> jumpOrder = new ArrayList<Jumper>(this.simulator.getJumpOrder());
                printJumpingOrder(jumpOrder);
                this.simulator.jump();
                printJumpResult(jumpOrder);
                this.simulator.increaseRound();
            } else {
                printEndScreen();
                break;
            }
        }
    }

    private void printRound() {
        System.out.println();
        System.out.println("Round " + this.simulator.getRound());
        System.out.println();
    }

    private void printJumpingOrder(List<Jumper> jumpOrder) {
        System.out.println("Jumping order:");
        int amount = 1;
        for (Jumper jumper : jumpOrder) {
            System.out.println("  " + amount + ". " + jumper);
            amount++;
        }
    }
    
    private void printJumpResult(List<Jumper> jumpOrder) {
        int round = this.simulator.getRound();
        System.out.println();
        System.out.println("Results of round " + round);
        
        for (Jumper jumper : jumpOrder) {
            System.out.println("  " + jumper.getName());
            System.out.println("    length: " + jumper.getJump(round).getLengthPoints());
            System.out.println("    judge votes: " + jumper.getJump(round).getVotePointsList());
        }
        
        System.out.println();
    }
    
    private void printEndScreen() {
        int position = 1;
        List<Jumper> endScreenList = new ArrayList<Jumper>(this.simulator.getJumpOrder());
        System.out.println();
        System.out.println("Thanks!");
        System.out.println();
        
        System.out.println("Tournament results: ");
        System.out.println("Position    Name");
        Collections.reverse(endScreenList);
        for (Jumper jumper : endScreenList) {
            System.out.println(position + "           " + jumper);
            System.out.println("            jump lengths: " + jumper.getJumpLengths());
            position++;
        }
    }

}
