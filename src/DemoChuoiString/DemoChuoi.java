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
public class DemoChuoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //mau
       String pattern= "Day la DEMO ve xu ly Chuoi  ";
        
        //dua ve chu thuong k hoa
        System.out.println("dua ve chu thuong k hoa:"+pattern.toLowerCase());
        
        //dua ve chu hoa
        System.out.println("dua ve chu hoa:"+pattern.toUpperCase());
        
        //cat ky tu trang o 2 dau chuoi
        System.out.println("cat ky tu trang o 2 dau chuoi:"+pattern.trim());
       
        //lay do dai chuoi
        System.out.println("lay do dai chuoi:"+pattern.length());
        
        //lay chuoi con
            //1 doi so BeginIndex
            System.out.println("lay chuoi con 1 doi so BeginIndex:"+pattern.substring(8));
            //2 doi so BeginIndex/EndIndex
            System.out.println("lay chuoi con 2 doi so BeginIndex/EndIndex:"+
                    pattern.substring(8,13)+pattern.substring(16));
        
        //lay ki tu tai vi tri index
        System.out.println("lay ki tu tai vi tri index:"+pattern.charAt(8));
        
        //tim kiem va thay the chuoi (find, replace)
        System.out.println("tim kiem va thay the chuoi (find, replace):"+
                pattern.replaceAll("DEMO","LamThu")+pattern.replace("a", "e"));
        
        //cat chuoi split(separator)/(regex)or(regex,int i) 
            //(regex)
                //mac dinh khong i hoac i==0 la tra ve tat ca, dung vong lap for xuat
            int i=1;
            String[] MangString=pattern.split("\\s");
            for(String b:MangString){
            System.out.print(i+"/"+b+" ");
            i++;
            }
            
            //(regex,int i)
                //i la so chuoi tra ve => String[] DoanVan =>Mang String
                //i>1..chuoi chia lam i doan 
                //mac dinh khong i hoac i==0 la tra ve tat ca, dung vong lap for xuat
                
                for(int l=0;l<=3;l++){
                    i=1;
                for(String doan:pattern.split("\\s",l)){
                    System.out.println("");
                    System.out.print(i+"-"+doan);
                    i++;
                }//for each                    
                }//for
    
        
            
        
    }
    
}
