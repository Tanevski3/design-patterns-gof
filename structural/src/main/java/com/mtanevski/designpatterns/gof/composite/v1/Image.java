package com.mtanevski.designpatterns.gof.composite.v1;

// Leaf
public class Image implements Component {

    @Override
    public String render() {
        return "Image";
    }

}
