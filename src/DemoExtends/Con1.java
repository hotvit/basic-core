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
public class Con1 extends Cha{
    private int e;
    public Con1(){}
    
    public Con1(String a,String b,int e){
        super(a,b);
        this.e=e;
    }
    
    public Con1(String a,String b,String c,int e){
        super(a,b,c);
        this.e=e;
    }
    
    public Con1(String a,String b,String c,String d,int e){
        super(a,b,c,d);
        this.e=e;
    }
    
    public Con1(String a,String b,String c,int e,String d){
        super(a,b,c,d);
        this.e=e;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }
    
    
    @Override
    public void an(){
        System.out.println("An Nhiu");
    }
    
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("e: "+getE());
    }
    
    public void tonghop(){
        this.dilam();
        super.tonghop();//do class con k override dc method rieng() nen super.tonghop()
        //su dung method rieng() cua class cha
        rieng();
    }
    
    public void rieng(){
        try{
        //super.rieng();//class cha co method rieng() dang private 
        System.out.println("nho nhung van dc choi gai");
        }catch(Exception e){
            System.out.println("con nit k dc choi gai");
        }
    }

    @Override
    public void dilam() {
        System.out.println("Di Hoc");
    }
}
