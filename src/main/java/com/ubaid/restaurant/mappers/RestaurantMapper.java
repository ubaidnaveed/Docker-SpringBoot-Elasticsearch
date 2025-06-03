package com.ubaid.restaurant.mappers;

import com.ubaid.restaurant.domain.RestaurantCreateUpdateRequest;
import com.ubaid.restaurant.domain.dtos.GeoPointDto;
import com.ubaid.restaurant.domain.dtos.RestaurantCreateUpdateRequestDto;
import com.ubaid.restaurant.domain.dtos.RestaurantDto;
import com.ubaid.restaurant.domain.entities.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.springframework.data.elasticsearch.core.geo.GeoPoint;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RestaurantMapper {
    RestaurantCreateUpdateRequest toRestaurantCreateUpdateRequest(RestaurantCreateUpdateRequestDto dto);

    RestaurantDto toRestaurantDto(Restaurant restaurant);

    @Mapping(target = "latitude", expression = "java(geoPoint.getLat())")
    @Mapping(target = "longitude", expression = "java(geoPoint.getLon())")
    GeoPointDto toGeoPointDto(GeoPoint geoPoint);
}
