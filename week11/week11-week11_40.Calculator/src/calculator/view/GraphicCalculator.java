package calculator.view;


import calculator.controller.ClickListener;
import calculator.model.Calculator;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    
    private JFrame frame;
    private int height;
    private Calculator calc;
    
    public GraphicCalculator(Calculator calc) {
        this.height = 200;
        this.calc = calc;
    }

    @Override
    public void run() {
        this.frame = new JFrame("Calculator");
        this.frame.setPreferredSize(new Dimension(this.height * 16 / 9, this.height));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        this.createComponents(this.frame.getContentPane());
        this.frame.pack();
        this.frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        
        JTextField output = new JTextField(String.valueOf(this.calc.getValue()));
        output.setEnabled(false);
        JTextField input = new JTextField();
        
        ClickListener listener = new ClickListener(output, input, this.calc);
        JPanel interactionPanel = new InteractionPanel(listener);
        
        
        container.add(output);
        container.add(input);
        container.add(interactionPanel);
    }

    public JFrame getFrame() {
        return frame;
    }
}
