package com.mtanevski.designpatterns.gof.decorator.v1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecoratorPatternTest {

    @Test
    public void shouldTestDecoratorPattern() {
        FileDataSource source = new FileDataSource("C:\\test.data");

        DataSource decorated = new EncryptionDecorator(new CompressionDecorator(source));

        decorated.writeData("test");
        String readData = decorated.readData();

        assertEquals("test", readData);
    }
}
