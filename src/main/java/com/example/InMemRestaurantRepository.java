package com.example;

import com.google.common.cache.CacheLoader;
import com.google.common.collect.Maps;

import java.util.Collection;
import java.util.Map;

/**
 * Created by cqshinn on 15/03/2017.
 */
public class InMemRestaurantRepository implements RestaurantRepository<Restaurant, String> {
    private Map<String, Restaurant> entities;

    public InMemRestaurantRepository(){
        entities = Maps.newConcurrentMap();
    }

    @Override
    public boolean ContainsName(String name) {
        return entities.containsKey(name);
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
        throw new UnsupportedOperationException("Not support yet");
    }

    @Override
    public Collection<Restaurant> getAll() {
        return entities.values();
    }
}
