package skill.bilders;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI {
    public static void main(String[] args) {
        // Create the window frame
        JFrame frame = new JFrame("Fun Java Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLayout(new FlowLayout());

        // Create UI elements
        JLabel textLabel = new JLabel("Click the button for a surprise!");
        JButton actionButton = new JButton("Click Me!");

        // Add functionality to the button
        actionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "🚀 im bord!");
            }
        });

        // Add elements to the frame and display it
        frame.add(textLabel);
        frame.add(actionButton);
        frame.setLocationRelativeTo(null); // Centers window on screen
        frame.setVisible(true);
    }
}

