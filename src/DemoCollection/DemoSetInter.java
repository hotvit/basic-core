/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoCollection;

import DoiTuong.Stu;
import java.util.*;

/**
 *
 * @author ti
 */
public class DemoSetInter {
    static Set<Stu> set = new HashSet<Stu>();
        static Stu a = null;
        static int i=0;
        public static void main(String[] args) {
            
            
            
           createStu("Te",1);
           createStu("Tum",2);
           createStu("Tu",3);
           
           System.out.println(set.size());
           
          Iterator<Stu> iterator = set.iterator();
        Stu student;
        while (iterator.hasNext()) {
            student = iterator.next();
            System.out.println(student.toString());
            
        }

           
        
    }
        
    public static void createStu(String name,int age){
        a = new Stu();
            a.setName(name);
            a.setAge(age);
        set.add(a);
    }
    
    
}
