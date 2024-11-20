/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.datastructures.stack.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author eduar
 */
class StackTest {

    private final Stack stack = new Stack();

    @DisplayName("Debería tener el mismo valor al hacer el primer push")
    @Test
    void testFirstPush() {
        stack.push(77);
        assertEquals(77, stack.peek());
        assertEquals(77, stack.getTop().getData());
        assertEquals(77, stack.getTail().getData());
    }

    @DisplayName("Debería tener diferentes valores en head y tail")
    @Test
    void testMorePush() {
        stack.push(999);
        stack.push(8888);
        stack.push(9988);
        assertEquals(9988, stack.getTop().getData());
        assertEquals(9988, stack.peek());
        assertEquals(999, stack.getTail().getData());
    }

    @DisplayName("Debería eliminar elementos de una pila correctamente llenada")
    @Test
    void testPopOfAFullStack() {
        stack.push(44);
        stack.push(33);
        stack.push(1899);
        stack.push(9299);
        stack.push(1998);
        stack.push(777);
        stack.pop();
        assertEquals(1998, stack.peek());
    }

    @DisplayName("Debería lanzar NullPointerException cuando la pila está vacía.")
    @Test
    void testPopOfAVoidStack() {
        NullPointerException e;
        e = assertThrowsExactly(NullPointerException.class, () -> {
            stack.pop();
        });
        assertEquals("Pila vacia.", e.getMessage());
        stack.push(44);
        stack.push(33);
        stack.push(1899);
        stack.push(9299);
        stack.push(1998);
        stack.push(777);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        e = assertThrowsExactly(NullPointerException.class, () -> {
            stack.pop();
        });
        assertEquals("Pila vacia.", e.getMessage());
    }

    @DisplayName("Debería lanzar NullPointerException al recibir un valor en"
            + "una pila vacía")
    @Test
    void testStackPeekInvalidBoundaries() {
        NullPointerException e;
        e = assertThrowsExactly(NullPointerException.class, () -> {
            stack.peek(0);
        });
        assertEquals("Pila vacia.", e.getMessage());
    }

    @DisplayName("Debería lanzar IllegalArgumentException cuando el valor es mayor al límite máximo.")
    @Test
    void testInvalidArgumentInStack() {
        stack.push(44);
        stack.push(121);
        stack.push(98211);
        stack.push(8288);
        stack.push(66);
        IllegalArgumentException e;
        e = assertThrowsExactly(IllegalArgumentException.class, () -> {
            stack.peek(5);
        });
        assertEquals("Ingrese un valor menor o igual a " + stack.getCount(), e.getMessage());
    }

    @DisplayName("Debería mostrar todos los elementos de la pila.")
    @Test
    void testDisplayElements() {
        stack.push(3);
        stack.push(6);
        stack.push(777);
        stack.push(999);
        stack.push(876);
        assertEquals("876 -> 999 -> 777 -> 6 -> 3 -> ", stack.display());
    }

    @DisplayName("Debería cambiar el valor dada una posición")
    @Test
    void testChange() {
        stack.push(122);
        stack.push(7888);
        stack.push(777);
        stack.change(0, 123);
        stack.change(1, 890);
        stack.change(2, 567);
        assertEquals(123, stack.peek());
        assertEquals(890, stack.peek(1));
        assertEquals(567, stack.peek(2));
    }

    @DisplayName("Debería lanzar IllegalArgumentException cuando se ingresa un "
            + "valor fuera de rango en change().")
    @Test
    void testInvalidArgumentOnChangeMethod() {
        IllegalArgumentException e;
        stack.push(122);
        stack.push(7888);
        stack.push(777);
        stack.push(999);
        stack.push(876);
        e = assertThrowsExactly(IllegalArgumentException.class, () -> {
            stack.change(-1, 677);
        });
        assertEquals("Posición inválida.", e.getMessage());

        e = assertThrowsExactly(IllegalArgumentException.class, () -> {
            stack.change(5, 677);
        });
        assertEquals("Posición inválida.", e.getMessage());
    }

    @DisplayName("Debería actualizar tail node cuando vacía el penúltimo elemento")
    @Test
    void testUpdateTailNode() {
        stack.push(122);
        stack.push(1788);
        assertEquals(122, stack.getTail().getData());
        stack.pop();
        assertEquals(122, stack.getTail().getData());
        assertEquals(0, stack.getCount());
    }
}
