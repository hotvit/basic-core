/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhap;

/**
 *
 * @author ti
 */
public class nhap {
	static public int X = 100;
	static {
		X += 100;
	}

	static public void method() {
		X += 200;
	}

	public static void main(String[] args) {
		nhap a = new nhap();
		a.X += 300;
		System.out.println("a.X+=300: " + a.X + " " + nhap.X);
		nhap.X += 500;
		System.out.println("a.X+=300: " + a.X + " " + nhap.X);
		nhap.method();
		System.out.println("final: " + a.X);
		System.out.println("final: " + nhap.X);

	}
}
