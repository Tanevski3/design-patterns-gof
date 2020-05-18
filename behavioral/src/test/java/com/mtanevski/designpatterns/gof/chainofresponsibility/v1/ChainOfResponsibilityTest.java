package com.mtanevski.designpatterns.gof.chainofresponsibility.v1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ChainOfResponsibilityTest {

    @Test
    public void shouldChainResponsibilities() {
        // define responsibility handlers
        AbstractHandler startHandler = new StartHandler();
        AbstractHandler consoleHandler = new ConsoleHandler();
        AbstractHandler endHandler = new EndHandler();

        // chain handlers
        startHandler
                .withNext(consoleHandler)
                .withNext(endHandler);

        Response response = startHandler.handle(new DefaultRequest());

        assertNotEquals(new DefaultResponse(), response);
        assertEquals(new DefaultResponse().getContent(), response.getContent());
    }
}
