package com.mtanevski.designpatterns.gof.interpreter;

public class Interpreter {
    public static String interpret(String expression) {
        Exp varA = new Var();
        Exp fiveNumber = new Num();
        Exp twoNumber = new Num();
        Exp addOp = new Op(fiveNumber, twoNumber);
        return new Assign(varA, addOp).interpret(expression);
    }
}
