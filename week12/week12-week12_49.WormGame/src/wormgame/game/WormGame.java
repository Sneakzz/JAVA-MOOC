package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.*;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;

    private Random r;
    private Worm worm;
    private Apple apple;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;
        this.r = new Random();

        // create the game worm
        this.worm = new Worm(this.width / 2, this.height / 2, Direction.DOWN);

        this.apple = new Apple(this.r.nextInt(this.width), this.r.nextInt(this.height));
        while (true) {
            this.apple.setNewXY(this.r.nextInt(this.width), this.r.nextInt(this.height));
            if (!this.worm.runsInto(this.apple)) {
                break;
            }
        }

        addActionListener(this);
        setInitialDelay(2000);
    }

    public Worm getWorm() {
        return this.worm;
    }

    public void setWorm(Worm worm) {
        this.worm = worm;
    }

    public Apple getApple() {
        return this.apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!continues) {
            return;
        }

        this.worm.move();

        if (this.worm.runsInto(this.apple)) {
            this.worm.grow();

            while (worm.runsInto(apple)) {
                this.apple = new Apple(new Random().nextInt(this.width), new Random().nextInt(this.height));
            }
        }

        if (this.worm.runsIntoItself()) {
            this.continues = false;
        }

        for (Piece p : this.worm.getPieces()) {
            if (p.getX() >= this.width || p.getX() <= 0 || p.getY() >= this.height || p.getY() <= 0) {
                this.continues = false;
            }
        }

        this.updatable.update();
        this.setDelay(1000 / this.worm.getLength());
    }

}
