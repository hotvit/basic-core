/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticTutorial;

/**
 *
 * @author Admin
 */
public class myClass {
    static public int x = 100;
    static{
        x+=100;
    }
    public static void method(){
        x+=200;
    }
            
    public static void main(String[] args) {
        myClass mc = new myClass();
        mc.x += 300;
        myClass.x +=500;
//        myClass.method();
        System.out.println(x);
        
    }
    
    
    
}
