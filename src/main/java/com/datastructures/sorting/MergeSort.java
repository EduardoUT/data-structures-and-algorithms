/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datastructures.sorting;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author eduar
 */
public class MergeSort {

    private static final Random random = new Random();

    public static void main(String[] args) {
        int[] arr = randomArray(10);
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int starts, int mid, int end) {
        int leftIdx = 0;
        int rightIdx = 0;
        int m = starts;
        int leftSize = mid - starts + 1;
        int rightSize = end - mid;
        int[] leftArr = new int[leftSize];
        int[] rightArr = new int[rightSize];
        for (int i = 0; i < leftSize; i++) {
            leftArr[i] = arr[starts + i];
        }

        for (int j = 0; j < rightSize; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        while (leftIdx < leftSize && rightIdx < rightSize) {
            if (leftArr[leftIdx] <= rightArr[rightIdx]) {
                arr[m] = leftArr[leftIdx];
                leftIdx++;
            } else {
                arr[m] = rightArr[rightIdx];
                rightIdx++;
            }
            m++;
        }

        while (leftIdx < leftSize) {
            arr[m] = leftArr[leftIdx];
            leftIdx++;
            m++;
        }

        while (rightIdx < rightSize) {
            arr[m] = rightArr[rightIdx];
            rightIdx++;
            m++;
        }
    }

    public static int[] randomArray(int size) {
        int[] rand = new int[size];
        for (int i = 0; i < size; i++) {
            rand[i] = random.nextInt(1000);
        }
        return rand;
    }
}
