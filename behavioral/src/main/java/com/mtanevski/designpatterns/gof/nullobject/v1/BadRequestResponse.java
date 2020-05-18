package com.mtanevski.designpatterns.gof.nullobject.v1;

public class BadRequestResponse implements Response {
    @Override
    public String getData() {
        return "400";
    }
}
