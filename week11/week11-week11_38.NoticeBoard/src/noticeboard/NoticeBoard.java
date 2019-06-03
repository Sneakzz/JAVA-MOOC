package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;
    private int height = 200;

    @Override
    public void run() {
        this.frame = new JFrame();
        this.frame.setPreferredSize(new Dimension(this.height * 16 / 9, 200));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        this.createComponents(this.frame.getContentPane());
        this.frame.pack();
        this.frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        
        JTextField textField = new JTextField();
        JButton button = new JButton("Copy!");
        JLabel label = new JLabel();
        
        ActionEventListener listener = new ActionEventListener(textField, label);
        button.addActionListener(listener);
        
        container.add(textField);
        container.add(button);
        container.add(label);
    }
}
