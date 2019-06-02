/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoCollection;
import java.util.*;
import DoiTuong.Stu;

/**
 *
 * @author ti
 */
public class DemoListInter {
        static List<Stu> list = new ArrayList<>();
        static Stu a = null;
        static int i=0;
        public static void main(String[] args) {
            
            
            
           createStu("Te",1);
           createStu("Tum",2);
           createStu("Tu",3);
          
           
           
        try{
            while(list.size()<5){
                System.out.println("Name: "+list.get(i).getName());
                System.out.println("Age: "+list.get(i).getAge());
                i++;
            }            
        }catch(IndexOutOfBoundsException ex){
                System.out.println("Het Mang "+ex);
        }
        
    }
        
    public static void createStu(String name,int age){
        int u=0;
        a = new Stu();
            a.setName(name);
            a.setAge(age);
        list.add(a);
    }    
        
    
    
}
