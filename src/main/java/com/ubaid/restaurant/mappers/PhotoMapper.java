package com.ubaid.restaurant.mappers;

import com.ubaid.restaurant.domain.dtos.PhotoDto;
import com.ubaid.restaurant.domain.entities.Photo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PhotoMapper {
    PhotoDto toDto(Photo photo);
}
