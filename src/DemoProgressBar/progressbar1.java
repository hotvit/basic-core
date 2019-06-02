/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoProgressBar;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

/**
 *
 * @author Admin
 */
public class progressbar1 extends JFrame {

    JProgressBar jb;
    int i = 0, num = 0;

    progressbar1() {
        jb = new JProgressBar(0, 2000);
        jb.setBounds(40, 40, 200, 30);

        jb.setValue(0);
        jb.setStringPainted(true);

        add(jb);
        setUndecorated(true);
        pack();
        setMinimumSize(new Dimension(200, 30));
        setLocationRelativeTo(null);
//setLayout(new FlowLayout()); 
        
    }

    public void iterate() {
        while (i <= 2000) {
            jb.setValue(i);
            i = i + 20;
            try {
                Thread.sleep(150);
            } catch (Exception e) {
            }
        }
    }
    
    

    public static void main(String[] args) {
        progressbar1 m = new progressbar1();
        m.setVisible(true);
       
    }
}
