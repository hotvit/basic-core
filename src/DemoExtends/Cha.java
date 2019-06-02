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
public abstract class Cha {
    public String a;
    protected String b;       
    String c;
    private String d;
    private String toiloi="duoc choi gai";
    public Cha(){}
    
    public Cha(String a){
        this.a=a;
    }
    public Cha(String a,String b){
        this(a);
        this.b=b;
    }
    public Cha(String a,String b,String c){
        this(a,b);
        this.c=c;
    }
    public Cha(String a,String b,String c,String d){
        this(a,b,c);
        this.d=d;
    }
   
    public String getD() {
        return d;
    }

    public void setA(String a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setC(String c) {
        this.c = c;
    }

    public void setD(String d) {
        this.d = d;
    }

    
    
    abstract void dilam();
    
    public void an(){
        System.out.println("An It");
    }
    
    public void xuat(){
        System.out.println("a: "+a+"\nb: "+b+"\nc: "+c+"\nd: "+getD());
    }
    
    protected void tonghop(){//cha protected thi con phai protected tro len(public)
        this.dilam();
        this.an();
        this.xuat();
        this.rieng();
    }
    
    private void rieng(){
        System.out.println(toiloi);
    }
}
