/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throwAndthrows;

/**
 *
 * @author Admin
 */
public class throwEx {

    static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("duoi 18+ la khong duoc r nhe");
        } else {
            System.out.println("welcome to vote");
        }
    }

    public static void main(String args[]) {
        validate(13);
        System.out.println("rest of the code...");
    }
}
