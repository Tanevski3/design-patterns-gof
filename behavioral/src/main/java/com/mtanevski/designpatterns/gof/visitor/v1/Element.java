package com.mtanevski.designpatterns.gof.visitor.v1;

public interface Element {
    void accept(Visitor visitor);
}
