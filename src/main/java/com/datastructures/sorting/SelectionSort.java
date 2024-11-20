package com.datastructures.sorting;


import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author eduar
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {1, 2, 90, 222, 6773, 21};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallestValue = arr[i];
            int smallestIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < smallestValue) {
                    smallestValue = arr[j];
                    smallestIndex = j;
                }
            }
            swap(arr, i, smallestIndex);
        }
    }

    public static void swap(int[] arr, int index, int smallestIndex) {
        int aux = arr[index];
        arr[index] = arr[smallestIndex];
        arr[smallestIndex] = aux;
    }
}
