package com.khatchshah;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Main extends JFrame {

    private JTextField textField;
    private JButton button;
    private JLabel label;
    
    public Main() {
        // Set up the frame
        setTitle("My Simple GUI");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center on screen
        
        // Create components
        textField = new JTextField(15);
        button = new JButton("Submit");
        label = new JLabel("Enter text and click Submit");
        
        // Set layout
        setLayout(new FlowLayout());
        
        // Add components to frame
        add(label);
        add(textField);
        add(button);
        
        // Add action listener to button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                JOptionPane.showMessageDialog(null, "You entered: " + text);
            }
        });
    }

    public static void main(String[] args) {

        // Run GUI in Event Dispatch Thread for thread safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main myMain = new Main();
                myMain.setVisible(true);
            }
        });
    }
}