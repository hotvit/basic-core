/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridlayoutexample;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author IT
 */
public class GridLayoutExample {

    GridLayoutExample() {
        //new jframe
        JFrame jFrame = new JFrame("GridLayout Example");
        //tao 8 button
        JButton jbtn1 = new JButton("Button 1");
        JButton jbtn2 = new JButton("Button 2");
        JButton jbtn3 = new JButton("Button 3");
        JButton jbtn4 = new JButton("Button 4");
        JButton jbtn5 = new JButton("Button 5");
        JButton jbtn6 = new JButton("Button 6");
        JButton jbtn7 = new JButton("Button 7");
        JButton jbtn8 = new JButton("Button 8");
        //add vào jframe
        jFrame.getContentPane().add(jbtn1);
        jFrame.getContentPane().add(jbtn2);
        jFrame.getContentPane().add(jbtn3);
        jFrame.getContentPane().add(jbtn4);
        jFrame.getContentPane().add(jbtn5);
        jFrame.getContentPane().add(jbtn6);
        jFrame.getContentPane().add(jbtn7);
        jFrame.getContentPane().add(jbtn8);
        //set các thuộc tính cho JFrame
        jFrame.pack();
        jFrame.setLayout(new GridLayout(2,5));
        jFrame.setLocation(50, 100);
        jFrame.setSize(700, 600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        GridLayoutExample gle = new GridLayoutExample();
    }

}
