package com.mtanevski.designpatterns.gof.facade.v1;

import java.io.File;
import java.util.Objects;

public class VideoConverter {
    public File convertVideo(String file, String format){
        VideoFile videoFile = new VideoFile(file);
        String sourceCodec = new CodecFactory().extract(videoFile);
        Codec destinationCodec;
        if(Objects.equals(format, "mp4")){
            destinationCodec = new Mpeg4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        String buffer = BitRateReader.read(file, sourceCodec);
        String result = BitRateReader.convert(buffer, sourceCodec);
        result = (new AudioMixer()).fix(result, destinationCodec);
        return new File(result);
    }
}
