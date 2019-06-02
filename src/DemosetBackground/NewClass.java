/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemosetBackground;

/**
 *
 * @author ti
 */
/**
 * @(#)DisplayImageOnJPanel.java
 *
 * DisplayImageOnJPanel application
 *
 * @author BUI NGOC SON
 * @version 1.00 2013/11/14
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.event.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class NewClass {
           
    static class TransparentJPanel extends JPanel {{
    setOpaque(false);
}}

public static void main(String... args) throws Exception {

    JFrame frame = new JFrame("Test");

    final JPanel panel;

    frame.add(panel = new JPanel() {{
        add(new TransparentJPanel());
        add(new TransparentJPanel());
        add(new TransparentJPanel());
    }}, BorderLayout.CENTER);

    frame.add(new JButton(new AbstractAction("Toggle") {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (panel.getBackground().equals(Color.RED))
                panel.setBackground(Color.GREEN);
            else
                panel.setBackground(Color.RED);
        }
    }), BorderLayout.SOUTH);


    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 300);
    frame.setVisible(true);
}
}
