package com.example.restaurant;

import com.example.Repository;

import java.util.Collection;

/**
 * Created by cqshinn on 14/03/2017.
 */
public interface RestaurantRepository<Restaurant, String> extends Repository<Restaurant, String> {
    boolean containsName(String name);

    Collection<Restaurant> findByName(String name) throws Exception;
}


