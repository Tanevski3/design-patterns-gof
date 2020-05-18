package com.mtanevski.designpatterns.gof.adapter.v1;

public interface Ui {
    void changeColor(String buttonName);
    void onEvent(String eventName, Runnable runnable);
}
