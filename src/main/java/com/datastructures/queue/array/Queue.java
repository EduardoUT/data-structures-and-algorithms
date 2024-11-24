/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datastructures.queue.array;

/**
 * Esta estructura de datos sigue el principio FIFO (Firs In First Out).
 *
 * Implementada en un arrglo para este caso.
 *
 * Big O de operaciones:
 *
 * Inserción: O(1)
 *
 * Eliminación: O(1)
 *
 * Acceso: O(1) al ser elementos indexados en un arreglo.
 *
 * Desventajas:
 *
 * Implementar esta estructura implica uso de un tamaño fijo y desperdicio de
 * memoria al ya no poder reutilizar o acceder a espacios que han sido
 * eliminados.
 *
 * @author eduar
 */
public class Queue {

    private final int[] arrayQueue;
    private int rearEnd;
    private int frontEnd;

    public Queue() {
        arrayQueue = new int[5];
        rearEnd = -1;
        frontEnd = -1;
    }

    /**
     * Inserta un nuevo elemento en la cola rearEnd.
     *
     * @param value
     */
    public void enqueue(int value) {
        if (rearEnd + 1 >= arrayQueue.length) {
            throw new ArrayIndexOutOfBoundsException("Sobrecarga.");
        }

        if (frontEnd == -1 && rearEnd == -1) {
            frontEnd = rearEnd = 0;
        } else {
            rearEnd++;
        }
        arrayQueue[rearEnd] = value;
    }

    /**
     * Elimina un elemento al inicio de la cola frontEnd.
     *
     * @return Valor eliminado.
     */
    public int dequeue() {
        int value;
        if (frontEnd == -1 || frontEnd > rearEnd) {
            throw new ArrayIndexOutOfBoundsException("Sobrecarga.");
        } else {
            value = arrayQueue[frontEnd];
            frontEnd++;
        }
        return value;
    }

    /**
     *
     * @return Devuelve el elemento almacenado en front.
     */
    public int peek() {
        int value;
        if (frontEnd == -1 || frontEnd > rearEnd) {
            throw new ArrayIndexOutOfBoundsException("Sobrecarga.");
        } else {
            value = arrayQueue[frontEnd];
        }
        return value;
    }

    /**
     *
     * @return Representación String de los valores en cola.
     */
    public String display() {
        StringBuilder sb = new StringBuilder();
        if (rearEnd == -1) {
            throw new NullPointerException("Vacía.");
        } else {
            for (int i = frontEnd; i <= rearEnd; i++) {
                sb.append(arrayQueue[i]).append(" ");
            }
        }
        return sb.toString();
    }
}
