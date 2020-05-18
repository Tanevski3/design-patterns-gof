package com.mtanevski.designpatterns.gof.visitor.v1;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class VisitorDesignPatternTest {

    @Test
    public void shouldTestVisitorDesignPattern() {
        Book book = new Book();
        Fruit fruit = new Fruit();

        ShoppingCartVisitor shoppingCartVisitor = new ShoppingCartVisitor();
        book.accept(shoppingCartVisitor);
        fruit.accept(shoppingCartVisitor);

        assertEquals(20, shoppingCartVisitor.getTotalCost());
    }
}
