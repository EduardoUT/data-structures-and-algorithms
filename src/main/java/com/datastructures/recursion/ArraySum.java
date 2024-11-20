/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datastructures.recursion;

/**
 *
 * @author eduar
 */
public class ArraySum {

    public static void main(String[] args) {
        int[] arr = {3, 4, 5};
        System.out.println(sum(arr, 0));
    }

    public static int sum(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        } else {
            return arr[index] + sum(arr, index + 1);
        }
    }
}
