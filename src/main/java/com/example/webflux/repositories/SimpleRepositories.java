package com.example.webflux.repositories;

import com.example.webflux.entities.SimpleEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface SimpleRepositories extends ReactiveCrudRepository<SimpleEntity, String> {

    Flux<SimpleEntity> findAll();

}
