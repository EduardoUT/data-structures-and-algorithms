/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.datastructures.search;

/**
 *
 * @author eduar
 */
public class BinnarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 8, 9, 11};
        System.out.println(binnarySearch(arr, 90));
    }

    public static int binnarySearch(int[] numbers, int number) {
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (number == numbers[mid]) {
                return mid;
            }
            if (number < numbers[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
