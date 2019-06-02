/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoChuoiString;

/**
 *
 * @author ti
 */
public class demo {
    public static void main(String[] args) {
        
    String pat = "0123 6544";
    int tong =0;
    try{
    for(int i = 0;i<=pat.length();i++){
       String pat1= pat.replaceAll(" ", "0");
     int a=Integer.parseInt(String.valueOf(pat1.charAt(i)));
        if (a >= 0 && a <= 9) {
                tong += a;
            }
       System.out.println(a);
        System.out.println("Tong= "+tong);
        
    }
    
    }catch(Exception e){
   
    }
    
     
}
}