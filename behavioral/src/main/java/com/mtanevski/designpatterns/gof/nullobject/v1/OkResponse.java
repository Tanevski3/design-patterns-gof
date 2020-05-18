package com.mtanevski.designpatterns.gof.nullobject.v1;

public class OkResponse implements Response {
    @Override
    public String getData() {
        return "200";
    }
}
