/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoiTuong;

/**
 *
 * @author ti
 */
public class Emp {
    private String manv,ten,email;
    private int tuoi;
    private float luong;
    
    public Emp(){}
    public Emp(String manv){
        this.manv=manv;
    }
    public Emp(String manv,String ten){
        this(manv);
        this.ten=ten;
    }
    public Emp(String manv,String ten,int tuoi){
        this(manv,ten);
        this.tuoi=tuoi;
    }
    public Emp(String manv,String ten,int tuoi,String email){
        this(manv,ten,tuoi);
        this.email=email;
    }
    public Emp(String manv,String ten,int tuoi,String email,float luong){
        this(manv,ten,tuoi,email);
        this.luong=luong;    
    }
   
    public String getMaNV(){
    return this.manv;
    }
    
    public void setMaNV(String manv){
    this.manv = manv;
    }
    
     public String getTen(){
    return this.ten;
    }
    
    public void setTen(String ten){
    this.ten = ten;
    }
    
     public int getTuoi(){
    return this.tuoi;
    }
    
    public void setTuoi(int tuoi){
    this.tuoi=tuoi;
    }
    
     public String getEmail(){
    return this.email;
    }
    
    public void setEmail(String email){
    this.email = email;
    }
    
     public float getLuong(){
    return this.luong;
    }
    
    public void setLuong(float luong){
    this.luong=luong;
    }
}
