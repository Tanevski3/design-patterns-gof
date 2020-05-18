package com.mtanevski.designpatterns.gof.iterator.v1;

public class ArrayIterator<T> implements Iterator<T> {

    private int currentPosition;
    private final T[] array;

    public ArrayIterator(T[] array){
        this.array = array;
    }

    @Override
    public T getNext() {
        if(this.currentPosition > this.array.length - 1){
            return null;
        }
        return this.array[this.currentPosition++];
    }

    @Override
    public boolean hasMore() {
        return !(this.currentPosition > this.array.length - 1);
    }

    @Override
    public void reset() {
        this.currentPosition = 0;
    }
}
