/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datastructures.recursion;

/**
 *
 * @author eduar
 */
public class Countdown {
    public static void main(String[] args) {
        count(6);
    }
    
    public static void count(int n) {
        System.out.println(n);
        if(n <= 0) {
        } else {
            count(n - 1);
        }
    }
}
