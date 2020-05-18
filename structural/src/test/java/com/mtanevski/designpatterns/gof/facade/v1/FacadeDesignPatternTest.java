package com.mtanevski.designpatterns.gof.facade.v1;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertTrue;

public class FacadeDesignPatternTest {

    @Test
    public void shouldTestFacadeDesignPattern() {
        // given
        VideoConverter convertor = new VideoConverter();

        // when
        File mp4 = convertor.convertVideo("funny-cats-video.ogg", "mp4");
        String absolutePath = mp4.getAbsolutePath();

        // then
        assertTrue(absolutePath.contains("bitratereader#convert"));
    }
}
