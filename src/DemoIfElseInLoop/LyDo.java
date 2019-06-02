/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoIfElseInLoop;

import DoiTuong.Emp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ti
 */
public class LyDo {
    //return la thoat function nen chi xet Emp a trong list ma bo qua Emp b, Emp c
    
    static List<Emp> list = new ArrayList<>();
     public static boolean checkExist(String a){
        for(int i=0;i<list.size()-1;i++){
        if(a.equalsIgnoreCase(list.get(i).getMaNV())){
            return false;
        }else{
            System.out.println(list.get(i).getMaNV());
            return true;        
        }
        
        }
        return false;
        }
    public static void main(String[] args) {
        Emp a = new Emp("Teo");
        Emp b = new Emp("Tung");
        Emp c = new Emp("Tu");
        
        list.add(a);
        list.add(b);
        list.add(c);
        
        String[] arr = new String[5];
            arr[0]="td";
            arr[1]="tc";
            arr[2]="te";
            arr[3]="teo";
            arr[4]="tu";
        for (String nv : arr) {
            System.out.println(checkExist(nv)+" ");
        }
    }
    
    /* REPAIR
    static List<Emp> list = new ArrayList<>();
    public static boolean checkExist(String a){
         int check = 0;
         for (int i = 0; i <= list.size() - 1; i++) {
            if (a.equalsIgnoreCase(list.get(i).getMaNV())) {
                check = 0;
                System.out.println(list.get(i).getMaNV());
                break;
            } else {
                check = 1;
                System.out.println(list.get(i).getMaNV());
            }
        }
        if (check == 1) {
             return true;
        } else {
             return false;
        }
    }
    public static void main(String[] args) {
        Emp a = new Emp("Teo");
        Emp b = new Emp("Tung");
        Emp c = new Emp("Tu");
        
        list.add(a);
        list.add(b);
        list.add(c);
        
        String[] arr = new String[5];
            arr[0]="td";
            arr[1]="tc";
            arr[2]="te";
            arr[3]="teo";
            arr[4]="tu";
        for (String nv : arr) {
            System.out.println(checkExist(nv)+" "+nv+" arr");
            System.out.println("");
        }
    }
    
    
    */
}
