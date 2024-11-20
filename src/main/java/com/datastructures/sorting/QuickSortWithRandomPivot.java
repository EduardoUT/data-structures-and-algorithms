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
public class QuickSortWithRandomPivot {
    public static void main(String[] args) {
        int[] arr = {7, 6727, 989, 2828, 199, 28, 99, 100};
        quickSortRandomPivot(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    private static void quickSortRandomPivot(int[] arr) {
        quickSortRandomPivot(arr, 0, arr.length - 1);
    }
    
    private static void quickSortRandomPivot(int[] arr, int low, int high) {
        if (low < high) {
            //Selección aleatoria del pivote
            int pivotIndex = new Random().nextInt(high - low) + low;
            int pivot = arr[pivotIndex];
            swap(arr, pivotIndex, high);
            //Posición del pivote donde ha sido colocado correctamente
            int leftPointer = partition(arr, low, high, pivot);
            //Ordena los elementos del lado derecho de leftPointer
            quickSortRandomPivot(arr, low, leftPointer - 1); 
            //Ordena los elementos del lado izquierdo de leftPointer
            quickSortRandomPivot(arr, leftPointer + 1, high); 
        }
    }
    
    private static int partition(int[] arr, int i, int j, int pivot) {
        //Puntero del lado izquierdo del arreglo
        int leftPointer = i;
        //Puntero del lado derecho del arreglo (-1) para excluir el último velor
        int rigthPointer = j - 1;
       //Recorre y compara los valores del lado izquierdo y derecho del pivote
       //Aumenta el contador correspondiente en tanto encuentre valores
        while(leftPointer < rigthPointer) {
            while(arr[leftPointer] <= pivot && leftPointer < rigthPointer) {
                leftPointer++;
            }
            while(arr[rigthPointer] >= pivot && leftPointer < rigthPointer) {
                rigthPointer--;
            }
            //Intercambia el valor menor encontrado con el puntero derecho
            swap(arr, leftPointer, rigthPointer);
        }
        
       
        if(arr[leftPointer] > arr[j]) {
            swap(arr, leftPointer, j);
        } else {
            leftPointer = j;
        }
        return leftPointer;
    }
    
    private static void swap(int[] arr, int indexA, int indexB) {
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }
}
