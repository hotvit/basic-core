/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhap;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author ti
 */
public class FormSignUp extends JFrame {

    
    private JFrame main;
    private JLabel lblDN,lblUser,lblPass;
    private JTextField txtUser;
    private JPasswordField txtPass;
    private JButton btnLog,btnC;
    private JPanel pane,PanelblUP,PanetxtUP,PanelB;
    
    public FormSignUp(){
        Gui();
        main.setLocationRelativeTo(null);
    }

    private void Gui() {
        main = new JFrame("Sign Up");
        main.setLayout(new BorderLayout());
        main.setSize(300,150);
        main.setResizable(false);
        main.addWindowListener(new WindowAdapter(){
            public void windowClosing(){
                System.exit(0);
            }
        });
        
        lblDN = new JLabel("Sign Up",JLabel.CENTER);
        lblDN.setFont(new Font("Courier", Font.BOLD, 18));
        
        
        lblUser = new JLabel("Username:",showIcon("/image/iu.png"),JLabel.CENTER);
        lblUser.setFont(new Font("Courier", Font.BOLD, 13));
        
        lblPass = new JLabel("Password:",showIcon("/image/ip.png"),JLabel.CENTER);
        lblPass.setFont(new Font("Courier", Font.BOLD, 13));
        
        txtUser=new JTextField("");
        txtUser.setPreferredSize(new Dimension(170,24));        
        txtPass=new JPasswordField("");
        
        btnLog=new JButton("Login");
        
        btnC=new JButton("Cancel");
                
        PanelblUP = new JPanel(new GridLayout(2,1));        
        PanelblUP.add(lblUser);
        PanelblUP.add(lblPass);
        
        PanetxtUP = new JPanel(new GridLayout(2,1));
        PanetxtUP.setSize(PanelblUP.getWidth(),PanelblUP.getHeight());
        PanetxtUP.add(txtUser);
        PanetxtUP.add(txtPass);
        System.out.println(PanetxtUP.getLocation());
        
        PanelB = new JPanel();
        PanelB.add(btnLog);
        PanelB.add(btnC);
        
        pane =new JPanel();
        pane.add(PanelblUP);
        pane.add(PanetxtUP);
                
        main.add(lblDN,BorderLayout.NORTH);
        main.add(pane,BorderLayout.CENTER);
        main.add(PanelB,BorderLayout.SOUTH);
        
        main.setVisible(true);
        
        
    }
    
    public static void main(String[] args) {
        FormSignUp Form = new FormSignUp();
    }
    
    public ImageIcon showIcon(String a){
        java.net.URL imgURL = FormSignUp.class.getResource(a);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            ThongBao("Couldn't find file: "+a);
            return null;
        }
    }
    
    public void ThongBao(String tb) {
        JOptionPane.showMessageDialog(this, tb);
    }

}
