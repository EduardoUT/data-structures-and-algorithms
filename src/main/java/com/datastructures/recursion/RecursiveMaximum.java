/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datastructures.recursion;

import java.util.LinkedList;
import java.util.List;

/**
 * Find the maximum number in a list
 *
 * @author eduar
 */
public class RecursiveMaximum {

    public static void main(String[] args) {
        List<Integer> lista = new LinkedList();
        lista.add(13);
        lista.add(1000);
        lista.add(77);
        lista.add(40000);
        lista.add(88);
        System.out.println(findMaximum(lista, 0));
    }

    public static int findMaximum(List<Integer> lista, int index) {
        if (index == lista.size() - 1) {
            return lista.get(index);
        }
        if (lista.get(index) > findMaximum(lista, index + 1)) {
            return lista.get(index);
        }
        return findMaximum(lista, index + 1);
    }
}
