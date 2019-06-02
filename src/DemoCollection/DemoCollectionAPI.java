/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoCollection;
import java.util.*;
/**
 *
 * @author ti
 */
public class DemoCollectionAPI {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int i=0;
    while(i<7){
        list.add(i);
        if(i<4){
            list2.add(i);
        }
        i++;
    }
        i=4;
    while(i<12){
        set.add(i);
        i++;
    }   
    
        //khac nhau giua List va Set
        set.add(6);
        list.add(6);        
        System.out.println("list: "+list);
        System.out.println("set: "+set);
    //API Collection
        //Tra ve true vi list dc trung set k dc trung 
        list.addAll(set);
        //Tra ve false vi list dc trung set k dc trung
        set.addAll(list);        
        System.out.println("list hop set: "+list.toString());
        System.out.println("set hop list: "+set.toString());
        
        System.out.print("list moi: ");
        for(int a = 0;a<list.size();a++){
            System.out.print(+list.get(a)+",");
        }
        System.out.println("");
        System.out.println("set moi: "+set);
        
        
        //
        list.add(1000);
        System.out.println("list add 1000: "+list.toString());
        list.removeAll(set);
        set.removeAll(list2);
        
        System.out.println("list hieu set: "+list.toString());
        System.out.println("list 2: "+list2.toString());
        System.out.println("set hieu list2: "+set);
        
        nap(list,set);
        System.out.println("list sau nap: "+list.toString());
        System.out.println("set sau nap: "+set);
        
        list.retainAll(set);
        set.retainAll(list);
        
        System.out.println("list giao set: "+list.toString());
        System.out.println("set giao list: "+set);
        
    }
    
    public static void nap(List a,Set b){
        int i=0;
        while(i<7){
        a.add(i);
        i++;
    }
        i=4;
    while(i<12){
        b.add(i);
        i++;
    }   
    }
    
    
}
