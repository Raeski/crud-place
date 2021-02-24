package com.br.place.service;

import com.br.place.Repository.PlaceRepository;
import com.br.place.mapper.PlaceMapper;
import com.br.place.model.Place;
import com.br.place.requests.PlacePostRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlaceServices {


    private final PlaceRepository placeRepository;

    public List<Place> listAll() {
        return placeRepository.findAll();
    }


    public Place save(PlacePostRequestBody placePostRequestBody) {
        return placeRepository.save(PlaceMapper.INSTANCE.toPlace(placePostRequestBody));

    }

//    public void delete(long id) {
//        placeRepository.delete();
//    }






}
