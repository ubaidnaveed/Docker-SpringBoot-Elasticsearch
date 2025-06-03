package com.ubaid.restaurant.services;

import com.ubaid.restaurant.domain.RestaurantCreateUpdateRequest;
import com.ubaid.restaurant.domain.entities.Restaurant;

public interface RestaurantService {
    Restaurant createRestaurant(RestaurantCreateUpdateRequest request);
}
