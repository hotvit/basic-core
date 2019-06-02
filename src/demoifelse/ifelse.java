/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoifelse;

/**
 *
 * @author Admin
 */
public class ifelse {
    public static void main(String[] args) {
        int max=0,a=1,b=2,min=0;
        
        if(a>b){
            min=b;
           
        }else{
            min=a;
            
        }
        System.out.println("1.Min: "+min);
        
        max=(a>b)?a:b;
        System.out.println("2.Max: "+max);
        
        
    }
}
