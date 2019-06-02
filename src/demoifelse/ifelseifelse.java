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
public class ifelseifelse {
    public static void main(String[] args) {
        int max=3,a=3,b=2,c=1,min=1;
        String d="abc",e="abc",f="bca";
        if(min==a){
            System.out.println("1.Min: "+a);
           
        }else if(min==b) {
            System.out.println("1.Min: "+b);
            
        }else{
            System.out.println("1.Min: "+c);
        }
       
        
        int name=(max==c)? c : (max==b)? b:a;
        System.out.println("2.Max: "+name);
       
        String kt =(d.equals(e))? "Dung":"Sai";
        System.out.println("Test: "+kt);
        
        
        
    }
    
    
}
