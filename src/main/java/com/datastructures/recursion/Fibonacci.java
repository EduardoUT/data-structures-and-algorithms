/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datastructures.recursion;

/**
 *
 * @author eduar
 */
public class Fibonacci {

    public static void main(String[] args) {
        /*
        int inicio = 10;
        for (int i = 0; i <= inicio; i++) {
            System.out.printf(fibonacciRecursivo(i) + " ");
        }*/

        fibonacciIterativo(11);
    }

    public static int fibonacciRecursivo(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
    }

    public static void fibonacciIterativo(int n) {
        int a = 0;
        int b = 1;
        int aux;
        for (int i = 0; i <= n; i++) {
            System.out.println(a); 
            aux = a; // <--- Asignamos el valor anterior en la variable aux.
            a = b; // <--- Asignamos el valor siguiente en a
            b = aux + b; // <--- Sumamos aux + b para obtener el término siguiente
        }
    }
}
