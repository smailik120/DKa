package com.company;

import java.util.Objects;

public class Pair<T,E> {
    private T firt;
    private E second;

    public Pair(T first,E second){
        this.firt=first;
        this.second=second;
    }

    public T getFirt() {
        return firt;

    }
    public E getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(firt, pair.firt) &&
                Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firt, second);
    }
}
