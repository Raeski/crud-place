package com.br.place.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Builder
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String city;

    private String state;

    private Date createdAt;

    private Date updatedAt;


}
