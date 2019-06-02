/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhap2;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class example2<T> {

//        T number;
//
//        public example2(T n) {
//            number = n;
//        }
//
//        @Override
//        public String toString() {
//            return "obj=" + number.toString();
//        }
    T number;

    public example2(T n) {
        number = n;
    }

    @Override
    public String toString() {
        return "obj=" + number.toString();
    }
}