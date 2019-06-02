/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowlayoutexample;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author IT
 */
public class FlowLayoutExample {

    FlowLayoutExample() {
//        tao jframe
        JFrame jFrame = new JFrame("FlowLayout Example");
        //tao 6 button
        JButton jbtn1 = new JButton("Button 1");
        JButton jbtn2 = new JButton("Button 2");
        JButton jbtn3 = new JButton("Button 3");
        JButton jbtn4 = new JButton("Button 4");
        JButton jbtn5 = new JButton("Button 5");
        JButton jbtn6 = new JButton("Button 6");
        //add vào jframe
        jFrame.getContentPane().add(jbtn1);
        jFrame.getContentPane().add(jbtn2);
        jFrame.getContentPane().add(jbtn3);
        jFrame.getContentPane().add(jbtn4);
        jFrame.getContentPane().add(jbtn5);
        jFrame.getContentPane().add(jbtn6);
//        set cac thuộc tính cho jframe
//          jFrame.setLayout(new FlowLayout());
//        jFrame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
//        jFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
//        jFrame.setLayout(new FlowLayout(FlowLayout.RIGHT));
//        jFrame.setLayout(new FlowLayout(FlowLayout.TRAILING));
//        jFrame.setLayout(new FlowLayout(FlowLayout.LEADING));
        jFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
        jFrame.pack();
        jFrame.setLocation(50, 100);
        jFrame.setSize(700, 600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutExample();
    }

}
