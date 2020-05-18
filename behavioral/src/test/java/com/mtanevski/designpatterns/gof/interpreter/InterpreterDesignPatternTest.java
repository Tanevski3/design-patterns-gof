package com.mtanevski.designpatterns.gof.interpreter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class InterpreterDesignPatternTest {

    @Test
    public void shouldTestInterpreterDesignPattern(){
        String exp = Interpreter.interpret("var a = 5 + 2");

        assertNotNull(exp);
        assertEquals("7.0", exp);
    }
}
