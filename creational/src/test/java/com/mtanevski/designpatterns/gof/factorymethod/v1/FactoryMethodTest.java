package com.mtanevski.designpatterns.gof.factorymethod.v1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FactoryMethodTest {

    @Test
    public void shouldTestFactoryMethod() {
        Dialog simpleDialog = new Dialog() {
            @Override
            Button createButton() {
                return new HTMLButton();
            }
        };

        Dialog fakeDialog = new Dialog() {
            @Override
            Button createButton() {
                return new FakeButton();
            }
        };

        simpleDialog.show();
        fakeDialog.show();
    }
}
