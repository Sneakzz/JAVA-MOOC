package wormgame;

import javax.swing.SwingUtilities;
import wormgame.domain.Worm;
import wormgame.gui.UserInterface;
import wormgame.game.WormGame;

public class Main {

    public static void main(String[] args) {
        // testing Worm class
//        Worm worm = new Worm(5, 5, Direction.RIGHT);
//        System.out.println(worm.getPieces());
//        worm.move();
//        System.out.println(worm.getPieces());
//        worm.move();
//        System.out.println(worm.getPieces());
//        worm.move();
//        System.out.println(worm.getPieces());
//
//        worm.grow();
//        System.out.println(worm.getPieces());
//        worm.move();
//        System.out.println(worm.getPieces());
//
//        worm.setDirection(Direction.LEFT);
//        System.out.println(worm.runsIntoItself());
//        worm.move();
//        System.out.println(worm.runsIntoItself());

        // testing the entire game
        WormGame game = new WormGame(20, 20);
        UserInterface ui = new UserInterface(game, 20);
        SwingUtilities.invokeLater(ui);
        
        // when the ui is loaded, then we connect the wormgame to it and the game gets started
        while (ui.getUpdatable() == null) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("The drawing board hasn't been created yet.");
            }
        }
        
        game.setUpdatable(ui.getUpdatable());
        game.start();
    }
}
