package com.example.webflux.controllers;

import com.example.webflux.entities.SimpleEntity;
import com.example.webflux.repositories.SimpleRepositories;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@CrossOrigin
public class WebFluxController {

    @Autowired
    private SimpleRepositories repo;

    @GetMapping(produces = "text/event-stream")
    public Flux<SimpleEntity> getAllSimples() {
        return repo.findAll();
    }

    @PostMapping(produces = "application/json")
    public Mono<SimpleEntity> createSimples(@RequestBody SimpleEntity simples) {
        log.info(simples.toString());
        return repo.save(simples);
    }
}
