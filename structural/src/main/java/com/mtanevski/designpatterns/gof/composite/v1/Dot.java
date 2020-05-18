package com.mtanevski.designpatterns.gof.composite.v1;

// Leaf
public class Dot extends Image {

    @Override
    public String render() {
        return "Dot";
    }

}
