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
public class ConNacDanh implements Cha,OngNoi,BaNgoai {
       String name;
    public ConNacDanh(){}
    
    public ConNacDanh(String name){
        this.name=name;
    }
    
    
    @Override
    public void CongViec() {
        System.out.println("Di Hoc");
    }

    @Override
    public void xuat() {
        System.out.println("Ten Cha: "+tentui);
        System.out.println("Ten HS: "+name);
        CongViec();
    }

            
    public class ConNDbaNga extends ConNacDanh{
        public ConNDbaNga() {}
            String namema;
        public ConNDbaNga(String namema) {
            this.namema = namema;
        }
        public void xuat(String a){
            System.out.println(namema+" ma cua "+a);
            CongViec();
        }
        @Override
        public void CongViec(){
             System.out.println("Vo Sau an Bam");   
        }
        
    }
    
    static public class ConNDbaHoa extends ConNacDanh implements Cha,OngNoi,BaNgoai{
        String ten;
        public ConNDbaHoa() {}
        public ConNDbaHoa(String ten) {
            this.ten = ten;
        }
        public void xuat(String b){
            System.out.println(ten+" ma cua "+b);
            CongViec();
        }
        
        @Override
        public void CongViec(){
            System.out.println("Vo chinh thuc cua "+tentui+" lam thay me");       
        }
        
    }
    
}
