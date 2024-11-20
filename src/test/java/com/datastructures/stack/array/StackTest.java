/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.datastructures.stack.array;

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
class StackTest {

    private final Stack stack = new Stack(5);

    @DisplayName("Debería ingresar elementos a la pila.")
    @Test
    void testPush() {
        stack.push(88);
        stack.push(788);
        assertEquals(788, stack.peek());
    }

    @DisplayName("Debería lanzar NullPointerException cuando la pila este vacía.")
    @Test
    void testNullPointerExceptionOnStack() {
        NullPointerException e;
        e = assertThrowsExactly(NullPointerException.class, () -> {
            stack.peek();
        });
        assertEquals("Pila vacía.", e.getMessage());
    }

    @DisplayName("Debería lanzar ArrayIndexOutOfBoundsException cuando exceda"
            + "el límite de elementos en la pila.")
    @Test
    void testArrayIndexOutOfBoundsExceptionOnStack() {
        ArrayIndexOutOfBoundsException e;
        stack.push(54);
        stack.push(98);
        stack.push(988);
        stack.push(7277);
        stack.push(6626);
        e = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            stack.push(2888);
        });
        assertEquals(String.valueOf(stack.stackSize()), e.getMessage());
    }

    @DisplayName("Debería devolver el valor de un elemento en la pila dada una"
            + "posición válida")
    @Test
    void testPeekOfAGivenPosition() {
        stack.push(1777);
        stack.push(277);
        assertEquals(1777, stack.peek(0));
        assertEquals(277, stack.peek(1));
    }

    @DisplayName("Debería retornar null cuando el elemento solicitado este "
            + "fuera de rango")
    @Test
    void testPeekOfAInvalidPosition() {
        stack.push(677);
        ArrayIndexOutOfBoundsException e = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            stack.peek(5);
        });
        assertNull(e.getMessage());
    }

    @DisplayName("Debería eliminar un elemento en la pila y devolver null "
            + "cuando este sea solicitado.")
    @Test
    void testPopOnStack() {
        stack.push(666);
        stack.push(879);
        stack.pop();
        ArrayIndexOutOfBoundsException e;
        e = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            stack.peek(1);
        });
        assertNull(e.getMessage());
    }
    
    @DisplayName("Debería desplegar todos los elementos de la pila")
    @Test
    void testDisplay() {
        stack.push(123);
        stack.push(8271);
        stack.push(27166);
        stack.push(2888);
        stack.push(12221);
        assertEquals("| 12221 | 2888 | 27166 | 8271 | 123 | ", stack.display());
    }
}
