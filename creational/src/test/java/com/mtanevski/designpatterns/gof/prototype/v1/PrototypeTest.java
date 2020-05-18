package com.mtanevski.designpatterns.gof.prototype.v1;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class PrototypeTest {

    @Test
    public void shouldTestPrototypeDesignPattern() {
        ConcretePrototype concretePrototype = new ConcretePrototype("test");
        ConcretePrototype clone = concretePrototype.clone();

        assertNotEquals(concretePrototype, clone);
    }

}