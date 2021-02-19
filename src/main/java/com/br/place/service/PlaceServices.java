package com.br.place.service;

import com.br.place.Repository.PlaceRepository;
import com.br.place.mapper.PlaceMapper;
import com.br.place.model.Place;
import com.br.place.requests.PlacePostRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlaceServices {


    private final PlaceRepository placeRepository;



    public Place save(PlacePostRequestBody placePostRequestBody) {
        return placeRepository.save(PlaceMapper.INSTANCE.toPlace(placePostRequestBody));

    }




}
