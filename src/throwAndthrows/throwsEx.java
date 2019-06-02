/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throwAndthrows;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class throwsEx {


    void method() throws IOException {
        throw new IOException("device bi loi roi ne");
    }

    public static void main(String args[]) throws IOException{
        throwsEx obj = new throwsEx();
        obj.method();
        System.out.println("normal flow...");
        
    }
    
    static void throwsFromMain(){
        try {
            main(new String[]{""});
            
        } catch (IOException ex) {
            System.out.println("Loi o day ne");
            ex.printStackTrace();
        }
    
    
    }
    
}
