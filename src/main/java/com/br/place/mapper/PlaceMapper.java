package com.br.place.mapper;


import com.br.place.model.Place;
import com.br.place.requests.PlacePostRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class PlaceMapper {

    public static final PlaceMapper INSTANCE = Mappers.getMapper(PlaceMapper.class);

    public abstract Place toPlace(PlacePostRequestBody placePostRequestBody);
}
