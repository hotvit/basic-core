/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceNe;

/**
 *
 * @author Admin
 */
public class class1 implements interface1, interface2{

    @Override
    public void speak() {
        System.out.println("hehe");
    }
    
    public void say(){
        System.out.println("hihi");
    }
    
    public void sua(){
    
    }
    
    public static void main(String[] args) {
        class1 c = new class1(){
            public void sua(){
                System.out.println("woof woof");
            }
            
            @Override
            public void say(){
                System.out.println("ahihi override");
            }
        };
        c.speak();
        c.say();
        c.sua();
    }
    
}
