package com.example;

import java.util.Collection;

/**
 * Created by cqshinn on 15/03/2017.
 */
public class BaseService<TE, T> extends ReadOnlyBaseService<TE, T> {

    private Repository<TE, T> _repository;

    public BaseService(Repository<TE, T> repository){
        super(repository);
        _repository = repository;
    }

    public void add(TE entity) throws Exception {
        _repository.add(entity);
    }

    public Collection<TE> getAll(){
        return _repository.getAll();
    }
}
