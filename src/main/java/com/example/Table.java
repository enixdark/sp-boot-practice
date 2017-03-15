package com.example;

import java.math.BigInteger;

/**
 * Created by cqshinn on 14/03/2017.
 */
public class Table extends BaseEntity<BigInteger> {
    private int capacity;

    public Table(String name, BigInteger id, int capacity){
        super(id,name);
        this.setCapacity(capacity);
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
