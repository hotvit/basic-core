/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhap;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class exBoxingUnboxing_OK_ROI {
    public static void main(String[] args) {
        int i = 100;
        Integer I = new Integer(i);
        System.out.println("I: "+I);
//        I+=49;
        int ii = I.intValue();
        System.out.println("ii: "+ii);
        
        List<Integer> li = new ArrayList<>();
        for (int j = 0; j < 4; j++) {
            li.add(j);
        }
        
        for (int integer : li) {
            System.out.println(integer);
        }
        
        
        
        
    }
}
