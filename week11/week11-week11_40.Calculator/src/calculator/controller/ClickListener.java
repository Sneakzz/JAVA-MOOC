/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.controller;

import calculator.model.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Kenny
 */
public class ClickListener implements ActionListener{
    
    private JTextField output;
    private JTextField input;
    private Calculator calc;
    private JButton buttonZ;
    
    public ClickListener(JTextField output, JTextField input, Calculator calc) {
        this.output = output;
        this.input = input;
        this.calc = calc;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonPressed = e.getActionCommand();
        if (buttonPressed.equals("+")) {
            this.performAddition();
        }
        if (buttonPressed.equals("-")) {
            this.performSubtraction();
        }
        if (buttonPressed.equals("Z")) {
            this.performReset();
        }
    }
    
    private void performAddition() {
        Integer number = this.getNumber();
        if (number != null) {
            this.calc.add(number);
        }
        this.updateGui();
    }
    
    private void performSubtraction() {
        Integer number = this.getNumber();
        if (number != null) {
            this.calc.subtract(number);
        }
        this.updateGui();
    }
    
    private void performReset() {
        this.calc.reset();
        this.updateGui();
    }
    
    private void updateGui() {
        if (this.calc.getValue() == 0) {
            this.buttonZ.setEnabled(false);
        } else {
            this.buttonZ.setEnabled(true);
        }
        this.output.setText(String.valueOf(this.calc.getValue()));
        this.input.setText("");
    }
    
    private Integer getNumber() {
        Integer number = null;
        
        if (!this.input.getText().isEmpty()) {
            try {
                number = Integer.parseInt(this.input.getText());
            } catch (NumberFormatException e) {
                number = null;
            }
        }
        
        return number;
    }
    
    public void setResetButton(JButton buttonZ) {
        this.buttonZ = buttonZ;
    }
    
}
