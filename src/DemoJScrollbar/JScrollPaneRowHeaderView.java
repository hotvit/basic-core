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
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class JScrollPaneRowHeaderView extends JFrame {
  public JScrollPaneRowHeaderView() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel = new JPanel(new GridLayout(5, 10));
    for (int i = 0; i < 50; i++) {
      panel.add(new JLabel("  Label " + i));
    }

    JScrollPane scrolled = new JScrollPane(panel);
    scrolled.setRowHeaderView(new JLabel("Labels: "));

    getContentPane().add(scrolled, BorderLayout.CENTER);

    pack();
    setSize(300, 100);
    setVisible(true);
  }

  public static void main(String[] args) {
    new JScrollPaneRowHeaderView();
  }
}