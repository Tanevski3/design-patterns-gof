package com.mtanevski.designpatterns.gof.factorymethod.v1;

public class HTMLButton implements Button {
    @Override
    public void onClick(Runnable runnable) {
        System.out.println("Clicked HTMl button");
    }
}
