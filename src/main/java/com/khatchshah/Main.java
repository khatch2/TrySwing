package com.khatchshah;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Run GUI in Event Dispatch Thread for thread safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Try2 myTry2 = new Try2();
                myTry2.setVisible(true);
            }
        });
    }
}