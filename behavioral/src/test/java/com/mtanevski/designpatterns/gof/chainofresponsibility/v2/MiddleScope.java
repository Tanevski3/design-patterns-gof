package com.mtanevski.designpatterns.gof.chainofresponsibility.v2;

public class MiddleScope extends Scope {
    @Override
    public boolean isVariableDeclared(String variableName) {
        if("c".equals(variableName)){
            return true;
        }
        else {
            return super.isVariableDeclared(variableName);
        }
    }
}
