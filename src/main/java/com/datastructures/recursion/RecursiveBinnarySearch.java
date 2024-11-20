/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datastructures.recursion;

/**
 * Re-build the function binnarySearch in the recursive way.
 *
 * @author eduar
 */
public class RecursiveBinnarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 9, 100, 278, 500, 788, 1000, 9888};
        System.out.println(binnarySearch(arr, 788, 0, arr.length - 1));
    }

    public static int binnarySearch(int[] numbers, int number, int low, int high) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (number == numbers[mid]) {
                return mid;
            }

            if (number < numbers[mid]) {
                return binnarySearch(numbers, number, low, mid - 1);
            } else {
                return binnarySearch(numbers, number, mid + 1, high);
            }
        } 
        return -1;
    }
}
