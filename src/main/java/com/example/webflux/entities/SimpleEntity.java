package com.example.webflux.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class SimpleEntity {

    @Id
    private Long id;
    private String name;

}
