/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.game.WormGame;

/**
 *
 * @author Kenny
 */
public class DrawingBoard extends JPanel implements Updatable{
    
    private WormGame wormGame;
    private int pieceLength;
    
    public DrawingBoard(WormGame wormGame, int pieceLength) {
        this.wormGame = wormGame;
        this.pieceLength = pieceLength;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        g.setColor(Color.BLACK);
        for (Piece p : this.wormGame.getWorm().getPieces()) {
            g.fill3DRect(p.getX() * this.pieceLength, p.getY() * this.pieceLength, this.pieceLength, this.pieceLength, true);
        }
        
        g.setColor(Color.RED);
        Apple apple = this.wormGame.getApple();
        g.fillOval(apple.getX() * this.pieceLength, apple.getY() * this.pieceLength, this.pieceLength, this.pieceLength);
    }

    @Override
    public void update() {
        this.repaint();
    }
    
    
}
