/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;

/**
 *
 * @author Kenny
 */
public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double d) {
        Random r = new Random();

        for (int i = 0; i < super.getWidth(); i++) {
            for (int j = 0; j < super.getHeight(); j++) {
                double probability = r.nextDouble();

                if (probability <= d) {
                    this.turnToLiving(i, j);
                }
            }
        }
    }

    @Override
    public boolean isAlive(int i, int i1) {
        if (checkBounds(i, i1)) {
            return super.getBoard()[i][i1];
        }

        return false;
    }

    @Override
    public void turnToLiving(int i, int i1) {
        if (this.checkBounds(i, i1)) {
            super.getBoard()[i][i1] = true;
        }
    }

    @Override
    public void turnToDead(int i, int i1) {
        if (this.checkBounds(i, i1)) {
            super.getBoard()[i][i1] = false;
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int i, int i1) {
        int neighbours = 0;

        // check corners
        // top left
        if (i == 0 && i1 == 0) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if (super.getBoard()[i + j][i1 + k]) {
                        neighbours++;
                    }
                }
            }
        }
        // top right
        if (i == super.getWidth() && i1 == 0) {
            for (int j = 0; j > -2; j--) {
                for (int k = 0; k < 2; k++) {
                    if (super.getBoard()[i + j][i1 + k]) {
                        neighbours++;
                    }
                }
            }
        }
        // bottom right
        if (i == super.getWidth() - 1 && i1 == super.getHeight() - 1) {
            for (int j = 0; j > -2; j--) {
                for (int k = -1; k < 1; k++) {
                    if (super.getBoard()[i + j][i1 + k]) {
                        neighbours++;
                    }
                }
            }
        }
        // bottom left
        if (i == 0 && i1 == super.getHeight()) {
            for (int j = 0; j < 2; j++) {
                for (int k = -1; k < 1; k++) {
                    if (super.getBoard()[i + j][i1 + k]) {
                        neighbours++;
                    }
                }
            }
        }

        // check edges
        // top edge
        if ((i > 0 && i < super.getWidth() - 1) && (i1 == 0)) {
            for (int j = -1; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if (super.getBoard()[i + j][i1 + k]) {
                        neighbours++;
                    }
                }
            }
        }

        // right edge
        if ((i == super.getWidth() - 1) && (i1 > 0 && i1 < super.getHeight() - 1)) {
            for (int j = -1; j < 1; j++) {
                for (int k = -1; k < 2; k++) {
                    if (super.getBoard()[i + j][i1 + k]) {
                        neighbours++;
                    }
                }
            }
        }

        // bottom edge
        if ((i > 0 && i < super.getWidth()) && (i1 == super.getHeight())) {
            for (int j = -1; j < 2; j++) {
                for (int k = -1; k < 1; k++) {
                    if (super.getBoard()[i + j][i1 + k]) {
                        neighbours++;
                    }
                }
            }
        }

        // left edge
        if ((i == 0) && (i1 > 0 && i1 < this.getHeight() - 1)) {
            for (int j = 0; j < 2; j++) {
                for (int k = -1; k < 2; k++) {
                    if (super.getBoard()[i + j][i1 + k]) {
                        neighbours++;
                    }
                }
            }
        }

        // check the center cells of the board
        if ((i > 0 && i < this.getWidth() - 1) && (i1 > 0 && i1 < this.getHeight() - 1)) {
            for (int j = -1; j < 2; j++) {
                for (int k = -1; k < 2; k++) {
                    if (super.getBoard()[i + j][i1 + k]) {
                        if (j != 0 || k != 0) {
                            neighbours++;
                        }
                    }
                }
            }
        }
        return neighbours;
    }

    @Override
    public void manageCell(int i, int i1, int i2) {
        boolean cell = super.getBoard()[i][i1];
        // dead cell comes back to life if it has exactly 3 living neighbours
        if (!cell && i2 == 3) {
            super.getBoard()[i][i1] = true;
        }
        
        // living cell dies if it has less then 2 living neighbours
        if (cell && i2 < 2) {
            super.getBoard()[i][i1] = false;
        }
        
        // living cell dies if it has more then 3 living neighbours
        if (cell && i2 > 3) {
            super.getBoard()[i][i1] = false;
        }
    }

    private boolean checkBounds(int i, int i1) {
        return (i >= 0 && i < super.getWidth()) && (i1 >= 0 && i1 < super.getHeight());
    }

}
