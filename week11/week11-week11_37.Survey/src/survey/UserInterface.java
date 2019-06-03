package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        this.frame = new JFrame("Survey");
        this.frame.setPreferredSize(new Dimension(200, 300));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        this.createComponents(this.frame.getContentPane());
        this.frame.pack();
        this.frame.setVisible(true);
    }
    
    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
        JLabel q1 = new JLabel("Are you?");
        JCheckBox yes = new JCheckBox("Yes!");
        JCheckBox no = new JCheckBox("No!");
        
        JLabel q2 = new JLabel("Why?");
        JRadioButton noReason = new JRadioButton("No reason.");
        JRadioButton fun = new JRadioButton("Because it is fun!");
        ButtonGroup bg = new ButtonGroup();
        bg.add(noReason);
        bg.add(fun);
        
        JButton done = new JButton("Done!");
        
        container.add(q1);
        container.add(yes);
        container.add(no);
        container.add(q2);
        container.add(noReason);
        container.add(fun);
        container.add(done);
    }


    public JFrame getFrame() {
        return frame;
    }
}
