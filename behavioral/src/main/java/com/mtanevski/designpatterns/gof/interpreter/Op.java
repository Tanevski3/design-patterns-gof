package com.mtanevski.designpatterns.gof.interpreter;

public class Op implements Exp {

    private final Exp leftHand;
    private final Exp rightHand;

    public Op(Exp leftHand, Exp rightHand) {
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }

    @Override
    public String interpret(String context) {
        if (context.contains("+")) {
            String[] split = context.split("\\+");
            double left = Double.parseDouble(this.leftHand.interpret(split[0]));
            double right = Double.parseDouble(this.rightHand.interpret(split[1]));
            return String.valueOf(left + right);
        } else if (context.contains("-")) {
            String[] split = context.split("\\-");
            double left = Double.parseDouble(this.leftHand.interpret(split[0]));
            double right = Double.parseDouble(this.rightHand.interpret(split[1]));
            return String.valueOf(left - right);
        } else if (context.contains("/")) {
            String[] split = context.split("\\/");
            double left = Double.parseDouble(this.leftHand.interpret(split[0]));
            double right = Double.parseDouble(this.rightHand.interpret(split[1]));
            return String.valueOf(left / right);
        } else if (context.contains("*")) {
            String[] split = context.split("\\*");
            double left = Double.parseDouble(this.leftHand.interpret(split[0]));
            double right = Double.parseDouble(this.rightHand.interpret(split[1]));
            return String.valueOf(left * right);
        } else {
            throw new RuntimeException("Invalid operation: " + context);
        }
    }

}
