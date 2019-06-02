/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhap;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;


/**
 *
 * @author Admin
 */
public class JavaNet {
    public static void main(String[] args) {
        
        try {
            byte[] arr = null;
            String address = "";
            InetAddress  inetaddress = InetAddress.getLocalHost();
            
            for(int i=0;i<= inetaddress.getAddress().length-1;i++){
                arr = new byte[inetaddress.getAddress().length];
                arr[i] = inetaddress.getAddress()[i];
                address = Arrays.toString(arr);
            }
            
            System.out.println("Inet: "+inetaddress);
            System.out.println("Inet Hostname: "+inetaddress.getHostName());
            System.out.println("Inet Address: "+address);
            System.out.println("Inet Canonica Hostname: "+inetaddress.getCanonicalHostName());
            System.out.println("Inet Host Address: "+inetaddress.getHostAddress());
            
        } catch (UnknownHostException ex) {
            System.out.println(ex);
        }
    }
}
