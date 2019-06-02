package Layout;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
//from ww w  .jav  a 2 s.  co  m
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
  public static void main(String[] args) {
    String title = "GridBagLayout";
    JFrame frame = new JFrame(title);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = frame.getContentPane();
    contentPane.setLayout(new GridBagLayout());

    GridBagConstraints gbc = new GridBagConstraints();

    for (int y = 0; y < 3; y++) {
      for (int x = 0; x < 4; x++) {
        gbc.gridx = x;
        gbc.gridy = y;
        String text = "Button (" + x + ", " + y + ")";
        contentPane.add(new JButton(text), gbc);
      }
    }

    frame.pack();
    frame.setVisible(true);
  }
}