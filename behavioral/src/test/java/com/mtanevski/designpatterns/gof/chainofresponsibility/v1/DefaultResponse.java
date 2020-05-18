package com.mtanevski.designpatterns.gof.chainofresponsibility.v1;

public class DefaultResponse implements Response {

    @Override
    public String getContent() {
        return "DefaultResponse{}";
    }
}
