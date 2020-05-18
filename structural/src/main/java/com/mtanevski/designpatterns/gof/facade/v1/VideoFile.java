package com.mtanevski.designpatterns.gof.facade.v1;

public class VideoFile {
    private final String file;

    public VideoFile(String file) {
        this.file = file;
    }

    public String getData() {
        return this.file;
    }
}
