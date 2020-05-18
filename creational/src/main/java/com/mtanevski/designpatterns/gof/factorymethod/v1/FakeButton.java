package com.mtanevski.designpatterns.gof.factorymethod.v1;

public class FakeButton implements Button {
    @Override
    public void onClick(Runnable runnable) {
        System.out.println("Clicked fake button");
    }
}
