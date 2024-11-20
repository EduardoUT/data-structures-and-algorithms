/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datastructures.recursion;

import java.util.LinkedList;
import java.util.List;

/**
 * Write a recursive function that counts the number of items in a list
 * @author eduar
 */
public class RecursiveCounter {
    
    public static void main(String[] args) {
        List<Integer> lista = new LinkedList();
        lista.add(13);
        lista.add(45);
        lista.add(77);
        lista.add(89);
        lista.add(88);
        System.out.println(countElementsInList(lista, 0));
    }
    
    public static int countElementsInList(List<Integer> lista, int counter) {
        if(counter == lista.size()) {
            return counter;
        } else {
            return countElementsInList(lista, counter + 1);
        }
    }
}
