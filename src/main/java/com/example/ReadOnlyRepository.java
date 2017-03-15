package com.example;

import java.util.Collection;

/**
 * Created by cqshinn on 14/03/2017.
 */
public interface ReadOnlyRepository<TE, T> {
    boolean contains(T id);

    Entity get(T id);

    Collection<TE> getAll();

}
