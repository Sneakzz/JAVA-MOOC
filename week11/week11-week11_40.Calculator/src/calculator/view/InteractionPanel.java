/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.view;

import calculator.controller.ClickListener;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Kenny
 */
public class InteractionPanel extends JPanel{
    
    private ClickListener listener;
    
    public InteractionPanel(ClickListener listener) {
        super(new GridLayout(1, 3));
        this.listener = listener;
        this.createComponents();
    }
    
    private void createComponents() {
        JButton buttonAdd = new JButton("+");
        JButton buttonSubtract = new JButton("-");
        JButton buttonReset = new JButton("Z");
        buttonReset.setEnabled(false);
        
        buttonAdd.addActionListener(this.listener);
        buttonSubtract.addActionListener(this.listener);
        buttonReset.addActionListener(this.listener);
        
        this.listener.setResetButton(buttonReset);
        
        this.add(buttonAdd);
        this.add(buttonSubtract);
        this.add(buttonReset);
    }
}
