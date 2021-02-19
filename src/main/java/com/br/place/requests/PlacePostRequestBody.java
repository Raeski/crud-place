package com.br.place.requests;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.Date;


@Data
public class PlacePostRequestBody {

    @NotEmpty(message = "The cite name cannot be empty")
    private String name;

    private String city;

    private String state;

    private Date createdAt;
}
