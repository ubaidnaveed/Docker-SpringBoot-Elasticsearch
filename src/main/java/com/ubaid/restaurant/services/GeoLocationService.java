package com.ubaid.restaurant.services;

import com.ubaid.restaurant.domain.GeoLocation;
import com.ubaid.restaurant.domain.entities.Address;

public interface GeoLocationService {
    GeoLocation geoLocate(Address address);
}
