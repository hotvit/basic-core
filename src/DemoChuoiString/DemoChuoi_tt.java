/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoChuoiString;

/**
 *
 * @author ti
 */
public class DemoChuoi_tt {
    public static void main(String[] args) {
        //mau
         String pattern= "Day la DEMO ve xu ly Chuoi  ";
        //doan so sanh
        String d1="Day la DEMO ve xu ly Chuoi  ";//i chang
        String d2="Day la demo ve xu ly chuoi  ";//vai chu k hoa
        String d3="day";
        String d4="Day la";
        String d5="cuc cut";
        String regex="[0,9]";
        
        
        //equal()
         System.out.println("Demo equals()");   
        if(d1.equals(pattern))System.out.println("d1=pattern");
        else System.out.println("d1!=pattern");
            
        if(d2.equals(pattern))System.out.println("d2=pattern");
        else System.out.println("d2!=pattern");
       
        //equalIgnoreCase() phan biet so luong ki tu
        System.out.println("Demo equalsIgnoreCase()");
        if(d1.equalsIgnoreCase(pattern))System.out.println("d1=pattern");
        else System.out.println("d1!=pattern");
        
        if(d2.equalsIgnoreCase(pattern))System.out.println("d2=pattern");
        else System.out.println("d2!=pattern");
    
        //contains() boolean(true/false)// phan biet hoa thuong
        System.out.println("Demo contains");
        System.out.println(pattern.contains(d3));
        System.out.println(pattern.contains(d4));
        System.out.println(pattern.contains(d5));
        
        //startsWith() phan biet hoa thuong
        System.out.println("Demo startsWith");
        System.out.println(pattern.startsWith(d3));
        System.out.println(pattern.startsWith(d4));
        
        //endsWith() phan biet hoa thuong
        System.out.println("Demo endsWith()");
        System.out.println(d5.endsWith("cut"));
        System.out.println(pattern.endsWith("Chuoi  "));
        System.out.println(pattern.endsWith("chuoi  "));
        
        //matches() so sanh voi bieu thuc chinh quy regex
        if("9".matches(regex))System.out.println("Khop mau");
        else System.out.println("Deo khop");
        
        //indexOf() tim vi tri dau tien xuat hien cua ky tu/chuoi con(khong thay tra ve -1)
        //vi tri dem tu trai qua phai tren xuong duoi
            //indexOf(String str) tra ve vi tri bat dau chuoi str
            System.out.println(pattern.indexOf(" l"));
            //indexOf(int ch ) tra ve vi tri bat dau ky tu ch
            System.out.println(pattern.indexOf("y"));
            //indexOf(String str,int fromIndex)
            //tra ve vi tri bat dau chuoi str sau vi tri fromIndex
            //o demo nay neu thay 5=3 thi ketqua giong vd tren 
            System.out.println(pattern.indexOf(" l",5));
            //indexOf(int ch,int fromIndex)
            //tra ve vi tri bat dau ky tu ch sau vi tri fromIndex
            System.out.println(pattern.indexOf("y",5));
            
        //lastIndexOf() cau truc y nhu nhau
        //lastIndexOf() nguoc voi indexOf() vi tri dem tu phai qua trai tren xuong duoi
        //NHUNG TRA VE VI TRI DUOC DEM TU TRAI QUA NHU indexOf()
           
            
    }
}
