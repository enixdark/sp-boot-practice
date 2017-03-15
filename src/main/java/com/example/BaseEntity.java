package com.example;

/**
 * Created by cqshinn on 14/03/2017.
 */
public abstract  class BaseEntity<T> extends Entity<T> {
    private T id;

    public BaseEntity(T id, String name){
        this.setId(id);
        this.name = name;
    }


    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
