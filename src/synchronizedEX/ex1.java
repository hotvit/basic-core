/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronizedEX;

/**
 *
 * @author Admin
 */
public class ex1 {

    int amount = 1000;

    public synchronized void drawMoney(int m) {
        System.out.println("You dang rut tien....");
        if (amount < m) {
            System.out.println("Not Enough Money....!!!");
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }

        } else {
            amount -= m;
            System.out.println("So Du Trong Account: " + amount);
        }
        System.out.println("Draw Money Successfully!!!");

    }

    public synchronized void addMoney(int m) {
        System.out.println("You dang Nap tien....>>>>>>>");
        amount += m;
        System.out.println("NAP SUCCESSFULLY !!!");
        System.out.println("So Du: "+amount);
        notify();
    }

    public static void main(String[] args) {
        final ex1 ex = new ex1();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                ex.drawMoney(500);
            }
        };
        t1.start();

        Thread t2 = new Thread() {
            @Override
            public void run() {
                ex.drawMoney(2000);
            }
        };
        t2.start();

        Thread t3 = new Thread() {
            @Override
            public void run() {
                ex.addMoney(2500);
            }
        };
        t3.start();

    }

}
