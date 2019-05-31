/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kenny
 */
public class Dungeon {

    private int length;
    private int height;
    private List<Vampire> vampires;
    private Player player;
    private Scanner reader;

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.vampires = new ArrayList<Vampire>();
        this.player = new Player(moves);
        this.reader = new Scanner(System.in);

        this.generateVampires(vampires, vampiresMove);
    }

    public void run() {
        while (true) {
            if (this.player.getMovesLeft() == 0) {
                System.out.println("YOU LOSE");
                break;
            }
            if (this.vampires.isEmpty()) {
                System.out.println("YOU WIN");
                break;
            }

            this.displayMovesLeft();
            this.displayCharacterPositions();
            this.displayCurrentMapSituation();
            List<Character> commands = this.getMoveCommands();
            this.processCommands(commands);
            this.player.decreaseMoves();

        }
    }

    private void displayMovesLeft() {
        System.out.println(this.player.getMovesLeft());
        System.out.println("");
    }

    private void displayCharacterPositions() {
        System.out.println(this.player);
        for (Vampire vampire : this.vampires) {
            System.out.println(vampire);
        }
        System.out.println("");
    }

    private void displayCurrentMapSituation() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.length; j++) {
                if (this.isPlayerPosition(i, j)) {
                    System.out.print(this.player.getIcon());
                } else if (this.isVampirePosition(i, j)) {
                    Vampire vampire = this.getVampireWithCurrentPostion(i, j);
                    System.out.print(vampire.getIcon());
                } else {
                    System.out.print('.');
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }

    private List<Character> getMoveCommands() {
        String input = this.reader.nextLine();
        List<Character> commands = new ArrayList<Character>();
        if (!input.isEmpty()) {
            for (int i = 0; i < input.length(); i++) {
                Character command = input.charAt(i);
                if (command == 'w' || command == 'a'
                        || command == 's' || command == 'd') {
                    commands.add(command);
                }
            }
        }

        return commands;
    }

    private void processCommands(List<Character> commands) {
        for (Character command : commands) {
            switch (command) {
                case 'w':
                    this.player.moveUp();
                    break;
                case 'a':
                    this.player.moveLeft();
                    break;
                case 's':
                    this.player.moveDown(this.height);
                    break;
                case 'd':
                    this.player.moveRight(this.length);
                    break;
            }

            this.checkForCollision();

            if (!this.vampires.isEmpty()) {
                for (Vampire vamp : this.vampires) {
                    if (vamp.canMove()) {
                        List<Integer> newCoords = vamp.generateMoveCoords();

                        if (!isVampirePosition(newCoords.get(1), newCoords.get(0))
                                && !isOutOfBounds(newCoords.get(1), newCoords.get(0))) {
                            vamp.setX(newCoords.get(0));
                            vamp.setY(newCoords.get(1));
                            this.checkForCollision();
                        }
                    }
                }
            }
        }
    }

    private void checkForCollision() {
        Vampire vampToDelete = null;

        for (Vampire vamp : this.vampires) {
            if (this.player.getX() == vamp.getX() && this.player.getY() == vamp.getY()) {
                // vampire got hit by player
                vampToDelete = vamp;
            }
        }
        this.vampires.remove(vampToDelete);
    }

    private boolean isPlayerPosition(int height, int length) {
        return this.player.getY() == height && this.player.getX() == length;
    }

    private boolean isVampirePosition(int height, int length) {
        boolean isPresent = false;
        for (Vampire vampire : this.vampires) {
            if (vampire.getY() == height && vampire.getX() == length) {
                isPresent = true;
            }
        }

        return isPresent;
    }

    private boolean isOutOfBounds(int height, int length) {
        return length < 0 || length > this.length - 1 || height < 0 || height > this.height - 1;
    }

    private Vampire getVampireWithCurrentPostion(int height, int length) {
        Vampire vampire = null;
        for (Vampire vamp : this.vampires) {
            if (vamp.getY() == height && vamp.getX() == length) {
                vampire = vamp;
            }
        }

        return vampire;
    }

    private void generateVampires(int amount, boolean canMove) {
        while (this.vampires.size() < amount) {
            Vampire vampire = new Vampire(canMove, this.length, this.height);
            if (!this.vampires.contains(vampire)) {
                this.vampires.add(vampire);
            }
        }
    }

    private void addVampire(Vampire vampire) {
        this.vampires.add(vampire);
    }
}
