package com.example;

import java.math.BigInteger;

/**
 * Created by cqshinn on 15/03/2017.
 */
public class RestaurantService extends BaseService<Restaurant, BigInteger> {

    private RestaurantRepository<Restaurant, String> restaurantRepository;

    public RestaurantService(RestaurantRepository repository){
        super(repository);
        restaurantRepository = repository;
    }

    @Override
    public void add(Restaurant restaurant) throws Exception {
        if(restaurantRepository.ContainsName(restaurant.getName())){
            throw new Exception(String.format("There is already a product with the name - %s", restaurant.getName()));
        }

        if(restaurant.getName() == null || "".equals(restaurant.getName())){
            throw new Exception("Restaurant name cannot be null or empty string.");
        }
        super.add(restaurant);
    }


}
