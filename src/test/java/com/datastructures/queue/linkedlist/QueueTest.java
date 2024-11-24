/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.datastructures.queue.linkedlist;

import java.lang.annotation.Documented;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author eduar
 */
public class QueueTest {

    private final Queue queue = new Queue();

    @DisplayName("Debeía encolar un nuevo elemento.")
    @Test
    void testEnqueue() {
        queue.enqueue(155);
        assertEquals(155, queue.peek());
    }

    @DisplayName("Debería tener valores diferentes para Front y Rear.")
    @Test
    void testEnqueueValidBoundaries() {
        queue.enqueue(1222);
        queue.enqueue(266);
        queue.enqueue(377);
        queue.enqueue(27);
        assertEquals(1222, queue.peek());
        assertEquals(1222, queue.getFront().getData());
        assertEquals(27, queue.getRear().getData());
    }

    @DisplayName("Deberia desplegar todos los elementos de la cola.")
    @Test
    void testDisplay() {
        queue.enqueue(1222);
        queue.enqueue(266);
        queue.enqueue(377);
        queue.enqueue(27);
        assertEquals("1222 -> 266 -> 377 -> 27 -> null", queue.display());
    }

    @DisplayName("Debería dsencolar un elemento de la cola desde front")
    @Test
    void testDequeue() {
        queue.enqueue(1222);
        queue.enqueue(266);
        queue.enqueue(377);
        queue.enqueue(27);
        queue.dequeue();
        assertEquals(266, queue.getFront().getData());
        assertEquals("266 -> 377 -> 27 -> null", queue.display());
    }
}
