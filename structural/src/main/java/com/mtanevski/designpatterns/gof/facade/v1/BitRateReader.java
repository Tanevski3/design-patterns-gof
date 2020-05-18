package com.mtanevski.designpatterns.gof.facade.v1;

public class BitRateReader {
    public static String read(String file, String sourceCodec) {
        return "bitratereader#read";
    }

    public static String convert(String buffer, String sourceCodec) {
        return "bitratereader#convert";
    }
}
