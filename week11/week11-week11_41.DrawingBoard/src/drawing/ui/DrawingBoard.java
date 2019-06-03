package drawing.ui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {

    public DrawingBoard() {
        super.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        
        graphics.fillRect(80, 40, 50, 50);
        graphics.fillRect(250, 40, 50, 50);
        
        graphics.fillRect(40, 200, 50, 50);
        graphics.fillRect(290, 200, 50, 50);
        
        graphics.fillRect(90, 250, 200, 50);
    }
}
