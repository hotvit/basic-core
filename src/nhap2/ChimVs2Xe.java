/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhap2;

/**
 *
 * @author Admin
 */
public class ChimVs2Xe {

    public static void main(String[] args) {
        ChimVs2Xe a = new ChimVs2Xe();
//        System.out.println(a.getDistance(100, 60, 80));
        System.out.println(a.getDistance(100, 60, 40, 80, false));
        System.out.println(a.getDistance(28.571426f, 60, 40, 80, true));
        System.out.println(a.getDistance(4.7619066f, 60, 40, 80, false));
    }

    public float getDistance(float distance, int c, int d) {
        float D = -d - c;
        float Dx = distance * (-d);
        float Dy = -distance * c;
        return Dy / D;
    }
//    float bird = 0;

    public float getDistance(float distance, int vtA, int vtB, int vtC, boolean check) {
        float xeA;
        float xeB;
        float temp,bird=0;
        if (distance >= 0.003086) {
            if (check == false) {
                xeA = getDistance(distance, vtA, vtC);
//                System.out.println(xeA);
                xeB = (xeA / vtA) * vtB;
//                System.out.println(xeB);
                temp = distance - xeA - xeB;
                System.out.println("Each to A " + temp);
                getDistance(temp, vtA, vtB, vtC, true);
            } else {
                xeB = getDistance(distance, vtB, vtC);
                xeA = (xeB / vtB) * vtA;
                temp = distance - xeB - xeA;
                System.out.println("Each to B " + temp);
                getDistance(temp, vtA, vtB, vtC, false);
            }

            bird += temp;
        }

        return bird;
    }

}
