package com.example;

/**
 * Created by cqshinn on 14/03/2017.
 */
public interface Repository<TE, T> extends ReadOnlyRepository<TE, T> {

    void add(TE entity);

    void remove(T id);

    void update(TE entity);

}
