/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalize_trong_java;

/**
 *
 * @author ti
 */
public class FinalizeExample {
    
    public void finalize() {
        System.out.println("finalize called");
    }
 
    public static void main(String[] args) {
        FinalizeExample f1 = new FinalizeExample();
        FinalizeExample f2 = new FinalizeExample();
        FinalizeExample f3 = new FinalizeExample();
        f1 = f3;
        f2 = null;
        //do f1 bi tham chieu tu f3 nen chi xuat ra f2 f3
        System.gc();
    }

    
}
