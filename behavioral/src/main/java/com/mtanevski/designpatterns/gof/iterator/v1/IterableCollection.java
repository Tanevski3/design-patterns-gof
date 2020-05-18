package com.mtanevski.designpatterns.gof.iterator.v1;

public interface IterableCollection<T> {
    Iterator<T> createIterator();
}
