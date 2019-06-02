/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractClass;

/**
 *
 * @author Admin
 */
public class MyClass {

    static public int X = 2;

    public static void main(String[] args) {
        MyClass o1 = new MyClass();
        MyClass o2 = new MyClass();
        X = 5;
        System.out.printf("x=%d, y=%d, z=%d", o1.X, o2.X, MyClass.X);
    }
    
    void method(int...x){
    
    }
    
    void method(int x,int...y){
    
    }
    
}
