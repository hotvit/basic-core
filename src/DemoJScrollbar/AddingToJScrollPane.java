/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoJScrollbar;

/**
 *
 * @author Admin
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

public class AddingToJScrollPane {

  public static void main(String args[]) {
    JFrame frame = new JFrame("Tabbed Pane Sample");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel label = new JLabel("Label");
    label.setPreferredSize(new Dimension(1000, 1000));
    JScrollPane jScrollPane = new JScrollPane(label);

    JButton jButton1 = new JButton();

    jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    jScrollPane.setViewportBorder(new LineBorder(Color.RED));
    jScrollPane.getViewport().add(jButton1, null);

    frame.add(jScrollPane, BorderLayout.CENTER);
    frame.setSize(400, 150);
    frame.setVisible(true);
  }
}
