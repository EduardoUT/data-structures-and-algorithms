/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datastructures.queue.linkedlist;

import com.datastructures.linkedlist.Node;

/**
 *
 * @author eduar
 */
public class Queue {

    private int value;
    private Node front;
    private Node rear;

    public Queue() {
        front = null;
        rear = null;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the front
     */
    public Node getFront() {
        return front;
    }

    /**
     * @param front the front to set
     */
    public void setFront(Node front) {
        this.front = front;
    }

    /**
     * @return the rear
     */
    public Node getRear() {
        return rear;
    }

    /**
     * @param rear the rear to set
     */
    public void setRear(Node rear) {
        this.rear = rear;
    }

    /**
     * Encola un nuevo elemento en la parte final de la cola.
     *
     * @param value
     */
    public void enqueue(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            setFront(node);
            setRear(node);
            front.setNext(null);
            rear.setNext(null);
        } else {
            getRear().setNext(node);
            setRear(node);
            rear.setNext(null);
        }
    }

    /**
     * Eliminando elemento de la cola, posicionando el puntero front al
     * siguiente.
     */
    public void dequeue() {
        if (!isEmpty()) {
            front = front.getNext();
        }
    }

    /**
     *
     * @return Elemento entero en la posición front.
     */
    public int peek() {
        int frontValue = 0;
        if (!isEmpty()) {
            frontValue = front.getData();
        }
        return frontValue;
    }

    /**
     *
     * @return Representación de todos los elementos en la cola.
     */
    public String display() {
        StringBuilder sb = new StringBuilder();
        if (!isEmpty()) {

            Node current = front;
            while (current != null) {
                sb.append(current.getData());
                sb.append(" -> ");
                current = current.getNext();
            }
        }
        sb.append("null");
        return sb.toString();
    }

    public boolean isEmpty() {
        return (front == null || rear == null);
    }
}
