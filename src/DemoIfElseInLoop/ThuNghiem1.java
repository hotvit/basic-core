/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoIfElseInLoop;
import DoiTuong.Emp;
import java.util.*;
/**
 *
 * @author ti
 */
public class ThuNghiem1 {
    static List<Emp> list = new ArrayList<>();
    
    public static boolean checkExist(String a){
        for(int i=0;i<=list.size()-1;i++){
        if(!a.equalsIgnoreCase(list.get(i).getMaNV())){
            return true;
        }else{
            return false;        
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
        
        String[] arr=new String[5];
        arr[0]="td";
        arr[1]="tc";
        arr[2]="te";
        arr[3]="teo";
        arr[4]="tu";
        
        for (String nv : arr) {
            if (checkExist(nv) == true) {
                System.out.println("Khong");
            } else {
                System.out.println("Co "+nv);
                break;
            }
        }        
    }
    
}
