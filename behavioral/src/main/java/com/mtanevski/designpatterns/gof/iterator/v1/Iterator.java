package com.mtanevski.designpatterns.gof.iterator.v1;

public interface Iterator<T> {
    T getNext();
    boolean hasMore();
    void reset();
}
