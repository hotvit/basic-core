/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhap;

/**
 *
 * @author Admin
 */
public class stringVSstringbuilder {

    public static void main(String[] args) {

        String s = "home.index.title";
        String s1 = "home." + "index."+"title";
        String s2 = new StringBuilder("home.").append("index.").append("title").toString();
        System.out.println("s==s2: " + (s == s2)); //false
        System.out.println("s==s1: " + (s == s1)); //true
    }

}
