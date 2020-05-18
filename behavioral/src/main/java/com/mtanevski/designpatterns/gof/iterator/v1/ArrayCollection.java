package com.mtanevski.designpatterns.gof.iterator.v1;

public class ArrayCollection<T> implements IterableCollection<T> {

    private T[] array;

    public ArrayCollection(T[] array) {
        this.array = array;
    }

    @Override
    public Iterator<T> createIterator() {
        return new ArrayIterator<>(array);
    }
}
