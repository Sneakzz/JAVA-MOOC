package clicker.ui;

import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        // testing PersonalCalculator class
//        Calculator calc = new PersonalCalculator();
//        System.out.println("Value: " + calc.giveValue());
//        calc.increase();
//        System.out.println("Value: " + calc.giveValue());
//        calc.increase();
//        System.out.println("Value: " + calc.giveValue());
        
        Calculator calc = new PersonalCalculator();
        UserInterface ui = new UserInterface(calc);
        SwingUtilities.invokeLater(ui);
    }
}
