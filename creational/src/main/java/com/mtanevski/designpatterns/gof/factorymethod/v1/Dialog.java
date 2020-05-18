package com.mtanevski.designpatterns.gof.factorymethod.v1;

public abstract class Dialog {

    private Button okButton;

    abstract Button createButton();

    public void show(){
        okButton = createButton();

        Runnable closeDialog = () -> {
            System.out.println("closing dialog");
        };
        okButton.onClick(closeDialog);
    }
}
