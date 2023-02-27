package org.training.circularbuffer;

public interface Buffer<T> {

    void put(T t);

    T get();

    Object[] toObjectArray();

}