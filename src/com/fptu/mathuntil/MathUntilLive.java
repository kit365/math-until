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
public class MathUntilLive {
    public static void main(String[] args) {
        long rs = MathUntil.getFactorial(5);
        System.out.println("expected:5! = 120; actual: " + rs);
        
        System.out.println("expected:6! = 720; actual: " + MathUntil.getFactorial(6));
        
        System.out.println("expected:1! = 1; actual: " + MathUntil.getFactorial(1));
    }
}
