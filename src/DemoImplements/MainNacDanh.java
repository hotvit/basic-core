/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoImplements;

/**
 *
 * @author ti
 */
public class MainNacDanh {
    public static void main(String[] args) {
        Cha a = new ConNacDanh("Lan");        
        ConNacDanh b = new ConNacDanh("Ba");
        ConNacDanh.ConNDbaNga c = new ConNacDanh().new ConNDbaNga("Nga");
        ConNacDanh.ConNDbaHoa d = new ConNacDanh.ConNDbaHoa("Hoa");
        
        
        a.xuat();
        b.xuat();
        c.xuat(a.name);
        d.xuat(b.name);
        
        
    }
}
