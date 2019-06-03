

import calculator.model.Calculator;
import calculator.view.GraphicCalculator;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        SwingUtilities.invokeLater(new GraphicCalculator(calc));
    }
}
