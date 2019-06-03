/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Kenny
 */
public class KeyboardListener implements KeyListener{
    
    private Figure figure;
    private Component component;
    
    public KeyboardListener(Component component, Figure figure) {
        this.figure = figure;
        this.component = component;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()) {
            case KeyEvent.VK_UP:
                this.figure.move(0, -1);
                break;
            case KeyEvent.VK_LEFT:
                this.figure.move(-1, 0);
                break;
            case KeyEvent.VK_DOWN:
                this.figure.move(0, 1);
                break;
            case KeyEvent.VK_RIGHT:
                this.figure.move(1, 0);
                break;
        }
        
        this.component.repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}
