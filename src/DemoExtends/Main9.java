/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoExtends;

/**
 *
 * @author ti
 */
public class Main9 {
    public static void main(String[] args) {
        Cha a=new Cha("Tum","52","ong noi","quan lon") {
            @Override
            void dilam() {
                System.out.println("Cay Tien");
            }
        };
        Cha b=new Con1("Tủm","32","cha","quan nho",1);//abstract su dung thang nay 
        Con1 c=new Con1("Cuoi","12","con",2,"dai ca");
        
        a.tonghop();
        System.out.println("");
        b.tonghop();
        System.out.println("");
        c.tonghop();
        
        
    }
}
