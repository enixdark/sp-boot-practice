package com.example;

/**
 * Created by cqshinn on 15/03/2017.
 */
public abstract class ReadOnlyBaseService<TE, T> {

    private Repository<TE, T> repository;

    ReadOnlyBaseService(Repository<TE, T> repository){
        this.repository = repository;
    }

}
