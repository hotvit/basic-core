/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class collection1 {

    public static void main(String[] args) {
        // Create list with no parameter
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            // Add element to list
            list.add("0" + i);

        }
        
        // traversing the list in the forward direction
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }

        

    }
}
