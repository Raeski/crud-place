package com.br.place.controller;

import com.br.place.service.PlaceServices;
import com.br.place.model.Place;
import com.br.place.requests.PlacePostRequestBody;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("places")
@Log4j2
@RequiredArgsConstructor
public class PlaceController {

    private final PlaceServices placeServices;



    @PostMapping
    public ResponseEntity<Place> save(@RequestBody PlacePostRequestBody placePostRequestBody) {
        return new ResponseEntity<>(placeServices.save(placePostRequestBody), HttpStatus.CREATED);
    }
}
