/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datastructures.recursion;

/**
 *
 * @author eduar
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorialOf(3));
        //System.out.println(factorialIterativeOf(3));
    }

    public static int factorialOf(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return n * factorialOf(n - 1);
    }

    public static int factorialIterativeOf(int n) {
        int factorial = n; // <--- Start value
        int nextFactorial;
        if (factorial == 1 || factorial == 0) {
            return factorial;
        } else {
            for (int i = n; i > 0; i--) {
                nextFactorial = (i - 1);
                if (nextFactorial != 1) {
                    factorial *= nextFactorial; // <-- Multiplies and asign by i - 1 in each iteration
                } else {
                    break;
                }
            }
        }
        return factorial;
    }
}
