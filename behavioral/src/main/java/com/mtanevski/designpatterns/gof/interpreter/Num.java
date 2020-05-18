package com.mtanevski.designpatterns.gof.interpreter;

public class Num implements Exp {
    private double value;

    public Num() {
    }

    @Override
    public String interpret(String context) {
        return context;
    }
}
