package com.mtanevski.designpatterns.gof.bridge.v1;

/**
 * The implementation
 */
public interface Device {

    boolean isEnabled();
    void enable();
    void disable();
    double getVolume();
    void setVolume(double value);
    int getChannel();
    void setChannel(int channel);

}
