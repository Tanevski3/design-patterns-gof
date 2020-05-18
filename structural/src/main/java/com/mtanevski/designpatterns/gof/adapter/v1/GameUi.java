package com.mtanevski.designpatterns.gof.adapter.v1;

public class GameUi implements Ui {
    @Override
    public void changeColor(String colorScheme) {
        System.out.println("Changing color to " + colorScheme);
    }

    @Override
    public void onEvent(String eventName, Runnable runnable) {
        System.out.println("Handling event: " + eventName);

    }
}
