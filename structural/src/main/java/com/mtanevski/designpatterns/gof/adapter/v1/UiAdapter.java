package com.mtanevski.designpatterns.gof.adapter.v1;

public class UiAdapter implements Ui {

    private ThirdPartyUi thirdPartyUi;

    public UiAdapter(ThirdPartyUi thirdPartyUi) {
        this.thirdPartyUi = thirdPartyUi;
    }

    @Override
    public void changeColor(String buttonName) {
        System.out.println("change color from adapter");
    }

    @Override
    public void onEvent(String eventName, Runnable runnable) {
        System.out.println("handle eventName from adapter");

    }
}
