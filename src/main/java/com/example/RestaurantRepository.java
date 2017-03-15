package com.example;

/**
 * Created by cqshinn on 14/03/2017.
 */
public interface RestaurantRepository<Restaurant, String> extends Repository<Restaurant, String> {
    boolean ContainsName(String name);
}


