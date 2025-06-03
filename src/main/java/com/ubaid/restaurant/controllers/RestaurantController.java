package com.ubaid.restaurant.controllers;

import com.ubaid.restaurant.domain.RestaurantCreateUpdateRequest;
import com.ubaid.restaurant.domain.dtos.RestaurantCreateUpdateRequestDto;
import com.ubaid.restaurant.domain.dtos.RestaurantDto;
import com.ubaid.restaurant.domain.entities.Restaurant;
import com.ubaid.restaurant.mappers.RestaurantMapper;
import com.ubaid.restaurant.services.RestaurantService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/restaurants")
@RequiredArgsConstructor
public class RestaurantController {

    private final RestaurantService restaurantService;
    private final RestaurantMapper restaurantMapper;

    @PostMapping
    public ResponseEntity<RestaurantDto> createRestaurant(
            @Valid @RequestBody RestaurantCreateUpdateRequestDto request
            ){
        RestaurantCreateUpdateRequest restaurantCreateUpdateRequest = restaurantMapper.toRestaurantCreateUpdateRequest(request);

        Restaurant restaurant = restaurantService.createRestaurant(restaurantCreateUpdateRequest);
        RestaurantDto creatRestaurantDto = restaurantMapper.toRestaurantDto(restaurant);
        return ResponseEntity.ok(creatRestaurantDto);
    }

}
