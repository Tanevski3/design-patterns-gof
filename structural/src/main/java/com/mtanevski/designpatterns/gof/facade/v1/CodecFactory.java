package com.mtanevski.designpatterns.gof.facade.v1;

public class CodecFactory {
    public String extract(VideoFile videoFile) {
        return videoFile.getData();
    }
}
