package com.mtanevski.designpatterns.gof.command.v1;

public class Receiver {
    private String context = "";

    public void addString(String stringToAdd) {
        this.context += stringToAdd;
    }

    public void removeString(String stringToRemove) {
        this.context.replaceFirst(stringToRemove, "");
    }
}
