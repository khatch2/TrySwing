package com.khatchshah;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Try2 extends JFrame {
    private JButton button1;
    private JTextField textField1;
    private JLabel tryLabel1;

    public Try2() {
        setTitle("Try2");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textField1 = new JTextField(10);
        button1 = new JButton("Submit");
        tryLabel1 = new JLabel("Enter Your Name? ");

        setLayout(new FlowLayout());

        add(textField1);
        add(button1);
        add(tryLabel1);

        button1.addActionListener(new ActionListener() {

            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String yourName = textField1.getText();
                JOptionPane.showMessageDialog(
                        null
                        ,"Your name: " + yourName,
                        "TheTitle",
                        JOptionPane.INFORMATION_MESSAGE
                        );
            }
        });
    }
}
