/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.datastructures.queue.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author eduar
 */
public class QueueTest {

    private final Queue queue = new Queue();

    public QueueTest() {
    }

    @DisplayName("Debería encolar un nuevo elemento.")
    @Test
    void testQueue() {
        queue.enqueue(888);
        assertEquals("888 ", queue.display());
    }

    @DisplayName("Debería lanzar ArrayIndexOutOfBoundsException cuando"
            + " exceda el límite")
    @Test
    void testQueueFull() {
        ArrayIndexOutOfBoundsException e;
        queue.enqueue(777);
        queue.enqueue(6737);
        queue.enqueue(2773);
        queue.enqueue(12);
        queue.enqueue(1);
        e = assertThrowsExactly(ArrayIndexOutOfBoundsException.class, () -> {
            queue.enqueue(766);
        });
        assertEquals("Sobrecarga.", e.getMessage());
    }

    @DisplayName("Debería desencolar el elemento de frente.")
    @Test
    void testDequeue() {
        queue.enqueue(1777);
        queue.enqueue(2888);
        assertEquals(1777, queue.dequeue());
    }

    @DisplayName("Debería lanzar ArrayIndexOutOfBoundsException cuando "
            + "elimine elementos de más.")
    @Test
    void testDequeueOfAnEmptyQueue() {
        ArrayIndexOutOfBoundsException e;
        e = assertThrowsExactly(ArrayIndexOutOfBoundsException.class, () -> {
            queue.dequeue();
        });
        assertEquals("Sobrecarga.", e.getMessage());

        queue.enqueue(777);
        queue.enqueue(6737);
        queue.enqueue(2773);
        queue.enqueue(12);
        queue.enqueue(1);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        e = assertThrowsExactly(ArrayIndexOutOfBoundsException.class, () -> {
            queue.dequeue();
        });
        assertEquals("Sobrecarga.", e.getMessage());
    }
}
