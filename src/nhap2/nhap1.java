/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhap2;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class nhap1 {

    public static void main(String[] args) {
        int x = 1, y = 0;
        ArrayList list = new ArrayList();
        list.add(3);
        list.add(9);
        list.add(5);
        list.remove(x);
        list.remove(y);
        
        list.forEach(t -> {
            System.out.println(t);
        });
        
        
        
    }
}
