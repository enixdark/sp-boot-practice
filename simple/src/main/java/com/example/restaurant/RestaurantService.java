package com.example.restaurant;

import com.example.BaseService;
import com.example.Entity;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/**
 * Created by cqshinn on 15/03/2017.
 */
public interface RestaurantService {

//    private RestaurantRepository<Restaurant, String> restaurantRepository;
//
//    public RestaurantService(RestaurantRepository repository){
//        super(repository);
//        restaurantRepository = repository;
//    }
//
//    @Override
//    public void add(Restaurant restaurant) throws Exception {
//        if(restaurantRepository.ContainsName(restaurant.getName())){
//            throw new Exception(String.format("There is already a product with the name - %s", restaurant.getName()));
//        }
//
//        if(restaurant.getName() == null || "".equals(restaurant.getName())){
//            throw new Exception("Restaurant name cannot be null or empty string.");
//        }
//        super.add(restaurant);
//    }

    public void add(Restaurant restaurant) throws Exception;

    public void update(Restaurant restaurant) throws Exception;

    public void delete(String id) throws Exception;

    public Entity findById(String restaurantId) throws Exception;

    public Collection<Restaurant> findByName(String name) throws Exception;

    public Collection<Restaurant> findByCriteria(Map<String, ArrayList<String>> name)
            throws Exception;



}
