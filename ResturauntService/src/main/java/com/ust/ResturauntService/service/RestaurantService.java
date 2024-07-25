package com.ust.ResturauntService.service;


import com.ust.ResturauntService.model.Restaurant;
import com.ust.ResturauntService.repo.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public Restaurant addRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    public List<Restaurant> addAllRestaurants(List<Restaurant> restaurants) {
        return restaurantRepository.saveAll(restaurants);
    }

    public List<Restaurant> findByName(String name) {
        return restaurantRepository.findByName(name);
    }

    public Optional<Restaurant> findById(Long id) {
        return restaurantRepository.findById(id);
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    public Restaurant updateRestaurant(Long id, Restaurant restaurantDetails) {
        Optional<Restaurant> optionalRestaurant = restaurantRepository.findById(id);
        if (!optionalRestaurant.isPresent()) {
            return null;
        }

        Restaurant existingRestaurant = optionalRestaurant.get();
        existingRestaurant.setName(restaurantDetails.getName());
        existingRestaurant.setAddress(restaurantDetails.getAddress());
        existingRestaurant.setCuisineType(restaurantDetails.getCuisineType());

        return restaurantRepository.save(existingRestaurant);
    }

    public void deleteRestaurant(Long id) {
        restaurantRepository.deleteById(id);
    }
}
