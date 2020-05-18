package com.mtanevski.designpatterns.gof.nullobject.v1;

/**
 * Unlike the other responses this one doesn't return a code. It serves as a null object, so client doesn't have to
 * handle null object as responses.
 */
public class EmptyResponse implements Response {
    @Override
    public String getData() {
        return "";
    }
}
