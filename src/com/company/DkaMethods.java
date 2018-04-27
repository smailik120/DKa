package com.company;

import java.util.Collection;

public interface DkaMethods<T> {
    public Collection<T> action(final Iterable<T> request) throws DkaException;
}
