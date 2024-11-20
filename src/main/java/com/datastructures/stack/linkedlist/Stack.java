/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datastructures.stack.linkedlist;

import com.datastructures.linkedlist.Node;

/**
 *
 * @author eduar
 */
public class Stack {
    
    private int value;
    private Node top;
    private Node tail;
    private int count;
    private static final String MESSAGE_NULL = "Pila vacia.";
    
    public Stack() {
        this.count = -1;
        this.top = null;
        this.tail = null;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @return the top
     */
    public Node getTop() {
        return top;
    }

    /**
     * @param top the top to set
     */
    public void setTop(Node top) {
        this.top = top;
    }

    /**
     * @return the tail
     */
    public Node getTail() {
        return tail;
    }

    /**
     * @param tail the tail to set
     */
    private void setTail(Node tail) {
        this.tail = tail;
    }

    /**
     * Apila un nuevo elemento.
     *
     * @param value the value to set
     */
    public void push(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            setTop(node);
            setTail(node);
        } else {
            node.setNext(getTop());
            setTop(node);
        }
        count++;
    }

    /**
     * Elimina un elemento del tope de la pila.
     */
    public void pop() {
        if (isEmpty()) {
            throw new NullPointerException(MESSAGE_NULL);
        }
        
        setTop(top.getNext());
        count--;
        if (count == 0) {
            setTop(getTop());
            setTail(getTop());
        }
    }

    /**
     *
     * @return Valor entero del elemento tope de la pila.
     */
    public int peek() {
        if (isEmpty()) {
            throw new NullPointerException(MESSAGE_NULL);
        }
        return getTop().getData();
    }

    /**
     *
     * @param position Posición del valor entero a retornar.
     * @return Valor entero del elemento en la pila.
     */
    public int peek(int position) {
        if (isEmpty()) {
            throw new NullPointerException(MESSAGE_NULL);
        }
        
        if (position > count) {
            throw new IllegalArgumentException("Ingrese un valor "
                    + "menor o igual a " + count);
        }
        
        if (position > 0) {
            Node current = top;
            for (int i = 1; i <= position; i++) {
                current = current.getNext();
            }
            return current.getData();
        } else {
            return top.getData();
        }
        
    }

    /**
     * Valida si cuenta con referencias y size valido.
     *
     * @return
     */
    private boolean isEmpty() {
        return (count < 0 || top == null);
    }

    /**
     *
     * @return Cantidad de elementos en la pila.
     */
    public int getCount() {
        return count;
    }

    /**
     *
     * @return Representación de todos los elementos de la pila.
     */
    public String display() {
        if (isEmpty()) {
            throw new NullPointerException(MESSAGE_NULL);
        }
        StringBuilder stringBuilder = new StringBuilder();
        String arrow = " -> ";
        Node current = top;
        while (current != null) {
            stringBuilder.append(current.getData()).append(arrow);
            current = current.getNext();
        }
        return stringBuilder.toString();
    }
    
    public void change(int position, int newValue) {
        if (isEmpty()) {
            throw new NullPointerException(MESSAGE_NULL);
        }
        
        if (position < 0 || position > count) {
            throw new IllegalArgumentException("Posición inválida.");
        }
        
        Node current = top;
        for (int i = 0; i <= position; i++) {
            if (i == position) {
                current.setData(newValue);
            } else {
                current = current.getNext();
            }
        }
    }
}
