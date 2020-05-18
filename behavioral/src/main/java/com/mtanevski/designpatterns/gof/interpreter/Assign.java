package com.mtanevski.designpatterns.gof.interpreter;

public class Assign implements Exp {
    private final Exp leftHandExp;
    private final Exp rightHandExp;

    public Assign(Exp leftHandExp, Exp rightHandExp) {
        this.leftHandExp = leftHandExp;
        this.rightHandExp = rightHandExp;
    }

    @Override
    public String interpret(String context) {
        String[] split = context.split("=");
        String key = this.leftHandExp.interpret(split[0]);
        String value = this.rightHandExp.interpret(split[1]);
        Memory.store(key, value);
        return value;
    }
}
