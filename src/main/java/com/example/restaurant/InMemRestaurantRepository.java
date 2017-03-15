package com.example.restaurant;

import com.example.Entity;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Map;

/**
 * Created by cqshinn on 15/03/2017.
 */
@Repository("restaurantRepository")
public class InMemRestaurantRepository
        implements RestaurantRepository<Restaurant, String> {
    private Map<String, Restaurant> entities;

    public InMemRestaurantRepository(){
        entities = Maps.newConcurrentMap();
        Restaurant restaurant = new Restaurant("Big-O Restaurant", "1", null);
        entities.put("1", restaurant);
        restaurant = new Restaurant("o Restaurant", "2", null);
        entities.put("2", restaurant);
    }

    @Override
    public boolean containsName(String name) {
        try {
            return this.findByName(name).size() > 0;
        } catch (Exception ex) {
            //Exception Handler
        }
        return false;
    }

    @Override
    public Collection<Restaurant> findByName(String name) throws Exception {
        Collection<Restaurant> restaurants = Lists.newArrayList();
        int noOfChar = name.length();

        entities.forEach( (k, v) -> {
            if(v.getName().toLowerCase().contains(name.subSequence(0, noOfChar))){
                restaurants.add(v);
            }
        });
        return restaurants;
    }

    @Override
    public void add(Restaurant entity) {
        entities.put(entity.getName(), entity);
    }

    @Override
    public void remove(String id) {
        if ( entities.containsKey(id) ) {
            entities.remove(id);
        }
    }

    @Override
    public void update(Restaurant entity) {
        if ( entities.containsKey(entity.getName())){
            entities.put(entity.getName(), entity);
        }
    }

    @Override
    public boolean contains(String id) {

        throw new UnsupportedOperationException("Not support yet");
    }

    @Override
    public Entity get(String id) {
        return entities.get(id);
    }

    @Override
    public Collection<Restaurant> getAll() {
        return entities.values();
    }
}
