/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datastructures.sorting;

import java.util.Arrays;

/**
 *
 * @author eduar
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {7, 6727, 989, 2828, 199, 28, 99, 100};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        //Si low es mayor que high entonces ya no hay más elementos que ordenar
        if (low < high) {
            //Posición del pivote donde ha sido colocado correctamente
            int m = partition(arr, low, high);
            //Ordena los elementos del lado derecho de m(pivote)
            quickSort(arr, low, m - 1); 
            //Ordena los elementos del lado izquierdo de m(pivote)
            quickSort(arr, m + 1, high); 
        }
    }

    public static int partition(int[] arr, int i, int j) {
        //Selecciona el valor del pivote en la posición i(low en la función quickSort)
        int p = arr[i];
        //Asigna el valor de low en m. 
        int m = i; 
        //Compara el resto de elementos con el pivote actual.
        //Y realiza el intercambio en caso de que sea menor al pivote.
        //Incrementa m hasta el índice donde fue el último valor menor encontrado.
        for (int k = i + 1; k <= j; k++) {
            if ((arr[k] < p) || (arr[k] == p)) {
                m++;
                int temp = arr[m];
                arr[m] = arr[k];
                arr[k] = temp;
            }
        }
        //Valida que el pivote esta posicionado correctamente
        //realiza un intercambio del pivote con el último incremento de m.
        int temp = arr[m];
        arr[m] = arr[i];
        arr[i] = temp;
        return m;
    }
}
