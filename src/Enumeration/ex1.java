/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumeration;

/**
 *
 * @author Admin
 */
public enum ex1 {
    CAR(65),BOAT(22),TRAIN(70), PLANE(600);
    
    private int speed;

    ex1(int s) {
        speed=s;
    }
    
    int getSpeed(){
        return speed;
    }
    
}
