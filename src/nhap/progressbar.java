/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhap;

/**
 *
 * @author Admin
 */

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import javax.swing.SwingUtilities; 
import javax.swing.Timer; 
import javax.swing.UIManager; 
public class progressbar extends javax.swing.JFrame { 
    private Timer objTimer; 
    private int a; 
    /** Creates new form progressbar */ 
    public progressbar() { 
         try { 
                UIManager.setLookAndFeel( 
                        UIManager.getSystemLookAndFeelClassName()); 
                SwingUtilities.updateComponentTreeUI(this); 
            } catch (Exception e) { 
          } 
        initComponents(); 
    } 
    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                           
    private void initComponents() { 

        jProgressBar1 = new javax.swing.JProgressBar(); 

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); 
        setTitle("uso del time"); 
        addWindowListener(new java.awt.event.WindowAdapter() { 
            public void windowOpened(java.awt.event.WindowEvent evt) { 
                formWindowOpened(evt); 
            } 
        }); 

        jProgressBar1.setForeground(new java.awt.Color(0, 255, 51)); 
        jProgressBar1.setStringPainted(true); 

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane()); 
        getContentPane().setLayout(layout); 
        layout.setHorizontalGroup( 
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
            .addGroup(layout.createSequentialGroup() 
                .addGap(83, 83, 83) 
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE) 
                .addContainerGap(43, Short.MAX_VALUE)) 
        ); 
        layout.setVerticalGroup( 
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
            .addGroup(layout.createSequentialGroup() 
                .addGap(134, 134, 134) 
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE) 
                .addContainerGap(143, Short.MAX_VALUE)) 
        ); 

        pack(); 
    }// </editor-fold>                         

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                   
        // TODO add your handling code here: 
        objTimer =new Timer(1000,new ClaseTimer()); 
        objTimer.start(); 
         
    }                                  
    public class ClaseTimer implements ActionListener{ 
        public void actionPerformed(ActionEvent e){ 
            a=jProgressBar1.getValue(); 
            if(a<100){ 
                 a++; 
                 jProgressBar1.setValue(a); 
            } 
            else 
                objTimer.stop(); 
            //cerrar(); 
        } 
    } 
    private void cerrar(){ 
        this.dispose(); 
    } 
    public static void main(String args[]) { 
        java.awt.EventQueue.invokeLater(new Runnable() { 

            public void run() { 
                new progressbar().setVisible(true); 
            } 
        }); 
    } 
    // Variables declaration - do not modify                      
    private javax.swing.JProgressBar jProgressBar1; 
    // End of variables declaration                    
} 