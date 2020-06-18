package com.github.paizo.cosmos;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CosmosDbService {

    SimpleRepository repository;

    public void save(Entity item) {
        repository.save(item);
    }

    public Optional<Entity> load(String id) {
        return repository.findById(id);
    }

}
