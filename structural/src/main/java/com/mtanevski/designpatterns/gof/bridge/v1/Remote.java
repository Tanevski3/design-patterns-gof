package com.mtanevski.designpatterns.gof.bridge.v1;

/**
 * The abstraction
 */
public abstract class Remote {

    Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower() {
        device.disable();
    }

    public void volumeDown(){
        device.setVolume(device.getVolume() - 0.1);
    }

    public void volumeUp(){
        device.setVolume(device.getVolume() + 0.1);
    }

    public void channelDown(){
        device.setVolume(device.getChannel() - 1);
    }

    public void channelUp(){
        device.setChannel(device.getChannel() + 1);
    }

    public String show(){
        return String.valueOf(device.getChannel()) + "," + device.getVolume();
    }

}
