package com.mtanevski.designpatterns.gof.adapter.v1;

public class BaseGame implements Game {

    private final Ui ui;

    public BaseGame(Ui ui) {
        this.ui = ui;
    }

    @Override
    public void update() {
        this.ui.changeColor("red");
        System.out.println("Update game a");
    }
}
