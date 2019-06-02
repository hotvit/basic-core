/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhap;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ti
 */
public class NewClass {
    public static void main(String[] args) {
        try {
            InetAddress ia = InetAddress.getLocalHost();
            System.out.println(ia.getHostAddress());
            System.out.println(ia.getHostName());
            
            
        } catch (UnknownHostException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
