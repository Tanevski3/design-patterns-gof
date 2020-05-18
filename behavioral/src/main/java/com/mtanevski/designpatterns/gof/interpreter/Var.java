package com.mtanevski.designpatterns.gof.interpreter;

public class Var implements Exp {

    @Override
    public String interpret(String context) {
        String[] declaration = context.split(" ");
        if(declaration.length != 2) {
            throw new RuntimeException("Bad declaration: " + context);
        }
        Memory.store(declaration[1], null);
        return declaration[1];
    }
}
