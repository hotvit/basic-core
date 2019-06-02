/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractClass;

/**
 *
 * @author Admin
 */
public abstract class Hinh {

    public Hinh() {
    }
    public double canh;
    
    public abstract double canh();

}

class Tron extends Hinh {

    public Tron() {
    }

    public Tron(String name) {
    }

    @Override
    public double canh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void say(){
        System.out.println("Tron Say");
    }
}

abstract class DaGiac extends Hinh {

    double canh;

    public DaGiac() {
    }

    public DaGiac(double canh) {
        this.canh = canh;
    }

}

class TamGiac extends DaGiac {

    public TamGiac() {
    }

    public TamGiac(double canh) {
        super(canh);
    }

    public double getCanh() {
        return super.canh;
    }

    public void setCanh(double canh) {
        super.canh = canh;
    }

    @Override
    public double canh() {
        return super.canh;
    }
}

class ChuNhat extends DaGiac {

    public ChuNhat() {
    }

    public ChuNhat(double canh) {
        super(canh);
    }

    public double getCanh() {
        return super.canh;
    }

    public void setCanh(double canh) {
        super.canh = canh;
    }

    @Override
    public double canh() {
        return super.canh;
    }
}

class Eclip extends Tron {

    public Eclip() {
    }

    public Eclip(String name) {
        super(name);
    }
    
    @Override
    public void say(){
        System.out.println("Eclip say");
    }

}

class Maindonha {

//    Hinh h4 = new ChuNhat();
//    Hinh h1 = new Tron();
//    Hinh h2 = new DaGiac();
//    Hinh h3 = new TamGiac();
    public static void main(String[] args) {
//        Hinh h1 = new Tron();
//        Hinh h2 = new TamGiac(2d);
//        Hinh h3 = new ChuNhat(3d);
//        System.out.println("h2: " + h2.canh());
//        System.out.println("h3: " + h3.canh());
//        Hinh h5 = h1;
//        DaGiac h4 = h2;
//        h2 = h3;
//        System.out.println("h2 new: " + h2.canh());
//        Tron h6 = (Tron) h1;
    
        Tron tron = new Eclip();
        tron.say();

    }
}
