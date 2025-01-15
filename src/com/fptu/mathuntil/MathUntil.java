/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fptu.mathuntil;

/**
 *
 * @author a
 */
public class MathUntil {

    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalAccessError("cut");
        }

        //XUONG DAY LA N = 0...20
        if (n == 0 || n == 1) {
            return 1; //dung ngay khi n dac biet
        }

        //xuong den day: n = 2...20
        long product = 1; //tich khoi dau = 1
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }

}
