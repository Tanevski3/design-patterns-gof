package com.mtanevski.designpatterns.gof.proxy.v1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProxyDesignPatternTest {

    @Test
    public void shouldTextProxyDesignPattern() {
        BaseRestClient restClient = new RestClientImpl();
        BaseRestClient loggingRestClient = new LoggingRestClient(restClient);

        assertEquals("test", restClient.get("test"));
        assertEquals("test: logged", loggingRestClient.get("test"));
    }

}
