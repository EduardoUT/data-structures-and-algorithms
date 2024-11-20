/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datastructures.recursion;

/**
 *
 * @author eduar
 */
public class TorreHanoi {

    public static void main(String[] args) {
        int numDiscos = 3;
        int movimientos = (int) Math.pow(2, numDiscos) - 1;
        System.out.println(movimientos);
        hanoi(numDiscos, 'A', 'B', 'C');
    }

    public static void hanoi(int numDiscos, char origen, char auxiliar, char destino) {
        if (numDiscos == 1) {
            System.out.println("Moviendo disco de " + origen + " a " + destino);
        } else {
            hanoi(numDiscos - 1, origen, destino, auxiliar);
            System.out.println("Moviendo disco de " + origen + " a " + destino);
            hanoi(numDiscos - 1, auxiliar, origen, destino);
        }
    }
}
