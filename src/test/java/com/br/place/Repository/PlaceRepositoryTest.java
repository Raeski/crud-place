package com.br.place.Repository;

import com.br.place.model.Place;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.format.annotation.DateTimeFormat;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@DisplayName("Tests for Place Repository")
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
class PlaceRepositoryTest {

    @Autowired
    private PlaceRepository placeRepository;

    @Test
    @DisplayName("Save persists place when Successful")
    void save_PersistPlace_WhenSuccessful(){
        Place place = createPlace();
        Place savedPlace = this.placeRepository.save(place);
        Assertions.assertThat(savedPlace).isNotNull();
        Assertions.assertThat(savedPlace.getId()).isNotNull();
        Assertions.assertThat(savedPlace.getName()).isEqualTo(place.getName());

    }

    @Test
    @DisplayName("Save creates place when Successful")
    void save_UpdatesPlace_WhenSuccessful(){
        Place place = createPlace();
        Place savedPlace = this.placeRepository.save(place);

        savedPlace.setName("Teste");

        Place placeUpdated = this.placeRepository.save(savedPlace);

        Assertions.assertThat(placeUpdated).isNotNull();
        Assertions.assertThat(placeUpdated.getId()).isNotNull();
        Assertions.assertThat(placeUpdated.getName()).isEqualTo(place.getName());

    }


    private Place createPlace() {
        return Place.builder()
                .name("Cidade nos EUA")
                .city("New York")
                .state("New York")
                .build();
    }

}