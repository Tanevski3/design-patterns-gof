package com.mtanevski.designpatterns.gof.nullobject.v1;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class NullObjectPatternTest {

    @Test
    public void shouldTestNullObjectPattern() {
        ResponseHandler responseHandler = new SimpleResponseHandler();

        Response response = responseHandler.getResponse(null);
        assertTrue(response instanceof EmptyResponse);
        response = responseHandler.getResponse("");
        assertTrue(response instanceof BadRequestResponse);
        response = responseHandler.getResponse("test");
        assertTrue(response instanceof OkResponse);

        // Optional is kinda implementing the null object pattern
        // Optional<Object> nullable = Optional.of(...);
        // assertFalse(nullable.isPresent());
    }
}
