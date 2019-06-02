/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoThamTriThamBien;

/**
 *
 * @author ti
 */
public class ThamTrivaThamBien {
        int so;
            
    public ThamTrivaThamBien() {
    }
    
    public ThamTrivaThamBien(int so) {
        this.so=so;
    }
    //tham tri la tham so truyen vao kieu nguyen thuy int, float, double..
    public void ThamTri(int a){
        a+=5;
    }
    //tham bien la tham so truyen vao kieu class, mang, interface
    public void ThamBien1(Integer[] b){
        b[0]+=5;
    }
    public void ThamBien2(ThamTrivaThamBien c){
        c.so+=5;
    }
            
    
    
    
    public static void main(String[] args) {
        int thamtri = 1;
        ThamTrivaThamBien dit = new ThamTrivaThamBien();
        dit.so = 2;
        Integer[] tb = new Integer[1];
        tb[0]=3;
        
        dit.ThamTri(thamtri);
        dit.ThamBien1(tb);
        dit.ThamBien2(dit);
                
        System.out.println("Tham Tri: "+thamtri);
        System.out.println("Tham Bien 1: "+tb[0]);
        System.out.println("Tham Bien 2: "+dit.so);
        
    }

    

    
    
   
}
