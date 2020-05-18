package com.mtanevski.designpatterns.gof.bridge.v1;

public class AdvancedRemote extends Remote {

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute(){
        super.device.setVolume(0.0);
    }

}
