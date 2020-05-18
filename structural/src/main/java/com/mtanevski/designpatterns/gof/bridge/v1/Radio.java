package com.mtanevski.designpatterns.gof.bridge.v1;

public class Radio implements Device {

    private boolean enabled;
    private double volume;
    private int channelNumber;


    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enable() {
        enabled = true;
    }

    @Override
    public void disable() {
        enabled = false;
    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public void setVolume(double value) {
        volume = Math.max(0.0, value);
    }

    @Override
    public int getChannel() {
        return channelNumber;
    }

    @Override
    public void setChannel(int channel) {
        channelNumber = Math.max(1, channel);
    }
}
