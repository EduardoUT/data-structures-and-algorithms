/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datastructures.stack.array;

/**
 *
 * @author eduar
 */
public class Stack {

    private final int[] arrayStack;
    private int top;
    private static final String MESSAGE_NULL = "Pila vacía.";

    public Stack(int size) {
        this.top = -1;
        this.arrayStack = new int[size];
    }

    /**
     * Agrega un nuevo elemento a la pila.
     *
     * @param value
     */
    public void push(int value) {
        if (isFull()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        arrayStack[++top] = value;
    }

    /**
     * Elimina elemento del tope de la pila.
     */
    public void pop() {
        if (isEmpty()) {
            throw new NullPointerException(MESSAGE_NULL);
        }
        top--;
    }

    /**
     * Toma el elemento top de la pila.
     *
     * @return
     */
    public int peek() {
        if (isEmpty()) {
            throw new NullPointerException(MESSAGE_NULL);
        }
        return arrayStack[top];
    }

    /**
     * Devuelve el elemento dada una posición en la pila.
     *
     * @param position Posición del elemento en la pila.
     * @return -1 si el elemento no fue encontrado.
     */
    public int peek(int position) {
        if (isEmpty()) {
            throw new NullPointerException(MESSAGE_NULL);
        } else if (position > top) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            return arrayStack[position];
        }
    }

    public String display() {
        if (isEmpty()) {
            throw new NullPointerException(MESSAGE_NULL);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("| ");
        for (int i = top; i >= 0; i--) {
            stringBuilder.append(arrayStack[i]).append(" | ");
        }
        return stringBuilder.toString();
    }

    /**
     * Válida si está vacía la pila.
     *
     * @return
     */
    public boolean isEmpty() {
        return (arrayStack == null || top < 0);
    }

    public boolean isFull() {
        return (top >= arrayStack.length);
    }

    public int stackSize() {
        return arrayStack.length;
    }
}
