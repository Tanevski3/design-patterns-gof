package com.mtanevski.designpatterns.gof.templatemethod.v1;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class TemplateMethodDesignPatternTest {

    @Test
    public void shouldTestTemplateMethodDesignPattern() {
        AbstractClass object1 = new ConcreteClass1();
        AbstractClass object2 = new ConcreteClass2();

        object1.templateMethod();
        object2.templateMethod();

        assertNotEquals(object1, object2);
    }
}
