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
public class StringBuilderDemo {
    public static void main(String[] args) {
        System.out.println(getString("index"));
        
        
    }
    
    public static String getString(String demo){
        StringBuilder sb = new StringBuilder("home.");
        sb.append(demo);
        return sb.append(".title").toString();
    }
    
}
