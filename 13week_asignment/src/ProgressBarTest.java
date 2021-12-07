package com.test;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.beans.*;
import java.util.Random;
import com.test.ProgressBarView.ProgressBarView;
import com.test.Task.*;

public class ProgressBarTest  {
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("ProgressBarDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComponent newContentPane = new ProgressBarView();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("Application is started! - " + Thread.currentThread().getName());
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                System.out.println("invokeLater() - " + Thread.currentThread().getName());
                createAndShowGUI();
            }
        });
    }
}