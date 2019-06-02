/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhap2;

/**
 *
 * @author Admin
 */
public class nhap2 {
    public static void main(String[] args) {
        int[] x = {5,6,7,8};
        for (int i = 0; i < x.length; i++) {
            if (x[i]%2 ==0) {
//                continue;
                break;
            }
            System.out.print(x[i]);
        }
        
        
    }
   
    
    
}
