package com.br.place.controller;

import com.br.place.service.PlaceServices;
import com.br.place.model.Place;
import com.br.place.requests.PlacePostRequestBody;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("places")
@Log4j2
@RequiredArgsConstructor
public class PlaceController {

    private final PlaceServices placeServices;


    @GetMapping
    public ResponseEntity<List<Place>> listAll(){
        return ResponseEntity.ok(placeServices.listAll());
    }

    @PostMapping
    public ResponseEntity<Place> save(@RequestBody PlacePostRequestBody placePostRequestBody) {
        return new ResponseEntity<>(placeServices.save(placePostRequestBody), HttpStatus.CREATED);
    }
}
